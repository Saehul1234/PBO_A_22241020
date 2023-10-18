package com.tutorial;

// Class tanpa konstruktor
class polos{
   String dataString;
   int dataInteger;   
}

// class dengan konstruktor
class Mahasiswa{
   String nama;
   String nim;
   String prodi;

   // Membuat konstruktor tanpa parameter
   Mahasiswa() {
      System.out.println("Ini adalah konstruktor");
   }

   // membuat konstruktor dengan parameter
   Mahasiswa(String inputNama, String inputNIM, String inputprodi) {
      nama = inputNama;
      nim = inputNIM;
      prodi = inputprodi;

      System.out.println("nama :" +nama);
      System.out.println("Nim :" +nim);
      System.out.println("prodi :" +prodi);


      


   }


   
   }


public class Main {
 public static void main(String[] args) {
   // instansiasi objek dari class polos
   // polos pls = new polos();

   // isi ciri pada objek pls
   // pls.dataString = "Polos";
   // pls.dataInteger = 10; 

   // // cetak data
   // System.out.println("Isi Data String : " + pls.dataString);
   // System.out.println("Isi Data Integer : " + pls.dataInteger);
   
   Mahasiswa mhs1 = new Mahasiswa("sehul", "22241020", "PTI");
   // memanggil konstruktor
 }
}
