package com.tutorial;

class Mahasiswa{
   // Data Member
   String nama;
   String nim;
   String prodi;

   // construktor dengan parameter
   Mahasiswa (String Nama, String NIM,
   String prodi){
     this.nama = Nama;
     this.nim = NIM;
     this.prodi = prodi;
    }

    // method tanpa parameter dan tanpa return
    void show(){
      System.out.println("Nama :" + this.nama);
      System.out.println("NIM :" + this.nim);
      System.out.println("prodi :" + this.prodi);
    }


    // method tanpa return dengan parameter
    void setNama(String nama) {
      this.nama = nama;
    }

    // method dengan return tanpa parameter
    String getNama(){
      return this.nama;

    }

   //  method dengan return dan parameter
   String sayHi(String pesan){
      return pesan + "Aku bisa menjadi" + this.nama;
   }

}



public class Main {
 public static void main(String[] args) {
   // instansiasi objek
   Mahasiswa mhs1 = new Mahasiswa("saehul", "22241020", "Pti");
    System.out.println("ini program JAVA pertama saya");


    mhs1.show();
    mhs1.setNama("hull");
    mhs1.show();
    System.out.println(mhs1.getNama());

    String pesan = mhs1.sayHi("hi");
    System.out.println(pesan);


 }

 
   

 }

