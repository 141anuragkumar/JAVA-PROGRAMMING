package Collections;
import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
        
        // HashMap is work on "key" and "value" base⭐

    HashMap<String,Integer> pop = new HashMap<>();

    // intertion
    pop.put("india",130);
    pop.put("china",150);
    pop.put("Russia",45);

    System.out.println(pop);


    // ---------------------------------search in hashmap---------------------------- 
// we use "containsKey" and "get" to search , are present or not
        // if(pop.containsKey("japan")){
        //     System.out.println("key is present");
        // }else{
        //     System.out.println("key is not present ");
        // }


        // Get
        // System.out.println(pop.get("india"));
        // System.out.println(pop.get("japan")); 



// ---------------------------------------loop---------------------------------
    // new things to writting loop in HashMap 
    // Map.Entry<String,Integer> e : listName.entrySet()

    // sequence printing
    for( Map.Entry<String,Integer> e : pop.entrySet()){
        System.out.println(e.getKey());
        System.out.println(e.getValue());
    }
System.out.println("--------------------");
    // set wise 
    Set<String> keys = pop.keySet();
    for(String key : keys){
        System.out.println(key+" "+pop.get(key));
    }
    

    // Remove---------------

    pop.remove("china");
    System.out.println(pop);
    }
}

