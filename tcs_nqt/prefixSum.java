package tcs_nqt;

public class prefixSum {
    public static void main(String[] args) {
        
    //     int[] arr = {1,2,3,4,5,6}; //Expected 1,3,6,10,15,21

    //     int n = arr.length;
    //     int[] prefix = new int[n];
         
    //     prefix[0] = arr[0];

    //     for(int i = 1 ; i < n ; i++){
    //         prefix[i] = prefix[i-1] + arr[i];

    //     }
    //     System.out.println("Prefix array");

    //     for(int num : prefix){
    //         System.out.print(num + " ");
    //     }



    int[] arr = {2,4,6,8,10,12}; //Expected 2,6,12,20,30,42

    int n = arr.length;
     
    int[] prefix = new int[n];

    prefix[0] = arr[0];

    for(int i = 1;i<n;i++){
        prefix[i] = prefix[i-1] + arr[i];
    }
    System.out.println("prefix array");

    for(int num : prefix){
        System.out.print(num + " ");
    }
    }
}
