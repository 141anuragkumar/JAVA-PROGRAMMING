package Exceptionh;
import java.util.Scanner;
public class NestedtryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks[] = {12,32,45,65};
        boolean flag = true;//IMPORTANT CASE FOR REPEATATION
        while (flag) {

        System.out.print("Enter the index number : ");
        int num = sc.nextInt();
        try{
            System.out.println("welcome in Exception case");
            try{
                System.out.println(marks[num]);
                flag = false;
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Sorry this index does not Exist");
                System.out.println("Exception in level 1");
            }
        }
        catch(Exception e){
            System.out.println("Exception in level 1");
        }
        System.out.println("Thanks for using");
        

    }
}
}
