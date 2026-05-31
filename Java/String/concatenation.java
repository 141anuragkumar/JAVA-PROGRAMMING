package String;

public class concatenation {
    public static void main(String args[]) {
        String name = "Anurag";
        String surname = "kumar";
        String full_Name = name + " " + surname;
        System.out.println(full_Name);

        // Find length of this string
        System.out.println(full_Name.length());

        // printn letter of the name 
        System.out.println(full_Name);

        // print name into row wise using for loop
        for(int i=0; i<full_Name.length();i++){
            System.out.println(full_Name.charAt(i));
        }

        // compare two string using .campareTo() method
        String num1 = "Anurag";
        String num2 = "Anurag";
        if(num1.compareTo(num2)==0){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("string is not equal");
        }

        // find particular tag in entire string
        String sen = "my name is anurag kumar";
        String result =sen.substring(11);
        System.out.println(result);

    }
    
    
}
