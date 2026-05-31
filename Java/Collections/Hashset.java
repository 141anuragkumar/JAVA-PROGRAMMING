package Collections;
import java.util.HashSet;
import java.util.Iterator;
public class Hashset {
    public static void main(String[] args) {
        
        HashSet<Integer> list = new HashSet<>();
// ---------------------------Insertion---------------------- 

        list.add(1);//hashset add only unique data not dupliate
        list.add(2);
        list.add(3);
        list.add(1);//dulicate value

        System.out.println(list);


// -----------------------------Searching(Contain)------------------------------ 
        if(list.contains(6)){
            System.out.println("unit is available");
        }
        else{
            System.out.println("not available");
        }


// ---------------------------------Deletion------------------------------ .
        // list.remove(2);
        // if(!list.contains(2)){
        //     System.out.println("Deleted");
        //     System.out.println(list);
        // }


// -----------------------------------calculate size------------------------------ 
        System.out.println("Size of set is : "+list.size());

        //overall list
        System.out.println("total no. : "+list);



// --------------------------------------iterator------------------------------------ 
        Iterator it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
            
        }

    }
}