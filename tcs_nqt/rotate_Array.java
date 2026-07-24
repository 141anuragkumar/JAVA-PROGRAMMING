package tcs_nqt;

public class rotate_Array {
    // static void reverse(int[] arr, int start,int end){
    //     while(start < end) {
    //         int temp = arr[start];
    //         arr[start] = arr[end];
    //         arr[end] = temp;

    //         start++;
    //         end--;
            
    //     }
    // }
    // public static void main(String[] args) {
    //     int[] arr = {1,2,3,4,5,6,7,8};
    //     int k= 4;

    //     int n = arr.length;
    //     k=k%n;

    //     reverse(arr,0,n-1);
    //     reverse(arr,0,k-1);
    //     reverse(arr,k,n-1);

    //     for(int num : arr){
    //         System.out.print(num+ " ");
    //     }
        
    // }
    static void reverse(int[] arr,int start,int end){
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
            
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
    int k = 5;
    int n = arr.length;
    k = k % n;

    reverse(arr,0,n-1);
    reverse(arr,0,k-1);
    reverse(arr,0,n-1); 
    
    for(int num : arr){
        System.out.print(num+" ");
    }
    }



}
