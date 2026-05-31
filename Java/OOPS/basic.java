package OOPS;

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
// public class basic{
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