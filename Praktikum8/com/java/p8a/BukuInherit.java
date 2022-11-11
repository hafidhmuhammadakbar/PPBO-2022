// Nama : Hafidh Muhammad Akbar
// NIM  : M0521026

package com.java.p8a;

import com.java.p8.Buku;

public class BukuInherit extends Buku {
    public BukuInherit(String isbn, String judul, String penulis, String penerbit, int tahunTerbit) {

        super(isbn, judul, penulis, penerbit, tahunTerbit);
        super.isbn = isbn;
        super.judul = judul;
        super.penulis = penulis;
        super.penerbit = penerbit;
        super.tahunTerbit = tahunTerbit;
    }
}

/*
    Pertanyaan :
    Adakah error yang ditemui pada BukuInherit yang berkaitan dengan access modifier?
    Jelaskan penyebab errornya!

    Jawab :
    Ada error yang terjadi di dalam BukuInherit berkaitan dengan access modifier.
    Hal ini terjadi saat kita ingin mengambil nilai variabel atau attribut , "isbn", 
        "penulis" dan "tahunTerbit".
        Variabel "penulis" pada Class "Buku" menggunakan access modifier bertipe "private",
            sehingga variabel tsb hanya dapat diakses di dalam Class-nya saja dan tidak bisa
            diakses di luar Class-nya. 
        Sedangkan variabel "isbn" dan "tahunTerbit" bertipe "default", sehingga hanya dapat
            diakses di dalam package yang sama. 
    Misalnya anda ingin mendapatkan nilai dari variabel "private" dan "default" tsb, anda 
        bisa membuat fungsi getter dan setter yang akan me-return nilai dari variabel atau
        attribut yang diinginkan.
*/
