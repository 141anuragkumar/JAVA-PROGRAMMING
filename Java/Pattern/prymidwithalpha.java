package Pattern;

import java.util.Scanner;

public class prymidwithalpha {
   public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);//prymid with alphabets
        System.out.print("Enter n =");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            
            for(int k=1;k<=2*i-1;k++)
            {
                System.out.print("  ");//something went wrong
            }
            for(int j=1;j<=n-1;j++)
            {
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
}
