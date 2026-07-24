package tcs_nqt;

public class array_subset {
    static boolean isSubset(int[] arr1,int[] arr2){
        for (int i = 0; i < arr2.length; i++) {
            boolean found = false;

            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] == arr2[i]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return false;
            }
        }
        return true;
    }
        public static void main(String[] args){
            int[] arr1 = {11,1,13,21,9,7};  
            int[] arr2 = {11,1,7,9};

            if(isSubset(arr1, arr2))
                System.out.println("yes, it is the subset of array");
            else
                System.out.println("No, it is not the subset of the array");
    
    }


}