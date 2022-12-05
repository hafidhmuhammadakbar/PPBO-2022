//  Nama    : Hafidh Muhammad Akbar
//  NIM     : M0521026

class Car extends Thread{
    String name;

    public Car(String name){
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " starts moving");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class PPBO_11_Latihan2 {
    public static void main(String[] args) {
        Car car1 = new Car("car1");
        Car car2 = new Car("car2");

        car1.start();
        car2.start();
    }
}

/*
 * Jawablah pertanyaan berikut
 * 1.   Jalankan source code ini sebanyak 10x, hitung berapa kali car1 dan car2 
 *      sampai ke garis finish pertama kali (dilihat dari output terminal)!
 *      Jawab: Setelah dilakukan run sebanyak 10x, berikut merupakan data car1 dan car2 sampai ke garis finis pertama kali:
 *              car1 = 6
 *              car2 = 4
 * 
 *      
 * 2.   Mengapa setiap run, program bisa menghasilkan output yang berbeda padahal kode diimplementasi secara adil (setiap car "bergerak"
 *      selama 3 detik) dan kode tidak ada yg diubah? Jelaskan!
 *      Jawab: Karena eksekusi antar Thread yang terjadi tidak memiliki sinkronisasi dan komunikasi satu sama lain.
 *              Selain itu, eksekusi thread tergantung kepada penjadwalan tiap-tiap Sistem Operasi.
 * 
 * 
 * 3.   Anggap source code akan dimodifikasi menjadi:
 *      print "{car} reaches finish line" (pada line 22) hanya dilakukan sekali dan hanya untuk car pertama yang mencapai garis finish 
 *      Tanpa melakukan coding, berikan idemu supaya modifikasi di atas dapat dilakukan! 
 *      Jawab: Hal itu bisa dilakukan dengan menggunakan sebuah static variabel bertipe boolean yang bernilai false.
 *              Setelah itu, jika ada thread yang sudah sampai duluan, maka akan bernilai true. Untuk menentukan "cars" mana yang lebih
 *              dulu bisa menggunakan percabangan "If-Else". 
 * 
 * 
 */