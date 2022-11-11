// Nama : Hafidh Muhammad Akbar
// NIM  : M0521026

package com.java.p8;

public class ClassX {
    public static void main(String[] args) {
        // buat objek buku
        Buku buku = new Buku("432A326B4", "Pengenalan Komputasi Cloud",
                    "Eri Suhardi", "Elex Media Komputindo", 2022);
        
        // tampilkan data buku lewat method printDataBuku
        buku.printDataBuku();
    
        // akses ke variabel yang ada di objek buku
        System.out.println(buku.isbn);
        System.out.println(buku.judul);
        System.out.println(buku.penulis);
        System.out.println(buku.penerbit);
        System.out.println(buku.tahunTerbit);
    }
}

/*
    Pertanyaan :
    Adakah error yang ditemui pada ClassX yang berkaitan dengan access modifier?
    Jelaskan penyebab errornya!

    Jawab :
    Ada error yang terjadi di dalam ClassX berkaitan dengan access modifier.
    Hal ini terjadi saat kita ingin mengambil nilai variabel atau attribut "penulis" 
        karena variabel "penulis" pada Class "Buku" menggunakan access modifier bertipe 
        "private". Artinya, variabel tsb hanya dapat diakses di dalam Class-nya saja.
        Sehingga, tidak bisa diakses di luar Class-nya, walaupun berada dalam package 
        yang sama.
    Misalnya anda ingin mendapatkan nilai dari variabel "private" tsb, anda bisa membuat
        fungsi getPenulis(); yang akan me-return nilai dari variabel atau attribut
        "penulis".
*/
