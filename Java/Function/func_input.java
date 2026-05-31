package Function;
import java.util.*;

public class func_input {
    // public static void PrintMyName(String Name) {
    //     System.out.println(Name);
    //     return;
    // }
    // public static void main(String args[]) {
    //     Scanner sc = new Scanner(System.in);
    //     String Name = sc.next();
    //     PrintMyName(Name);
    // }

    // -----------------------------------------------------------------
        // calculate two number    
        // public static int calculatesum(int a,int b) {
        //     int sum = a+b;
        //     return sum;
        // }
        // public static void main(String args[]) {
        //     Scanner sc = new Scanner(System.in);
        //     int a = sc.nextInt();
        //     int b = sc.nextInt();
        //     int sum = calculatesum(a,b);
        //     System.out.println("the sum is ="+sum);
        // }


        //multiply 2 number using function 
        // public static int multiply(int a,int b){
        //     int mul = a*b;
        //     return mul;
        // }
        // public static void main(String[] args) {
        //     Scanner sc = new Scanner(System.in);
        //     int a = sc.nextInt();
        //     int b = sc.nextInt();
        //     int mul = multiply(a,b);
        //     System.out.println("A multiply B is ="+mul);
        // }

        // find factorial of number
        public static void factorial(int a) {
            if(a<0){
                System.out.println("Invalid number");
                return;
            }
            int fact = 1;
            for(int i=a;i>=1;i--){
                fact = fact * i;
            }
            System.out.println(fact);
            return;
        }
        public static void main(String args[]) {
            Scanner sc= new Scanner(System.in);
            int a = sc.nextInt();

            factorial(a);
        }
    }
