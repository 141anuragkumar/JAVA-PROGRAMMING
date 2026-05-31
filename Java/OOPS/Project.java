// ======================================Questions=====================================
                // Que : Student Management System 

// ---------------------------------Abstraction part------------------------ 
abstract class Student{
        private String name;
        private int rollno;

        Student(String name,int rollno){
                this.name = name;
                this.rollno = rollno;

        }
        abstract void calculateResult();

        void displayInfo(){
                System.out.println("Name     : "+name);
                System.out.println("Roll no. : "+rollno);
        }
}

// ----------------------------------Encapsulation part--------------------
class Marks{
        private int marks ;

        public void setMarks(int marks){
                if(marks >=0 && marks <= 100){
                        this.marks = marks;
                }
        }
        public int getMarks(){
                return marks;
        }
}

// --------------------------------------Inheritance part------------------------ 
class RegularStudent extends Student{
       Marks m;
        RegularStudent(String name, int rollno, int marks){
                super(name,rollno);
                m = new Marks();
                m.setMarks(marks);
       }

       @Override
       void calculateResult(){
        System.out.println("Marks : "+m.getMarks());
        if(m.getMarks() >= 40){
                System.out.println("Result  : Pass");
        }
        else{
                System.out.println("Result  : Fail");
        
        }

}

// -------------------------------------Polymorphism part--------------------- 
public class oops4{
       public static void main(String[] args) {

        Student s1 = new RegularStudent("Anurag",11,98);
        Student s2 = new RegularStudent("Fatima",12,99);

        s1.displayInfo();
        s1.calculateResult();

        System.out.println("-----------------");

        s2.displayInfo();
        s2.calculateResult();
       } 
}
}