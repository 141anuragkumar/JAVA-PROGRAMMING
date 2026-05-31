package Condition;
public class continuestatement{
    public static void main(String[] args) {
        //break statement is used to skip current
        // iteration or particular word,alphabet or number
        int i;
        for(i=1;i<=50;i++)
        {
            
            if(i%7==0) 
            {
                System.out.println("kuch nhi hai yaha");
                continue;
            }
            else
            {
                System.out.println(i);
            }
        }
       
    }
}