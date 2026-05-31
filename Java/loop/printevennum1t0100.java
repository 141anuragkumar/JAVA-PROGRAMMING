package loop;
import java.util.Scanner;
public class printevennum1t0100 {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter even number A =");
        int A;
        int i=sc.nextInt();
        A=100/2;
        for(i=0;i<=A;i++)
        {
            System.out.println(A);
        }
        sc.close();

    }
}
