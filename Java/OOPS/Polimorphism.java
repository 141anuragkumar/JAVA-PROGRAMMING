// 1-compile time polimorphism;

// class Student{
//     String name;
//     int age;

//     public void studentInfo(String name){
//         System.out.println(name);
//     }
//     public void studentInfo(int age){
//         System.out.println(age);
//     }
//     public void studentInfo(String name , int age){
//         System.out.println(name + " " + age);
//     }

//     public class oops4{
//         public static void main(String[] args) {
//             Student s1 = new Student();
//             s1.name = "Anurag kumar";
//             s1.age = 20;

//             s1.studentInfo(s1.name,s1.age);
//         }
//     }
// }

// ----------------------------------------Que 2------------------------
// Class Calculator banao
    // Same method name add()
    // 2 integers add kare
    // 3 integers add kare
    // 2 double add kare
// class Operation{
//     public void add(int a,int b){
//         System.out.println(a+b);
//     }
//     public void add(int a,int b,int c){
//         System.out.println(a+b+c);
//     }
//     public void add(double a,double b){
//         System.out.println(a+b);
//     }
//     public static void main(String[] args) {
//         Operation op = new Operation();
//         op.add(10,5);
//         op.add(10,20,30);
//         op.add(20,50.55);
//     }

// }

// -----------------------------------------Que 3-------------------------- 
// Class Payment
// Method pay():
// ca  payment
// card payment
// UPI payment
// (Different parameters use karo)
// class Payment{


//     public void pay(double amount){//via cash_payment
//         System.out.println("Your Amount is : "+amount);
//     }
//     public void pay(double amount , int cardNumber){// via cash_payment
//         System.out.println("Your Amount is :"+amount);
//         System.out.println("card number is :"+cardNumber);
//     }
//     public void pay(double amount, int UPIno , String bankname){//UPI_paymnet
//         System.out.println("Your amount :"+amount);
//         System.out.println("UPI secret pin :"+UPIno);
//         System.out.println("Bank name is :"+bankname);
//     }
//     public static void main(String[] args) {
//         Payment pt = new Payment();
//         pt.pay(500.50);
//         pt.pay(1000.01,7895);
//         pt.pay(5000.58,2245,"sbi");

//     }
// }

// ------------------------------------------Que - 4-----------------------------
// Class Vehicle me method speed()
// Class Car me speed() override karo
// 👉 Vehicle reference se Car object call karo
// class Vehicle{

//     void speed(){
//         System.out.println("vehical speed method :");
//     }


// }
// class Car extends Vehicle{
//     //overload method
//     void speed(int maxSpeed){
//         System.out.println("Car max speed is " +maxSpeed +"km/h");
//     }
//     public static void main(String[] args) {
//         Vehicle v = new Car();
//         v.speed();
    
//         Car c = new Car();
//         c.speed(120);
//     }
// }
