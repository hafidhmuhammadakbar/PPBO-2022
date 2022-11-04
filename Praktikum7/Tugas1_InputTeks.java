// Nama : Hafidh Muhammad Akbar
// NIM : M0521026

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Tugas1_InputTeks {
    // method ini untuk input teks oleh user melalui keyboard
    public String ketikTeks() {
        System.out.println("Ketik kalimat yang akan disimpan :");
        Scanner sc = new Scanner(System.in);
        // ambil 1 kalimat, setelah tekan enter teks akan diambil
        String str1 = sc.nextLine();
        sc.close();
        return str1;
    }
    
    // untuk menyimpan teks yang diketik user ke file
    public void simpanTeks(String teks) {
        // set up file and stream
        // ganti path "/tmp/sample3.data" dengan alamat file di komputer anda
        File outFile = new File(System.getProperty("user.dir") + "\\sample3.data");
        FileOutputStream outFileStream;
        
        try {
            outFileStream = new FileOutputStream(outFile);
            PrintWriter outStream = new PrintWriter(outFileStream);
            // outStream.print(teks); // di pdf tertulis outstream.print();
            outStream.write(teks); // print dan write menghasilkan hasil yg sama
            outStream.close();
            System.out.println("file berhasil disimpan");
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Tugas1_InputTeks it = new Tugas1_InputTeks();
        // memanggil method ketikTeks
        String kalimat = it.ketikTeks();
        // memanggil method simpanTeks
        it.simpanTeks(kalimat);
    }
}

/*  Pertanyaan :
    Jalankan source code tersebut, buka file teks menggunakan text editor,
    jelaskan seperti apa hasilnya.
    
    Jawab:
    Jika file tersebut dijalankan, maka hasil yang ada pada file "sample3.data"
    akan sesuai dengan apa yang kita inputkan. 
    
    Misalkan kita menginputkan, "Halo, ini Praktikum 7 PBO". Maka file "sample3.data"
    juga akan menampilkan hasil "Halo, ini Praktikum 7 PBO".
    
    Hal ini karena fungsi "PrintWriter.write()" akan menulis atau menyimpan data string dalam 
    format ASCII. Tapi, hal ini juga bisa saja di luar set dari ASCII yang mana hanya
    menampung 128 karakter, di mana 32 karakter pertama adalah karakter kontrol khusus,
    seperti "ETX(End of Text)"
 */