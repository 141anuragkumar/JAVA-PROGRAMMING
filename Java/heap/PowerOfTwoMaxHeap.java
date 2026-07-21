package heap;
import java.util.Arrays;
import java.util.NoSuchElementException;
// import java.util.*;
public class PowerOfTwoMaxHeap {

/**
 * A "power of two max heap": a generalization of the classic binary max-heap
 * where every internal node has 2^branchingExponent children instead of 2.
 *
 * Backed by a flat array (no pointers/objects per node), exactly like a
 * standard array-based binary heap, so it has excellent cache locality and
 * no per-node allocation overhead.
 *
 * For a node at index i (0-based):
 *   - its first child is at index  (i << branchingExponent) + 1
 *   - its parent is at index       (i - 1) >> branchingExponent
 *
 * Because the branching factor is always a power of two, both of these can
 * be computed with a single bit-shift instead of a division/multiplication,
 * which is why this structure stays fast even for large branching factors.
 */

    private static final int DEFAULT_CAPACITY = 16;
    // Java can't safely compute 1 << 31 or higher as a positive int, and
    // realistically nobody needs a node with over a billion children, so we
    // cap the exponent to keep 1 << branchingExponent a valid positive int.
    private static final int MAX_BRANCHING_EXPONENT = 30;

    private int[] heap;
    private int size;

    // Renamed from "x" to something self-documenting: this is the exponent
    // in "each node has 2^branchingExponent children".
    private final int branchingExponent;
    // Precomputed 2^branchingExponent, i.e. how many children each parent has.
    private final int childrenPerParent;

    public PowerOfTwoMaxHeap(int branchingExponent) {
        if (branchingExponent < 0 || branchingExponent > MAX_BRANCHING_EXPONENT) {
            throw new IllegalArgumentException(
                "branchingExponent must be between 0 and " + MAX_BRANCHING_EXPONENT
                + " (got " + branchingExponent + ")");
        }
        this.branchingExponent = branchingExponent;
        this.childrenPerParent = 1 << branchingExponent;
        this.heap = new int[DEFAULT_CAPACITY];
        this.size = 0;
    }

    /** Number of elements currently in the heap. */
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    /** Look at the max value without removing it. O(1). */
    public int peekMax() {
        if (size == 0) {
            throw new NoSuchElementException("peekMax() called on empty heap");
        }
        return heap[0];
    }

    /**
     * Insert a value into the heap. Amortized O(log_b n), where b is the
     * branching factor (2^branchingExponent).
     */
    public void insert(int value) {
        ensureCapacity(size + 1);
        heap[size] = value;
        siftUp(size);
        size++;
    }

    /**
     * Remove and return the maximum value. O(b * log_b n) worst case, since
     * each level of sift-down compares against up to b children.
     */
    public int popMax() {
        if (size == 0) {
            throw new NoSuchElementException("popMax() called on empty heap");
        }
        int max = heap[0];
        size--;
        if (size > 0) {
            heap[0] = heap[size];
            siftDown(0);
        }
        // Not strictly necessary, but avoids holding a stale reference to
        // the last logical slot (matters more for object heaps than ints,
        // included here for good hygiene/consistency).
        heap[size] = 0;
        return max;
    }

    // ----------------------------------------------------------------
    // Internal helpers
    // ----------------------------------------------------------------

    private void siftUp(int index) {
        int value = heap[index];
        while (index > 0) {
            int parentIndex = (index - 1) >> branchingExponent;
            int parentValue = heap[parentIndex];
            if (value <= parentValue) {
                break;
            }
            heap[index] = parentValue;
            index = parentIndex;
        }
        heap[index] = value;
    }

    private void siftDown(int index) {
        int value = heap[index];
        while (true) {
            // Compute in long first: with a large branchingExponent,
            // (index << branchingExponent) can overflow a 32-bit int even
            // for small indices, wrapping around to a negative number.
            // Since we only care whether this exceeds `size` (an int),
            // clamp the long result before narrowing back to int.
            long firstChildLong = ((long) index << branchingExponent) + 1;
            if (firstChildLong >= size) {
                break; // leaf node (or would-be child index is out of range)
            }
            int firstChild = (int) firstChildLong;
            int lastChild = Math.min(firstChild + childrenPerParent - 1, size - 1);

            int largestChildIndex = firstChild;
            int largestChildValue = heap[firstChild];
            for (int c = firstChild + 1; c <= lastChild; c++) {
                if (heap[c] > largestChildValue) {
                    largestChildValue = heap[c];
                    largestChildIndex = c;
                }
            }

            if (value >= largestChildValue) {
                break;
            }
            heap[index] = largestChildValue;
            index = largestChildIndex;
        }
        heap[index] = value;
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity <= heap.length) {
            return;
        }
        int newCapacity = heap.length * 2;
        while (newCapacity < minCapacity) {
            newCapacity *= 2;
        }
        heap = Arrays.copyOf(heap, newCapacity);
    }

    /** Exposed mainly for tests/debugging. */
    int getBranchingExponent() {
        return branchingExponent;
    }
}