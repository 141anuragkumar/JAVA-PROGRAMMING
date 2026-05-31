package Condition;
import java.util.Scanner;
public class twodignum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num =sc.nextInt();
        if(num>9 && num<100)
        {
            System.out.println("the number is two digit");
        }
        else
        {
            System.out.println("the number is not two digit");
        }
        sc.close();
    }

}
