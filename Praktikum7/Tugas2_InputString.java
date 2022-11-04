// Nama : Hafidh Muhammad Akbar
// NIM : M0521026

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Tugas2_InputString {
    public String inputString(){
        System.out.println("Ketik kalimat yang akan disimpan :");
        Scanner sc = new Scanner(System.in);
        // ambil 1 kalimat, setelah tekan enter teks akan diambil
        String str1 = sc.nextLine();
        sc.close();
        return str1;
    }

    public void simpanString(String teks) {
        // set up file and stream
        // ganti path "/tmp/sample4.data" dengan alamat file di komputer anda
        File outFile = new File(System.getProperty("user.dir") + "\\sample4.data");
        FileOutputStream outFileStream;
        
        try {
            outFileStream = new FileOutputStream(outFile);
            DataOutputStream outStream = new DataOutputStream(outFileStream);
            outStream.writeBytes(teks);
            outStream.close();
            System.out.println("file berhasil disimpan");
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException i){
            i.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Tugas2_InputString it = new Tugas2_InputString();
        // memanggil method ketikTeks
        String kalimat = it.inputString();
        // memanggil method simpanTeks
        it.simpanString(kalimat);
    }
}
/*  Pertanyaan :
    Jalankan source code tersebut, buka file teks menggunakan text editor,
    jelaskan seperti apa hasilnya.
    
    Jawab:
    Jika file tersebut dijalankan, maka hasil yang ada pada file "sample4.data"
    akan sesuai dengan apa yang kita inputkan. 
    
    Misalkan kita menginputkan, "Halo, ini Praktikum 7 PBO". Maka file "sample4.data"
    juga akan menampilkan hasil "Halo, ini Praktikum 7 PBO".
    
    Sebenarnya, hal ini tidak akan terjadi jika kita tidak menggunakan "DataOutputStream.writeBytes();"
    karena fungsi "DataOutputStream" akan menyimpan data dalam bentuk bytes saja. 
    DataOutputStream juga mengubah tipe data primitif ke tipe data stream.
    Tetapi, karena kita menggunakan "DataOutputStream.writeBytes();", 
    maka setiap karakter string akan ditulis ke dalam urutan bytes.

    Singkatnya, DataOutputStream digunakan / dimaksudkan untuk data biner, sedangkan
    PrintWriter digunakan / dimaksudkan untuk data teks.
 */