package tcs_nqt;
public class equalSum {
    // Hume check karna hai ki kisi ek index par array ko do parts mein 
    // divide karne par left side ka sum aur right side ka sum equal hai ya fir nahi

    // Exp :- 1   2   3   3

//            1 + 2      |      3

//            3          |      3

public static void main(String[] args) {
    int[] arr = {1,2,3,6};

    int totalSum = 0;

    for(int num : arr){
        totalSum += num;
    }
    
    int leftSum = 0;
    for(int i= 0;i<arr.length;i++){
        int rightSum = totalSum - leftSum - arr[i];

        if(leftSum == rightSum){
            System.out.println("Equal sum found at index "+i);
            return;
        }
        leftSum += arr[i];
        

    }
    System.out.println("No Equal sum at index");

}
}
