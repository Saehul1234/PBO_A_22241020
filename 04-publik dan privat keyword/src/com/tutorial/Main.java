package com.tutorial;

class player{
   // Data Member
   String name;//default, bisa dibaca dan ditulis diluar class
   public int exp;//public, bisa dibaca dan ditulis diluar class
   private int health; //private, hanya bisa dibaca oleh class itu sendiri


   // konstruktor
   player (String name,int exp,int health){
      this.name = name;
      this.exp = exp;
      this.health = health;

}

void display(){
   System.out.println("Hero 1 :" + this.name);
   System.out.println("Hero Health :" + this.health);
   System.out.println("Hero exp :" + this.exp);
}


}


public class Main {
 public static void main(String[] args) {
    player hero = new player("chou", 95, 25);
    hero.display();
    hero.name = "zilong";
    System.out.println(hero.name);

    hero.exp = 60;
    System.out.println(hero.exp);

 }
}
