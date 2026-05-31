package Pattern;
import java.util.Scanner;
public class trianglereverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter digit =");
        int a = sc.nextInt();
        int i;
        int j;
        for(i=1;i<=a;i++)
        {
            for(j=1;j<=i;j++)
            // {
            //     if(i+j>a)
            //     {
            //         System.out.print(" * ");
            //     }
            //     else
            //     {
            //         System.out.print(" + ");
            //     }
            // }
            // System.out.println();


            // star triangle with + AND - OR WITH Special character and symbol 
            // {
            //     System.out.print(" * ");
            // }
            // for(int k=5;k>=i;k--)
            // {
            //     System.out.print(" - ");
            // }
            // System.out.println();




            // //stat triangle with 2 combination symbol and numeric
            // {
            //     System.out.print(j+"  ");
            // }
            // for(int k=5;k>=i;k--)
            // {
            //     System.out.print(" + ");
            // }
            // System.out.println();



            //stat triangle with 2 combination symbol and alphabets
            {
                System.out.print((char)(j+64)+"  "); //we can only change (char)(j+64)+ at the place of j+
            }
            for(int k=5;k>=i;k--)
            {
                System.out.print(" + ");
            }
            System.out.println();
        }
        
    }

}
