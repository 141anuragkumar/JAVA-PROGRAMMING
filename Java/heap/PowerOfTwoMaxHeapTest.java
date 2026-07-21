//ye code sirf samjhane ke lea use hai ki code kaise work ker rha hai
package heap;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Random;
public class PowerOfTwoMaxHeapTest {
    


    public static void main(String[] args) {
        testBasicOrdering();
        testSmallestExponentZero();     // 2^0 = 1 child per node (degenerate chain)
        testLargeExponent();            // 2^20 children per node (very flat tree)
        testEmptyHeapThrows();
        testSingleElement();
        testDuplicateValues();
        testRandomStressAgainstSort(0);
        testRandomStressAgainstSort(1);
        testRandomStressAgainstSort(3);
        testRandomStressAgainstSort(10);
        testInvalidExponentThrows();

        System.out.println("\nAll tests passed.");
    }

    // ------------------------------------------------------------------

    static void testBasicOrdering() {
        System.out.println("=== testBasicOrdering (exponent=2, 4 children/node) ===");
        PowerOfTwoMaxHeap heap = new PowerOfTwoMaxHeap(2);
        int[] values = {5, 20, 1, 9, 15, 30, 2, 8};
        for (int v : values) heap.insert(v);

        int[] expected = values.clone();
        Arrays.sort(expected);
        for (int i = expected.length - 1; i >= 0; i--) {
            int popped = heap.popMax();
            assertEquals(expected[i], popped, "basic ordering");
        }
        assertTrue(heap.isEmpty(), "heap should be empty after popping everything");
        System.out.println("passed.\n");
    }

    static void testSmallestExponentZero() {
        System.out.println("=== testSmallestExponentZero (exponent=0, 1 child/node = chain) ===");
        // With 1 child per parent, the heap degenerates into a linked chain.
        // Correctness must still hold, even though performance is O(n) per op.
        PowerOfTwoMaxHeap heap = new PowerOfTwoMaxHeap(0);
        int[] values = {3, 1, 4, 1, 5, 9, 2, 6};
        for (int v : values) heap.insert(v);

        int[] expected = values.clone();
        Arrays.sort(expected);
        for (int i = expected.length - 1; i >= 0; i--) {
            assertEquals(expected[i], heap.popMax(), "exponent=0 chain ordering");
        }
        System.out.println("passed.\n");
    }

    static void testLargeExponent() {
        System.out.println("=== testLargeExponent (exponent=20, ~1,048,576 children/node) ===");
        // With such a huge branching factor, a modest number of elements
        // all fit as direct children of the root -- the tree is only 1-2
        // levels deep. Correctness must still hold.
        PowerOfTwoMaxHeap heap = new PowerOfTwoMaxHeap(20);
        Random rnd = new Random(123);
        int n = 5000;
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = rnd.nextInt(200000) - 100000;
            heap.insert(values[i]);
        }
        int[] expected = values.clone();
        Arrays.sort(expected);
        for (int i = n - 1; i >= 0; i--) {
            assertEquals(expected[i], heap.popMax(), "large exponent ordering");
        }
        System.out.println("passed.\n");
    }

    static void testEmptyHeapThrows() {
        System.out.println("=== testEmptyHeapThrows ===");
        PowerOfTwoMaxHeap heap = new PowerOfTwoMaxHeap(1);
        boolean threwOnPop = false, threwOnPeek = false;
        try {
            heap.popMax();
        } catch (NoSuchElementException e) {
            threwOnPop = true;
        }
        try {
            heap.peekMax();
        } catch (NoSuchElementException e) {
            threwOnPeek = true;
        }
        assertTrue(threwOnPop, "popMax on empty heap should throw");
        assertTrue(threwOnPeek, "peekMax on empty heap should throw");
        System.out.println("passed.\n");
    }

    static void testSingleElement() {
        System.out.println("=== testSingleElement ===");
        PowerOfTwoMaxHeap heap = new PowerOfTwoMaxHeap(3);
        heap.insert(42);
        assertEquals(42, heap.peekMax(), "single element peek");
        assertEquals(42, heap.popMax(), "single element pop");
        assertTrue(heap.isEmpty(), "heap empty after popping only element");
        System.out.println("passed.\n");
    }

    static void testDuplicateValues() {
        System.out.println("=== testDuplicateValues ===");
        PowerOfTwoMaxHeap heap = new PowerOfTwoMaxHeap(2);
        int[] values = {7, 7, 7, 3, 7, 3};
        for (int v : values) heap.insert(v);
        int[] expected = values.clone();
        Arrays.sort(expected);
        for (int i = expected.length - 1; i >= 0; i--) {
            assertEquals(expected[i], heap.popMax(), "duplicate values ordering");
        }
        System.out.println("passed.\n");
    }

    static void testRandomStressAgainstSort(int exponent) {
        System.out.println("=== testRandomStressAgainstSort (exponent=" + exponent + ") ===");
        Random rnd = new Random(7 + exponent);
        for (int trial = 0; trial < 15; trial++) {
            int n = rnd.nextInt(2000) + 1;
            int[] values = new int[n];
            PowerOfTwoMaxHeap heap = new PowerOfTwoMaxHeap(exponent);
            for (int i = 0; i < n; i++) {
                values[i] = rnd.nextInt(400001) - 200000;
                heap.insert(values[i]);
            }
            int[] expected = values.clone();
            Arrays.sort(expected);
            for (int i = n - 1; i >= 0; i--) {
                int popped = heap.popMax();
                if (popped != expected[i]) {
                    throw new AssertionError("Mismatch trial " + trial + " exponent " + exponent
                        + ": expected " + expected[i] + " got " + popped);
                }
            }
        }
        System.out.println("15 randomized trials passed.\n");
    }

    static void testInvalidExponentThrows() {
        System.out.println("=== testInvalidExponentThrows ===");
        boolean threwNegative = false, threwTooLarge = false;
        try {
            new PowerOfTwoMaxHeap(-1);
        } catch (IllegalArgumentException e) {
            threwNegative = true;
        }
        try {
            new PowerOfTwoMaxHeap(31);
        } catch (IllegalArgumentException e) {
            threwTooLarge = true;
        }
        assertTrue(threwNegative, "negative exponent should throw");
        assertTrue(threwTooLarge, "exponent 31 should throw (would overflow int)");
        System.out.println("passed.\n");
    }

    // ------------------------------------------------------------------

    static void assertEquals(int expected, int actual, String msg) {
        if (expected != actual) {
            throw new AssertionError(msg + ": expected " + expected + " but got " + actual);
        }
    }

    static void assertTrue(boolean condition, String msg) {
        if (!condition) {
            throw new AssertionError(msg);
        }
    }
}