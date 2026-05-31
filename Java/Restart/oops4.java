package Restart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.jar.Attributes.Name;

import Array.logicalStatement;
import String.concatenation;

// simple class and objects 

// class Pen{//class name always start with capital letter⭐
//     String color;
//     String type;

//     public void write(){//function name is always start with small letter⭐
//         System.out.println("Features of pen ");
//     }
//     public void peninfo(){
//         System.out.println(this.color);
//         System.out.println(this.type);
//     }
// }
// public class oops4{
//     public static void main(String args[]){
//         Pen pen1 = new Pen();
//         pen1.color= "red";
//         pen1.type = "ball pen";

//         Pen pen2 = new Pen();
//         pen2.color="blue";
//         pen2.type="dot pen";
        
//         pen1.write(); 

//         pen1.peninfo();
//         // pen1.pentype();
//         pen2.peninfo();
//         // pen2.pentype();

        

//     }
// }


// ---------------------------------------constrouctor------------------------
// Constrouctor are also three type 
// 1 - non perameterize contrucotr 
// 2 - perameterize constrouctor
// 3 - Copy constructor


// ------------------------------------------1-non perameterize constrouctor--------------------------------

// class Student{
//     String name;
//     String age;

//     public void studentInfo(){
//         System.out.println(this.name);
//         System.out.println(this.age);
//     }
//     Student(){//constructor 1st type
//         System.out.println("Student Information");
//     }
// }
// public class oops4{
//     public static void main(String args[]){
//         Student s1 = new Student();
//         s1.name = "Anurag kumar";
//         s1.age = "22";

//         s1.studentInfo();
//     }
// }


// ----------------------------------------------2-perameterized constructor----------------------------
// class Student{
//     String name;
//     int age;

//     public void studentInfo(){
//         System.out.println(this.name);
//         System.out.println(this.age);
//     }
//     Student(String name,int age){
//         this.name = name;
//         this.age = age;
//     }
// }
// public class oops4{
//     public static void main(String args[]){
//         Student s1 = new Student("Anurag kumar",22);
//         s1.studentInfo();

//     }
// }

// -----------------------------------------3-copy constructor----------------------------- 
// bacically it is used like inheritance,which is take another object in current object(copy)
// class Student{
//     String name;
//     int age;
    
//     public void studentInfo(){
//         System.out.println(this.name);
//         System.out.println(this.age);
//     }
//     Student(Student s2){
//         this.name = s2.name;
//         this.age = s2.age;
//     } 
//     Student(){

//     } 
// }
// public class oops4{
//     public static void main(String args[]){
//         Student s1 = new Student();
//         s1.name = "Anurag kumar";
//         s1.age = 20;

//         Student s2 = new Student(s1);
//         s2.studentInfo();
//     }

// }



// --------------------------------------Oops Piller------------------------
// 1- Polimorphism
// 2- Inheritance
// 3- Encapsulation
// 4- Abstraction

// --------------------------------------Polimorphism-------------------------- 
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




// ====================================INHERITANCE============================
// TYPE:- SINLE LEVEL
// Que - 1 : parent class ke varriable child class se access kero
// class Parent{
//     String Name = "Anurag";
// }
// class Child extends Parent{
//     void show(){
//         System.out.println("Name : "+Name);
//     }
// }
// public class oops4{
//     public static void main(String[] args) {
//         Child c = new Child();
//         c.show();
//     }
// }

// ------------------------------------ 
// Que - 2 : print constructor
// class A{
//     A(){
//         System.out.println("Parent class constructor");
//     }
// }
// class B extends A{
//     B(){
//         System.out.println("Child class Constructor");
//     }
// }
// public class oops4{
//     public static void main(String[] args) {
//         B obj = new B();
//     }
// }

// ----------------------------------------------
// Que - 3 : Method overriding with single inheritance
// class Anurag{
//     void hus(){
//         System.out.println("hus* of fath");
//     }
// }
// class Fath extends Anurag{
//     void hus(){
//         System.out.println("fath is Nuah");
//     }
// }
// public class oops4{
//     public static void main(String[] args) {
//         Fath fa = new Fath();
//         fa.hus();
//     }
// }

// -------------------------------------------
// Que - 4 : super keyword ka use kero (method)
// super ka use kea jaata hai parent child ke saath parent ko bhi call karne ke kea 
// class Parent{
//     void Papa(){
//         System.out.println("Papa hu tera papa bol");
//     }
// } 
// class Child extends Parent{
//     void Papa(){
//         super.Papa();
//         System.out.println("Nameste papa ji");
//     }
// }
// public class oops4 {
//     public static void main(String[] args) {
//         Child ch = new Child();
//         ch.Papa();
//     }
    
// }

// --------------------------------------------------
// Que - 5 : super keyword with variable 
// class Number{
//     int x = 10;
// }
// class Mul extends Number{
//     int x = 20;
//     void show(){
//         System.out.println(x);
//         System.out.println(super.x);
//     }
// }
// public class oops4{
//     public static void main(String[] args) {
//         Mul obj = new Mul();
//         obj.show();
//     }
// }


// ---------------------------------------------------------------------------------------------
// TYPE:-MULTILEVEL
//Que -1 : show the relation between grandfather,papa and child using multilevel inheritance
// class Family{
//     void grandfather(){
//         System.out.println("hello baccho kaise ho");
//     }
// }
// class Parent extends Family{
//     void papa(){
//         System.out.println("Vadea papa ji");
//     }
// }
// class Child extends Parent{
//     void chotu(){
//         System.out.println("Nameste dada ji");
//     }
// }
// public class oops4{
//     public static void main(String[] args) {
//         Child ch  = new Child();
//         ch.grandfather();
//         ch.papa();
//         ch.chotu();
//     }
// }

// --------------------------------------
// Que - 2 : multilevel inheritance me variable ko access kero 
// class First{
//     int A = 10;
// }
// class Second extends First{
//     int B = 15;
// }
// class Third extends Second{
//     // int c = 5;
//     void show(){
//         System.out.println(A);
//         System.out.println(B);
//         // System.out.println(C);
//     }
// }
// public class oops4{
//     public static void main(String[] args) {
//         Third th = new Third();
//         th.show();
//     }
// }

// ---------------------------------------------------
// Que - 3 : super keyword with multilevel inheritance 
// class Animal{
//     void dog(){
//         System.out.println("Dog is Barking");
//     }
// }
// class Cat extends Animal{
//     void eat(){
//         System.out.println("Cat is hungry");
//     }
// }
// class Puppy extends Cat{
//     void weep(){
//         super.dog();
//         super.eat();
//         System.out.println("puppy is weep");
//     }
// }
// public class oops4{
//     public static void main(String[] args) {
//         Puppy py = new Puppy();
//         py.weep();

//     }
// }




// ---------------------------------------------------------------------------------------------------
// TYPE:- HIERARCHICAL 
// Que 1 : one parent but multiple child 
// class Parent{
//     void papa(){
//         System.out.println("Kaise ho beta");
//     }
// }
// class Beta extends Parent{
//     void child(){
//         System.out.println("Badhiya hu papa");
//     }
// }
// class Beta2 extends Parent{
//     void child2(){
//         System.out.println("Papa 1000 rs bhej mujhe trip per jaana hai");
//     }
// }
// public class oops4{
//     public static void main(String[] args) {
//         Beta b = new Beta();
//         b.papa();
//         b.child();

//         Beta2 b2 = new Beta2();
//         b2.papa();
//         b2.child2();

//     }
// }

// --------------------------------------------
// Que 2 method overriding hierarchical inheritance me kaise hota hai (parent and child context)
// class Parent{
//     void papa(){
//         System.out.println("Hello baccho");
//     }
// }
// class Child extends Parent{
//     void papa(){
//         System.out.println("Job kab tek lag jaayegi");
//     }
// }
// class Job extends Parent{
//     void papa(){
        
//         System.out.println("Kosis karte raho ek din zarur lag jaayegi acchi salary per");
//     }
// }
// public class oops4{
//     public static void main(String[] args) {

        // Job p = new Job();
        // p.papa();
        // Job j = new Job();
        // j.papa();

//              OR(Both are correct)

        // Parent p;
        // p = new Child();
        // p.papa();

        // p = new Job();
        // p.papa();


//     }
// }



// ==============================================Encapsulation=========================================== 
// ⭐ basically esse security purpose se use kea jaata hai 
// ⭐ data hiding or security

// class Student{
//     private int age;
//     public void setAge(int a){
//         age = a;
//     }
//     public int getAge(){
//         return age;
//     }
// }
// public class oops4{
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



// =======================================Access Modifire==================================== 
// esko use karte hai chipaane ke lea
// jaise koe company ki website hai jahan per employee space alag hai,customer page alag hai,business dashboard alag hai 
// jo jis position per hai aur sir wahi cheez hi dekh paayega jaise employee sir apna space hi dedkh sakta hai ,business dash board nahi dekh sakta 
// ye possible hota hai Access modifire ki helps se 
// -------------------------------------- 
// there are 4 type in java
// 1- Public 
// 2- private
// 3- Protected
// 4- Default
// ---------------------------------------public---------------------------
// public access modifire ko hum class ke andar aur bahar kahi per bhi use ker sakte hai 
// es case mme hum alag main class me use ker rahe hai lekin same package ke andar
//  class College{
//          public int data = 50;

//  }

//  public class oops4{
        //  public static void main(String[] args) {
                //  College c = new College();
                //  System.out.println(c.data);
//         }
//  }

// -----------------------------------------private--------------------------
// esko sief same class me hi use ker sakte ho agar koe same package ka koe aur class me bhi nahi access per sakte 
// class College{
//         public int data = 15;

//         public int getdata(){
//                 return data;
//         }
// }
// public class oops4 {

//         public static void main(String[] args) {
//                 College c = new College();
//                 System.out.println(c.getdata());
//         }
// }

// --------------------------------------------Default---------------------------------- 
// esme hum same package ke andar kisi bhi class me access ker saktte ha 
// per package e bahar kabhi bhi nahi access ker sakte 
// esme hum koe bhi access modifire use nahi karte direct variable decleare karte hai keoki by default use ho jaat hai 

// class COllege{
//         int data = 100;
// }
// public class oops4{
//         public static void main(String[] args) {
//                 COllege c = new COllege();
//                 System.out.println(c.data);
//         }
// }

// ------------------------------------------------Protected--------------------------------------- 
// esko hum sam class,same package me use ker sakte haai
// aur dusri package ki sub class me use ker sakte hai
// per dusre package ki normal class access nahi kar sakti ❌
// 👉 Matlab: inheritance ke liye banaya gaya hai 
// class College{
//         protected int data = 1010;
// }
// class Access extends College{
//         void show(){
//                 System.out.println(data);
//         }
// }
// public class oops4 {

//         public static void main(String[] args) {
//                 Access c = new Access();
//                 c.show();

//         }
// }



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
// public class oops4{
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
// public class oops4{
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
// public class oops4{
//         public static void main(String[] args) {

//                 UPI upi = new UPI();
//                 upi.pay();

//                 CreditCard cd = new CreditCard();
//                 cd.pay();

                

//         }
// }


// ======================================Questions=====================================
                // Que : Student Management System 

// ---------------------------------Abstraction part------------------------ 
// abstract class Student{
//         private String name;
//         private int rollno;

//         Student(String name,int rollno){
//                 this.name = name;
//                 this.rollno = rollno;

//         }
//         abstract void calculateResult();

//         void displayInfo(){
//                 System.out.println("Name : "+name);
//                 System.out.println("Rooll no. : "+rollno);
//         }
// }

// ----------------------------------Encapsulation part--------------------
// class Marks{
//         private int marks ;

//         public void setMarks(int marks){
//                 if(marks >=0 && marks <= 100){
//                         this.marks = marks;
//                 }
//         }
//         public int getMarks(){
//                 return marks;
//         }
// }

// --------------------------------------Inheritance part------------------------ 
// class RegularStudent extends Student{
//        Marks m;
//         RegularStudent(String name, int rollno, int marks){
//                 super(name,rollno);
//                 m = new Marks();
//                 m.setMarks(marks);
//        }

//        @Override
//        void calculateResult(){
//         System.out.println("Marks : "+m.getMarks());
//         if(m.getMarks() >= 40){
//                 System.out.println("Result : Pass");
//         }
//         else{
//                 System.out.println("Result : Fail");
        
//         }

// }

// -------------------------------------Polymorphism part--------------------- 
// public class oops4{
//        public static void main(String[] args) {

//         Student s1 = new RegularStudent("Anurag",11,98);
//         Student s2 = new RegularStudent("Fatima",12,99);

//         s1.displayInfo();
//         s1.calculateResult();

//         System.out.println("-----------------");

//         s2.displayInfo();
//         s2.calculateResult();
//        } 
// }
// }



// ================================================================================================
// ======================================== Practice ===============================================
// Arraylist
// hashmap
// hashset
// try catch
// public class oops4{
//         public static void main(String[] args) {


// ---------------------------------------Array list----------------------------
// Q1. ArrayList me 5 integers add karo aur sab print karo

        // ArrayList<Integer> list = new ArrayList<>();

        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        // System.out.println(list);


// Q2. ArrayList se even numbers print karo

// ArrayList<Integer> list = new ArrayList<>();

//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         list.add(6);
//         list.add(7);
//         list.add(8);
//         list.add(9);
//         for(int num : list){
//                 if(num%2==0){
//                         System.out.print(num+ " ");
//                 }
//         }



// Q3. ArrayList me element search karo

// ArrayList<Integer> list = new ArrayList<>();

//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         list.add(6);
//         list.add(7);
//         list.add(8);
//         list.add(9);
//         if(list.contains(10)){
//                 System.out.println("Found");
//         }
//         else{
//                 System.out.println("Not found");
//         }




// Q3 (Hard)
// ArrayList se duplicate elements remove karo.

//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(12);
//         list.add(12);
//         list.add(21);
//         list.add(15);
//         list.add(45);
//         list.add(46);
//         list.add(25);
//         list.add(15);

//         HashSet<Integer> set = new HashSet<>(list);
//         System.out.println(list);
//         list.clear();
//         list.addAll(set);
//         System.out.println(list);




// ---------------------------------------HashMap----------------------------------
// Q1 (Easy)
// Student ka naam aur marks store karo aur print karo.
        // HashMap<String,Integer> student = new HashMap<>();

        // student.put("Anurag",80);
        // student.put("Abhishek",91);
        // student.put("Harshit",78);
        // student.put("Yug",88);

        // System.out.println(student);



// Q2 (Medium)
// Check karo key exist karti hai ya nahi.

        // HashMap<Integer,String> find = new HashMap<>();

        // find.put(1,"Anurag");
        // // find.put("Shantanu");
        // if(find.containsKey(1)){
        //         System.out.println("Exist");
        // }
        // else{
        //         System.out.println("not Exist");
        // }



// Q3 (Hard)
// Ek string me characters ki frequency count karo.

        // String name = "anuragaa";        

        // HashMap<Character,Integer> count = new HashMap<>();
        // for(char ch : name.toCharArray()){
        //         count.put(ch,count.getOrDefault(ch,0 +1));

        // }
        // System.out.println(count);
       



// ---------------------------------------HashSet----------------------------
// Q1 (Easy)
// HashSet me values add karo aur print karo.

        // HashSet<Integer> num = new HashSet<>();

        // num.add(1);
        // num.add(1);//duplicate
        // num.add(2);
        // num.add(3);
        // num.add(4);
        // num.add(5);
        // num.add(6);
        // num.add(5);//duplicate
        // num.add(6);//duplicate
        // num.add(7);

        // System.out.println(num);
        // /Output - [1, 2, 3, 4, 5, 6, 7]



// Q2 (Medium)
// Check karo element present hai ya nahi.

        // HashSet<String> num = new HashSet<>();

        // num.add("Anurag");
        // num.add("shiva");
        // System.out.println(num.contains("Anurag"));



// Q3 (Hard)
// ArrayList se duplicates remove karo using HashSet.

        // ArrayList<String> del = new ArrayList<>();

        // del.add("Anurag");
        // del.add("Avneesh");
        // del.add("Sagar");//dup
        // del.add("Ajit");
        // del.add("Sagar");//dup

        // System.out.println(del);

        // HashSet<String> update = new HashSet<>(del);
        // System.out.println(update);

        
      
// -----------------------------------------Try Catch--------------------------------- 
// Q1 (Easy)
// Division by zero exception handle karo.

        // int a = 15;
        // int b = 5;
        // int c;
        // try{
        //         c = a/b;
        //         System.out.println("Divided Value : "+c);
        // }
        // catch(Exception e){
        //         System.out.println("Please Correct it");
        //         System.out.println("Finished....");
        // }


        
// Q2 (Medium)
// ArrayIndexOutOfBoundsException handle karo.
        // yeh error tub aata hai jub out of bound index input dete hai 
        // "jaise ki array ka size sirf 5 element ko store karne ki hai per humne 8 enter kerwana chaha ya for minus value imput dea  
        
        // int arr[] = {1,2,3,4,15,56};
        // try{
        //         System.out.println(arr[5]); 
        // }
        // catch(ArrayIndexOutOfBoundsException e){
        //         System.out.println("Input not suitable");
        //         System.out.println("Finished Operation...");
        // }
               


// Q3 (Hard)
// Multiple catch use karo.

//         int arr[] = {15,45};

       
//         try{
//                 // arr[5] = 10;
//                 System.out.println(arr[0]);
//         }
//         catch(ArrayIndexOutOfBoundsException e){
//                 System.out.println("Please check your Index Correction");

//         }
//         catch (Exception e) {
//                 System.out.println("Error : Detected");
//         }

//         }
// }
        
