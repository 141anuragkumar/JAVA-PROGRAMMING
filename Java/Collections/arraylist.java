package Collections;
                // ⭐OPERATIONS IN ArrayList
                    // add
                    // get
                    // modify
                    // delete
                    // iterate/operation
import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();//representation of arraylist

// -------------------------------add-------------------------------- 
        students.add("Anurag");
        students.add("Rahul");
        students.add("neha");

        System.out.println(students);

// -------------------------------get------------------------------
    // way : 1
            System.out.println(students.get(0));

    // way : 2
            String person = students.get(0);
            System.out.println(person);


// --------------------------------set/modify------------------------------

    //list ke beech me add kernaa ⭐
            students.add(0,"Avneesh");
            System.out.println(students);


    //set ya fir replace element"set
            students.set(2,"Ravi");
            System.out.println(students);


// -----------------------------------delete------------------------------
            students.remove(2);
            System.out.println(students);


// -------------------------------------Size of list------------------------
        int size = students.size();
        System.out.println(size);



// -----------------------------------iterate/operation-------------------------- 
        // for(int i =0;i<=students.size();i++){
        //     System.out.println(students.get(i));
        // }   
        // System.out.println();  
        

        // sorting list in arraylist"collections"
        Collections.sort(students);
        System.out.println(students);
        

}
}