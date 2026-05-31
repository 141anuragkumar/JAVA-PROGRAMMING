package Pattern;
import java.util.Scanner;
public class Starsquarepattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows =");
        int row=sc.nextInt();
        System.out.print("Enter Columns =");
        int columns=sc.nextInt();
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=columns;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
       
    }

}
