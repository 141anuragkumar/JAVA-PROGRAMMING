package Pattern;
import java.util.Scanner;
public class trianglepattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number thats you want to prints in triangle pattern =");
        int a =sc.nextInt();
        int i;
        int j;
        for(i=1;i<=a;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            // for(int k=5;k>=i;k--)
            // {
            //     System.out.print(" ");
            // }
            // for(int l=5;l>=i;l--)
            // {
            //     System.out.print(" ");
            // }
            // for(int m=1;m<=i;m++)
            // {
            //     System.out.print("*");
            // }
            System.out.println();
            
        }
        sc.close();


    }

}
