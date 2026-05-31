package Practice.java;
import java.util.Scanner;
public class Addition{} {
    public static void main(String[] args) {
        //perform Addition
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of A= ");
        int a=sc.nextInt();
        System.out.print("Enter the value of B= ");
        int b=sc.nextInt();
        int c;
        c = a + b ;
        System.out.println("Your Answer is= "+c);
        if(c%2==0)
        {
            System.out.println("even ");
        }
        else
        {
            System.out.println("odd");
        }
        sc.close();
    }
    
}
