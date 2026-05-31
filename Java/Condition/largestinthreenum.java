package Condition;
import java.util.Scanner;
public class largestinthreenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number =");
        int A =sc.nextInt();
        System.out.print("Enter the first number =");
        int B =sc.nextInt();
        System.out.print("Enter the first number =");
        int C =sc.nextInt();
        if (A>B && A>C) 
        {
            System.out.println("A is largest");
        }
        else if (B>A && B>C) 
        {
            System.out.println("B is largest");
        }
        else if (C>A && C>B) 
        {
            System.out.println("C is largest");
        }
        sc.close();
    }
   

}
