package OOPS;
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
// public class hierarchical{
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
// public class hierarchical{
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