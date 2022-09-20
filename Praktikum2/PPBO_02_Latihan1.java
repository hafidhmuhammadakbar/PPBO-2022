// Nama : Hafidh Muhammad Akbar
// NIM  : M0521026

import java.text.DecimalFormat;

public class PPBO_02_Latihan1 {
    public static void main(String[] args) {
        int a = 10;
        double b = 3.0;
        float c = 4.3f;

        double aKonversi = Double.valueOf(a);
        double cKonversi = Double.valueOf(c);

        double sum = aKonversi + b + cKonversi;

        DecimalFormat df = new DecimalFormat("#.##");

        System.out.print("Jumlah dari penjumlahan dari ketiga angka tersebut adalah : ");
        System.out.println(df.format(sum));
    }
}

// ubah variabel a dan c ke tipe data double
// jumlahkan variabel a, b, dan c
// tampilkan hasil penjumlahan ketiga variabel

/*
 * Output yang diharapkan:
    17.3
 */