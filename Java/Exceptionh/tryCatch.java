package Exceptionh;
import java.util.Scanner;
 //81th video of code with harry
public class tryCatch {
    
    public static void main(String[] args) {
    // int a=10;
    // int b = 0;
    

    // try{
    //     int c= a/b;
    //     System.out.println(c);
    // }
    // catch(Exception e){
    //     System.out.println("Please check an Exceptio and correct it");
    //     System.out.println(e);
    // }
    
    // System.out.println("End of the program");
    


// --------------without trycatch--------------

    // int c = a / b;
    // System.out.println(c);


// ----------------------------------------Problems--------------------------------------- 
Scanner sc = new Scanner(System.in);    
int[] marks = new int[3];
    
    marks[0] = 6;
    marks[1] = 44;
    marks[2] = 12;

    
    System.out.print("Enter  the index number : ");
    int ind = sc.nextInt();

    System.out.print("Enter the number whose you want to divide index : ");
    int div = sc.nextInt();

    try{
        System.out.println("the value at array index entered is "+marks[ind]);
        System.out.println("The value of array - value/divide is "+marks[ind]/div);
    }
    catch(ArithmeticException e)
    {
        System.out.println("Arithmetic Exception occured!");
        System.out.println(e);
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
        System.out.println("Array Index Out Of Bounds Exception accured!");
        System.out.println(e);
    }
    catch(Exception e)
    {
        System.out.println("Exception occured!");
        System.out.println(e);
    }


}
}
