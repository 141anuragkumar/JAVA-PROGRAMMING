package tcs_nqt;

public class shorted_or_not {
    public static void main(String[] args) {
        int[] number = {2,4,6,8,10};

        boolean isShorted = true; //maan lo ki array pahale se hi sorted hai ye code ko choota karne me help karega
        
        for(int i=0;i<number.length -1;i++){
            if(number[i] > number[i+1]){
                isShorted = false;
                break;
            }
            
        }
        if(isShorted){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is unsorted");
        }
        
    }
}
