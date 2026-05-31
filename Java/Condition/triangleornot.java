package Condition;
import java.util.Scanner;
public class triangleornot {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter A side =");
        int a= sc.nextInt();
        System.out.print("Enter B side =");
        int b= sc.nextInt();
        System.out.print("Enter C side =");
        int c= sc.nextInt();
        if (a+b>c && b+c>a && c+a>b)
        {
            System.out.println("Triangle is possible");   
        }
        else
        {
            System.out.println("Triangle is not possible");
        }
        sc.close();
    }

}
