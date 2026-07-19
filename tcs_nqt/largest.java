package tcs_nqt;

public class largest {
    public static void main(String[] args) {
        int[] number = {1,2,3,4,5}; //expected output is "5"
        int largest = number[0];
        for(int i=0;i<number.length;i++){
            if(number[i] > largest){
                largest = number[i];
            }
        }
        System.out.println("Largest : "+largest);
    }
}
