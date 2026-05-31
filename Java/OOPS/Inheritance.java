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


