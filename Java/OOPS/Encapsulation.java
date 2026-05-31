package OOPS;
// / ==============================================Encapsulation=========================================== 
// ⭐ basically esse security purpose se use kea jaata hai 

// class Student{
//     private int age;
//     public void setAge(int a){
//         age = a;
//     }
//     public int getAge(){
//         return age;
//     }
// }
// public class Encapsulation{
//     public static void main(String[] args) {
//         Student s = new Student();
//         s.setAge(21);
//         System.out.println(s.getAge());
//     }
// }

// --------------------------------------------------
// Que 2 :>> Bank Account 
// import java.util.*;
// class BankAccount {
//     private int balance;   // data hiding

//     public void setBalance(int amount) {
//         if (amount > 0) {
//             balance = amount;
//         }
//     }

//     public int getBalance() {
//         return balance;
//     }
// }

// public class oops4 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter you Amount = ");
//         int amount = sc.nextInt();
//         BankAccount acc = new BankAccount();
//         acc.setBalance(amount);
//         System.out.println("Balance : "+acc.getBalance());
//     }
// }