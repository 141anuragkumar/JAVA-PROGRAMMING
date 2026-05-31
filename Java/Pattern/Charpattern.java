package Pattern;
import java.util.Scanner;
public class Charpattern {
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter digits =");
        int a =sc.nextInt();
        // for(int i=1;i<=a;i++)
        // {
        //     for(int j=1;j<=a;j++)
        //     {
        //         System.out.print((char)(j+64)+" "); //if we are printing ASCII value in capita letter then use this 
        //     }
        //     System.out.println();
        // }
        // for(int i=1;i<=a;i++)
        // {
        //     for(int j=1;j1<=a;j++)
        //     {
        //         System.out.print((char)(j+96)+" ");////if we are printing ASCII value in Small letter the usen this 
        //     }
        //     System.out.println();
        // }
        for(int i=0;i<=a;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.println("*");
            }
        }
        
    }
    system.out.println();

}

