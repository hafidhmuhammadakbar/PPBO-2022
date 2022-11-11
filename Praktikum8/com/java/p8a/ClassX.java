// Nama : Hafidh Muhammad Akbar
// NIM  : M0521026

package com.java.p8a;

// import com.java.p8.Buku;

public class ClassX {
    public static void main(String[] args) {
        // buat objek buku
        Buku buku = new Buku("432A326B4", "Pengenalan Komputasi Cloud", "Eri Suhardi", "Elex Media Komputindo", 2022);
        
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
    Hal ini terjadi ketika ingin membuat Objek dari Class "Buku" yang mana berada
        di luar package, walaupun Class "Buku" bertipe "public".  
    
    Untuk mengatasi hal tsb, Anda bisa melakukan import package Class yang 
        ingin digunakan. Misalnya pada contoh di atas dapat diatasi dengan
        melakukan "import com.java.p8.Buku;".

    Walaupun demikian, setelah kita lakukan import tsb, tetap akan ada error
        access modifier lainnya saat pemanggilan attribut yang bertipe
        selain "public" karena perbedaan package antara "ClassX" dan "Buku".
*/