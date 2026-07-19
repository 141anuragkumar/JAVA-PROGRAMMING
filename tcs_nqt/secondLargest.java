package tcs_nqt;

public class secondLargest {
    public static void main(String[] args) {
        int[] sl = {12,19,52,12,17};

    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;

    for(int i=0;i<sl.length;i++){
        if(sl[i] > largest){
            secondLargest = largest;
            largest = sl[i];
        }
        else if(sl[i] > secondLargest && sl[i] != largest){
            secondLargest = sl[i];
        }
        
    }
    System.out.println("Largest : "+largest);
    System.out.print("SecondLargest : "+secondLargest);
    }
    
    
}
