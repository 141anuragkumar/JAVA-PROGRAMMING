package loop;
import java.util.Scanner;
//to print minimum one condition 
//firstly it will print minum one cindition then it will check next
public class Dowhileloop{
    public static void main(String[] args) {
            // int i=10;
            // do
            //     {
            //         System.out.println(i+" ");
            //         i++;
            //     }
            //     while(i<=5);


            //other way to write code 
            //do while loop 
            //print 1 to 100 count 
            // int i=1;
            // do{
            //     System.out.println(i);
            //     i=i+1;
            // }while(i<=100);


            // QUE :- take input to print odd number using do-while methid
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter any starting odd number = ");
            int start = sc.nextInt();
            System.out.print("Enter last number whose you want to find =");
            int end = sc.nextInt();
            if(start%2==0)
            {
                start += 1;
            }
            else
            {
                start = start + 0;
            }

            int i = start;
            System.out.println("odd number betweet given range =");
            do
            {
                if(i>end)
                {
                    break;
                }
                System.out.println(i+ " ");
                i += 2;
            }while(i<= end);
            sc.close();
      
    }
}

// ------------------------------------------------------
