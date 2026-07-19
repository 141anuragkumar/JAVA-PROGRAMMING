package tcs_nqt;

public class meanof_Array {
    public static void main(String[] args) {
        int[] number = {2,4,6,8,10}; //expected "6"
        int sum = 0;
        for(int i=0;i<number.length;i++){
            sum +=number[i];
        }
        Double mean = (double)sum / number.length;
        System.out.println("Mean of an Aarray is : "+mean);
    }
}
