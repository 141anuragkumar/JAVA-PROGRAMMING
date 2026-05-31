package Condition;
import java.util.Scanner;
public class squareornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the length =");
        int length = sc.nextInt();
        System.out.print("Ente the bredth =");
        int bredth = sc.nextInt();
        if(length == bredth)
        {
            System.out.println("The rectangle is square");
        }
        else
        {
            System.out.println("the rectangle is not square");
        }
        sc.close();
    }

}
