package Pattern;
import java.util.Scanner;
public class numpattern 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter digit a =");
        int a = sc.nextInt();
        System.out.print("Enter digit b =");
        int b = sc.nextInt();

        int i;
        int j;
        for(i=1;i<=a;i++)
        {
            for(j=1;j<=b;j++)
            {
                System.out.print(j+" ");
               
            }
            System.out.println();
        }
        sc.close();
    }
   

}
