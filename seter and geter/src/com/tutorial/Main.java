package com.tutorial;


class User {
   private String username;
   private String password;

   // membuat konstruktor
   User(String username, String password){
      this.username = username;
      this.password = password;

   }
   // method getter
   public String getusername(){
      return this.username;
   }

   public String getpassword(){
      return this.password;
   } 
}
public class Main {
 public static void main(String[] args) {
    //instansi obkek
    User person_1 = new User( "Saitama", "123456789");

    // panggil method getter
    System.out.println(person_1.getusername());
    System.out.println(person_1.getpassword());
 }
}
