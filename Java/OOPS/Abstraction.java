package OOPS;

// ================================================Abstraction=========================================== 
// Execution of abstraction
// two way hai abstraction ko perform karne ke lea 
// 1- abstract
// 2- interface
// ------------------------------------Abstact-----------------------

// abstract class Animal{
//         abstract void walk();
// }
// class Horse extends Animal{
//         public void walk(){
//                 System.out.println("walk on two leg");
//         }
// }
// class Puppy extends Horse{
//         public void walk(){
//                 System.out.println("walk on two leg");
//         }
// }
// public class Abstraction{
//         public static void main(String[] args) {

//              Horse h = new Horse();
//              h.walk();

//         //      Animal an = new Animal();
//         //      an.walk();

             

//         }
// }

// -------------------------------------- 
// Que 2 :
// abstract class Vahical{
//         abstract void start();
// }
// class Car extends Vahical{
//         void start(){
//              System.out.println("Car start from key");
//         }
        
// }
// public class Abstraction{
//         public static void main(String[] args) {
//                 Car c = new Car();
//                 c.start();
//         }
// }


// -------------------------------------interface---------------------------  
// interface ka use karke upi,creditcard se payment kero 
// interface Payment{
//         void pay();
// }
// class UPI implements Payment{
//         public void pay(){
//                 System.out.println("Payment done using UPI");
//         }
// }
// class CreditCard implements Payment{
//         public void pay(){
//                 System.out.println("Payment done using CreditCard");
//         }
// }
// public class Abstraction{
//         public static void main(String[] args) {

//                 UPI upi = new UPI();
//                 upi.pay();

//                 CreditCard cd = new CreditCard();
//                 cd.pay();

                

//         }
// }
