package Array;

public class Question {
    public static void main(String[] args) {
        int[] marks= new int[3];
        marks[0] = 98;//physic 
        marks[1] = 89;//chemestry
        marks[2] = 76;//math
        // System.out.println(marks[0]);
        for(  int i= 0; i<1 ; i++)
        {
            System.out.println(marks[i]);
        }
    }
}


// Que :- take input from user and print array
// import java.util.*;
// public class Question {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size =");
//         int size = sc.nextInt();
//         int number[] = new int[size];
//         for(int i=0 ; i<size ; i++)
//         {
//             number[i]=sc.nextInt();
//         }
//         for(int i=0 ; i<size ; i++)
//         {
//             System.out.println(number[i]);
//         }
//     }
// }
 

// Que :- take sn array asa input from the user. search for 
// a give the number x  and print the index at which it occur.
// import java.util.*;
// public class Question {
//     public static void main(String[] args) {
//         Scanner ask = new Scanner(System.in);
//         System.out.print("Enter your last number = ");
//         int lstnum = ask.nextInt();
//         // int x = 5;
//         int num[] = new int[lstnum];
//         // input
//         for(int i = 0 ;i<lstnum; i++)
//         {
//             num[i] = ask.nextInt();
//         }
//         // output
//           System.out.print("Enter your target number = ");
//         int x = ask.nextInt();
//         for(int i=0 ; i< num.length;i++)
//         {
//             if(num[i]==x)
//             {
//                 System.out.println("x found at index ="+i);
//             }
//         }
//     }
// }
