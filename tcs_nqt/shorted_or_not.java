package tcs_nqt;

public class shorted_or_not {
    public static void main(String[] args) {
        int[] number = {2,4,6,8,10};

        boolean isSorted = true;

        for(int i=0;i<number.length-1;i++){
            if(number[i] > number[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }

    }
}
