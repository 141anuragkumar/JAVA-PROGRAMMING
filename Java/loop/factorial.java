package loop;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter factorial number =");
        int n =sc.nextInt();
        int fact=1;
        int i;
        for(i=1;i<=n;i++)
        {
            fact=(fact*i);
           
        }
        System.out.println(fact);
       
        
    }

}
