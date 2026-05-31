package Array;
import java.util.Scanner;
public class ConditionalStatement 
{
    public abstract static void main(String[] args) 
    {
      Scanner sc = new Scanner (System.in);
      //exp = 1

        // boolean isSunUp = false;
        // if(isSunUp == true)
        //      System.out.println("day");
        // else
        //     System.out.println("night");

     //exp = 2

        // boolean Anurag = false;
        // if(Anurag == true)
        //     System.out.println("you are elligible");
        // else
        //     System.out.println("you are not elligible");


     // exp = 3

        //     Scanner sc = new Scanner(System.in);
        //     System.out.print("Enter your Elligiblity(Age) = ");
        //     float Age = sc.nextFloat();
        //     if(Age >= 18)

        //         System.out.println("your are elligible");

        //     else

        //         System.out.println("you are not elligible");


     // exp = 4

        // Scanner sc = new Scanner(System.in);
        // System.out.print("how much Rupees you have = ");
        // //pen =10 ; notebook = 30
        // int rs = sc.nextInt();
        // if(rs < 10  )
        // {
        //     System.out.println(" you can't buy pen");
        //     System.out.println("need more money");
        // }
        // else if(rs >= 10 && rs < 30)
        // {
        //     System.out.println("you can buy one thing");
        // }
        // else if(rs > 10 && rs >= 30)
        // {
        //     System.out.println("you can buy both");
        // }
        // else
        // {
        //     System.out.println("you can't buy anithing");
        //     System.out.print("thanks to buy both");
        // }


         // int Day = 1;
        System.out.print("Enter the day Count = ");
        int Day = sc.nextInt();
        
         switch (Day) 
        {
            case 1:
               System.out.println("Monday");
               break;
            case 2:
               System.out.println("Tuesday");
               break;
            case 3:
               System.out.println("Wednesday");
               break;
            case 4:
            System.out.println("Thursday");
               break;
            case 5:
               System.out.println("Friday");
               break;
            case 6:
               System.out.println("Saturday");
               break;
            case 7:
               System.out.println("Sunday");
               break;
            default:
            System.out.println("Not found");
            System.out.println(" . ");
            System.out.println(" . ");
            System.out.println("Enter valid days");

        }
    }

}
 