package tcs_nqt;

import java.util.LinkedHashSet;
import java.util.Set;

public class Duplicate {
    public static void main(String[] args) {
        int[] arr = {2,4,2,6,8,2,10};
        // using "LinkedHashSet" data structure to remove duplicate
        Set<Integer> set = new LinkedHashSet<>();
        for(int num : arr){
            set.add(num); //to store unique value ,agar koe duplicate value hoti hai to ye use ignore ker deta hai
        }
        for(int num : set){
            System.out.print(num + " ");
        }
    }
}
