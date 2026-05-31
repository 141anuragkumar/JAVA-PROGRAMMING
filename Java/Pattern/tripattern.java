package Pattern;
import java.util.Scanner;
public class tripattern {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter digit =");
        int a=sc.nextInt();
        //if you want to print number in serial wise then this algo
        // for(int i=1;i<=a;i++)
        // {
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print(+j);
        //     }
        //     System.out.println();
        // }


        //if you want to print number in same digit in triangle form then this algo
        
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+"");
            }
            System.out.println();
        }


//if you want to print character series in triangle form then use this algo
        // for(int i=1;i<=a;i++)
        // {
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print((char)(j+64)+" ");
        //     }
        //     System.out.println();
        // }
       }

}
