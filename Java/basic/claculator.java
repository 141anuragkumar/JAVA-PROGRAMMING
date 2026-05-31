package Practice.java;
import java.util.Scanner;
public class claculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the first number = ");
        int num1=sc.nextDouble();
        System.out.println("Enter the Second number");
        int num2=sc.nextDouble();
        int result;
        
        switch () {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            
            default:
            System.out.println("invalid operator");
                break;
        }
    }
    

}
