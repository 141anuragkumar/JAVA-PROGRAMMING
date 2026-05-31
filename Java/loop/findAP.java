package loop;

import java.util.Scanner;

//import java.util.Scanner;
public class findAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Ap then you want to find =");
         int n=sc.nextInt();
        // for(int i=1;i<=2*a-1;i+=2)
        // {
        //         System.out.println(i+" ");
        // }
        // sc.close();

        int a=3, d=4; //other way to find Ap
        for(int i=1;i<=n;i++)
        {
            System.out.println(a+" ");
            a+=d; 
        }
        sc.close();
    }
    


}
