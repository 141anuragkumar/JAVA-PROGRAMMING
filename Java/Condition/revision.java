//marks calculator the student is pass or fail according to the percentage 
package Condition;
import java.util.Scanner;
public class revision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your maximum marks =");
        int max = sc.nextInt();
        System.out.print("Enter your obtained marks =");
        int obt=sc.nextInt();
        int marks = obt*100/max;
        System.out.println("your percentage is =" +marks);
        System.out.print("Enter your percentage to see your position =");
        int ercentage = sc.nextInt();
        if(marks >= 91)
        {
            System.out.println("Congratulatio you have to pass with first rank ");
        }
        else if(marks >= 75)
        {
            System.out.println("Congratulation you have to pass with second rank");
        }
        else if(marks >= 45)
        {
            System.out.println("congratulatio you have to pass with third rank,keep work hard");
            System.out.println("best of luck");
        }
        else if(marks >= 21)
        {
            System.out.println("you have to only passed ");
            System.out.println("plese work hard");
        }
        else if(marks >= 20)
        {
            System.out.println("You have to failed with less marks");
            System.out.println("work hard , continue learning best of luck");

        }
        sc.close();


    }
     
}


