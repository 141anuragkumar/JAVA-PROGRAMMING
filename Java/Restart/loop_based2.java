package Restart;
import java.util.Scanner;
public class loop_based {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        
        // --------------------------que - 1-----------------
        // Question 1 – Attendance Counter(for loop)
        // 1 se 30 tak numbers print karo
        // 👉 jaise daily attendance roll numbers
          
        // for(int i=1; i<=30 ; i++){
        //         System.out.println(i);
        //    }
    
    
        // --------------------------que - 2-----------------
        // Question 2 – Even Numbers Printer
        // 1 se 100 ke beech sirf even numbers print karo
        // int count = 0;
        // for(int i=1;i<=100;i++){
        //     if(i%2==0){
        //         System.out.println("Even number between 1 to 100 ="+i);
        //         count++;
        //     }
            
        // }
        // System.out.println("Total Even number is = "+count);
    
    
        // ---------------------------que - 3-----------------
        // Question 3 – Mobile Battery Drain
        // Battery 100% se start hoti hai
        // Har loop me 5% kam hoti rahe
        // 👉 jab tak battery 0 na ho jaaye

//         int count = 0;
//         int battery = 100;
//         while (battery >= 0) {
//             System.out.println("battery = "+battery + "%");
//             battery -=5;
//             // count++;
            
//         }  
//         System.out.println("Battery 0% (mobile off)");


//         -----------------------------que - 4--------------------
//         Question 4 – Password Attempts(while loop)
//         User ko 3 attempts milte hain
//         Jab tak attempts khatam na ho jaaye
//         👉 "Try Again" print hota rahe

//         int token = 3;
//         while(token >0){
//             System.out.println("Attempt "+token);
//             token = token -1;
//         }    
//         System.out.println("You have "+token +" Attempt");
//         System.out.println("Try again after some time");
    


//     ------------------------------Que - 5---------------------------
//         Question 5 – Menu Driven App(do-while loop){06:20Am,25-jan-2026,Morning}
//         Menu print karo:
//         Check Balance
//         Withdraw
//         Exit
//         👉 user jab tak Exit na choose kare menu repeat ho

            // int choice = 0;
            // int amount = 1000;
            // do{
            //     System.out.println("-----Select One-----");
            //     System.out.println("Check Balance");
            //     System.out.println("withdraw");
            //     System.out.println("Add money");
            //     System.out.println("Exit");
            //     System.out.print("Select your Choice = ");
            //     choice = sc.nextInt();

            //     if(choice == 1){
            //         System.out.println("Your Balance = "+amount);
            //         // break;
            //     }
            //     else if(choice == 2){
            //         // System.out.println("Withdraw");
            //         System.out.print("Enter your balance = ");
            //         int money = sc.nextInt();
            //         amount = amount - money;
            //         System.out.println("you Remain balance is = "+amount);
            //         // break;
            //     }
            //     else if(choice == 3){
            //         System.out.print("Enter your Amount =");
            //         int rs = sc.nextInt();
            //         amount = amount + rs ;
            //         System.out.print("you Updated balance is = "+amount);
            //         // break;
            //     }
            //     else if(choice == 4){
            //         System.out.println("Thanks for using");
            //         break;
            //     }
            //     else{
            //         System.out.println("invalid choice");
            //     }

            // }
            // while(choice !=4);

            // -----------------------------try again------------------
            // int choice = 0;
            // int amount = 1000;
            // do{
            //     System.out.println("-----Select option-----");
            //     System.out.println("Check Balance - [Enter 1]");
            //     System.out.println("Withdraw Money - [Enter 2]");
            //     System.out.println("Add Money - [Enter 3]");
            //     System.out.println("Exit - [Enter 4]");
            //     System.out.print("Select your choice = ");
            //     choice = sc.nextInt();

            //     if(choice == 1){
            //         System.out.println("Check Balance");
            //         System.out.println("Your Balance is = "+amount);
            //     }
            //     else if(choice == 2){
            //         System.out.println("Withdraw Money");
            //         System.out.print("Enter Amount = ");
            //         int amt = sc.nextInt();
            //         amount = amount - amt;
            //         System.out.println("Updated Balance is = "+amount);
            //     }
            //     else if(choice == 3){
            //         System.out.println("Add Money");
            //         System.out.print("Enter Amount = ");
            //         int amt = sc.nextInt();
            //         amount = amount + amt;
            //         System.out.println("Updated Balance is = "+amount);
            //     }
            //     else if(choice == 4){
            //         // System.out.println("Exit");
            //         System.out.println("Thanks for using getway\n\n");
            //         break;

            //     }
            //     else{
            //         System.out.println("Invalid Input !");
            //         System.out.println("Try Again");
            //     }
            // }
            // while(choice !=4);



            // -------------------------------que - 6---------------------
                // Question 6 – Table Generator
                // User se number lo
                // Uska 1 se 10 tak table print karo
                    // System.out.println("Enter table = ");
                    // int table = sc.nextInt();
                    // for(int i = 1;i <=10 ;i ++){
                    //     System.out.println(table + "*" +i +"=" +(table * i) );
                    // }


            // -----------------------------------Que - 7----------------------
            // Question 7 – Digit Count(using for loop)
            // User se number lo
            // Loop use karke batao:
            // 👉 number me kitne digits hain
            // int count = 0;
            // System.out.print("Enter Random 10 or Above digit = ");
            // int number = sc.nextInt();
            // for(;number>0;number = number/10){
            //     count++;
            // }
            // System.out.println("TOtal digit is = "+count);


            // -------------------------------------------Que - 8---------------------------
            // Question 8 – Reverse a Number(using while loop)
            // Number input lo
            // Loop se uska reverse print karo
            // (Example: 123 → 321)
            // int reverse = 0;
            // System.out.print("Enter random number =");
            // int num = sc.nextInt();
            // while (num > 0) {
            //     int digit = num % 10;
            //     reverse = reverse * 10 + digit;
            //     num = num / 10;
                 
                
            // }
            // System.out.println(reverse);

        // -------------------------------------------Que - 9--------------------------------
        // Question 9 – Prime Number Check(for loop)
        // User se number lo
        // Loop se check karo:
        // 👉 Prime hai ya nahi
        System.out.print("Enter digit =");
        int num = sc.nextInt();
        for(int i=2;i<num;i++){
            if(num%i==0){
                System.out.println("Number is prime"+i);
            }
            else{
                System.out.println("Number is odd"+i);
            }
        }
        }

            



    }
    
    
}>