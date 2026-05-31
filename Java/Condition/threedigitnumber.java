package Condition;
import java.util.Scanner;
public class threedigitnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number=");
        int num = sc.nextInt();
        if(num>99 && num<1000)
        {
            System.out.println("the number is three digit");
        }
        else
        {
            System.out.println("the number is not three digit");
        }
        sc.close();
    }

}
