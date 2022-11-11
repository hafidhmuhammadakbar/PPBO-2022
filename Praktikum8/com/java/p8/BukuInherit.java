// Nama : Hafidh Muhammad Akbar
// NIM  : M0521026

package com.java.p8;

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
    Hal ini terjadi saat kita ingin mengambil nilai variabel atau attribut "penulis" 
        karena variabel "penulis" pada Class "Buku" menggunakan access modifier bertipe 
        "private". Artinya, variabel tsb hanya dapat diakses di dalam Class-nya saja. 
        Sehingga, tidak bisa diakses di luar Class-nya, walaupun merupakan class turunan 
        atau subclass.
    Misalnya anda ingin mendapatkan nilai dari variabel "private" tsb, anda bisa membuat
        fungsi getPenulis(); yang akan me-return nilai dari variabel atau attribut
        "penulis".
*/
