package javainput;
import java.util.Scanner;
public class inputtouser 
{
    //area of circle take input from the user 
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
            {
                System.out.print("Enter Radious: ");
                int radius= sc.nextInt();
                double pi=3.1415;
                double area=pi*radius*radius;
                System.out.println("Area of the circle is:"+area);
   
            }
        }    
}

