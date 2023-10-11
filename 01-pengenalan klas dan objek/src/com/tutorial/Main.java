package com.tutorial;

class Mahasiswa {
   String nama;
   String NIM;
   String prodi;
}
public class Main {
 public static void main(String[] args) {
   // instansiasi pembuatan objek
   Mahasiswa mhs1 = new Mahasiswa();

   // objek mhs1 diberi atribut
   mhs1.nama = "saihul";
   mhs1.NIM = "22241020";
   mhs1.prodi = "PTI";

   System.out.println("Nama Mahasiswa:" + mhs1.nama);
   System.out.println("Nim Mahasiswa:" + mhs1.NIM);
   System.out.println("program studi:" + mhs1.prodi);

   Mahasiswa mhs2 = new Mahasiswa();
mhs2.nama = "sela";
mhs2.NIM = "22241056";
mhs2.prodi = "matematika";

System.out.println("Nma Mahasiswa:" + mhs2.nama);
System.out.println("Nim mahasiswa:" + mhs2.NIM);
System.out.println("program studi:" + mhs2.prodi);
 }
}


