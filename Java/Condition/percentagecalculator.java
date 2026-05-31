package Condition;
import java.util.Scanner;
public class percentagecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks of the student A =");
        int A = sc.nextInt();
        if(A>90)
        {
            System.out.println("topper");
            System.out.println("First");
        }
        else if(A>70)
        {
            System.out.println("Second");
        }
        else if(A>50)
        {
            System.out.println("Third");
        }
        else if(A>21)
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("fail");
        }
        sc.close();
    }


}
