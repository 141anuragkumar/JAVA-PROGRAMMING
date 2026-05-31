package javainput;
import java.util.Scanner;
public class addition 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number is:");
        int a = sc.nextInt();
        System.out.println("Enter the second number is:");
        int b = sc.nextInt();
        int c=a+b;
        System.out.println("your solution is :"+c);
        sc.close();
       
    }

}
