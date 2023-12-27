package com.tutorial;

class pegawai{
   public String nama;
   public String jabatan;
   public float pajak;
   public float gajipokok;
   private float gajibersih;

   pegawai(String nama, String jabatan, float pajak, float gajipokok){
      this.nama = nama;
      this.jabatan = jabatan;
      this.pajak = pajak/100;
      this.gajipokok = gajipokok;

   }

   public float setpajak(float pajak){
      return this.pajak = pajak/100;
   }

   public float gajibersih(){
      return this.gajipokok -(this.gajipokok*this.pajak);
   }

   public void display(){
      System.out.println("Nama Karyawan:" + this.nama);
      System.out.println("jabatan:" + this.jabatan);
      System.out.println("gaji bersih" + this.gajibersih());
   }
}
public class Main {
 public static void main(String[] args) {
    pegawai gaji = new pegawai("saehu", "Dosen", 10, 3500000);
    gaji.display();
    gaji.setpajak(30);
    gaji.display();

 }
}
