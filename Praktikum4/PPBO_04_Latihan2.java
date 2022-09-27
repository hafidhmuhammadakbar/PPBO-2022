// Nama : Hafidh Muhammad Akbar
// NIM  : M0521026

import java.util.InputMismatchException;
import java.util.Scanner;

public class PPBO_04_Latihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bil1, bil2;
        boolean lanjut = true;
        while (lanjut) {
            try {
                System.out.print("Ketik bilangan pertama : ");
                bil1 = sc.nextInt();
                System.out.print("Ketik bilangan kedua : ");
                bil2 = sc.nextInt();
                double hasil = Double.valueOf(bil1) / Double.valueOf(bil2);

                System.out.println(bil1 + " / " + bil2 + " = " + hasil);
                lanjut = false;
            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("Input salah, masukkan angka");
            }
        }

        sc.close();
    }
}

// Ketik huruf untuk digunakan sebagai input bilangan pertama kemudian klik ENTER. 
// Jelaskan perbedaannya dengan source code sebelumnya (Latihan1)!
/* Jawab: 
    => Pada Latihan2, jika kita menginputkan huruf pada program, maka exceptio yang terjadi akan ditangani
        oleh kode "catch(..)" dan akan diminta inputan kembali ke program "try" sehingga program tetap dapat
        berjalan. Sedangkan pada program Latihan1, jika kita menginputkan huruf maka akan terjadi input mismatch 
        dan program akan berhenti.
*/

