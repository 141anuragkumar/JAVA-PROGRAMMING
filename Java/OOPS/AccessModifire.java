package OOPS;

// =======================================Access Modifire==================================== 
// esko use karte hai chipaane ke lea
// jaise koe company ki website hai jahan per employee space alag hai,customer page alag hai,business dashboard alag hai 
// jo jis position per hai aur sir wahi cheez hi dekh paayega jaise employee sir apna space hi dedkh sakta hai ,business dash board nahi dekh sakta 
// ye possible hota hai Access modifire ki helps se 
// -------------------------------------- 
// there are 4 type in java
// 1- Public 
// 2- private
// 3- Protected
// 4- Default
// ---------------------------------------public---------------------------
// public access modifire ko hum class ke andar aur bahar kahi per bhi use ker sakte hai 
// es case mme hum alag main class me use ker rahe hai lekin same package ke andar
//  class College{
//          public int data = 50;

//  }

//  public class AccessModifire{
        //  public static void main(String[] args) {
                //  College c = new College();
                //  System.out.println(c.data);
//         }
//  }

// -----------------------------------------private--------------------------
// esko sief same class me hi use ker sakte ho agar koe same package ka koe aur class me bhi nahi access per sakte 
// class College{
//         public int data = 15;

//         public int getdata(){
//                 return data;
//         }
// }
// public class AccessModifire {

//         public static void main(String[] args) {
//                 College c = new College();
//                 System.out.println(c.getdata());
//         }
// }

// --------------------------------------------Default---------------------------------- 
// esme hum same package ke andar kisi bhi class me access ker saktte ha 
// per package e bahar kabhi bhi nahi access ker sakte 
// esme hum koe bhi access modifire use nahi karte direct variable decleare karte hai keoki by default use ho jaat hai 

// class COllege{
//         int data = 100;
// }
// public class AccessModifire{
//         public static void main(String[] args) {
//                 COllege c = new COllege();
//                 System.out.println(c.data);
//         }
// }

// ------------------------------------------------Protected--------------------------------------- 
// esko hum sam class,same package me use ker sakte haai
// aur dusri package ki sub class me use ker sakte hai
// per dusre package ki normal class access nahi kar sakti ❌
// 👉 Matlab: inheritance ke liye banaya gaya hai 
// class College{
//         protected int data = 1010;
// }
// class Access extends College{
//         void show(){
//                 System.out.println(data);
//         }
// }
// public class AccessModifire {

//         public static void main(String[] args) {
//                 Access c = new Access();
//                 c.show();

//         }
// }