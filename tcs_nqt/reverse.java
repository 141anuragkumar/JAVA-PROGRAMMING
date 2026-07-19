package tcs_nqt;

public class reverse {
      public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        for(int i=0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        for(int num : arr){
            System.out.print(num +" ");

        } 
      }
}
