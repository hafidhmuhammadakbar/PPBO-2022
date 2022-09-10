// Nama : Hafidh Muhammad Akbar
// NIM  : M0521026
public class PPBO_02_Latihan2 {
    public static final int KURS_DOLLAR = 15000;
    public static final double PI = 3.14;
    public static final String NAMA = "Squidward";
    public static void main(String args[]) {
        // KURS_DOLLAR = 13500; //kode salah
        System.out.println(KURS_DOLLAR);
        System.out.println(PI);
        System.out.println(NAMA);
    }
}
// Apa yang salah dengan source code tersebut?
// Jawaban : Kode di atas salah karena konstanta dengan keyword final tidak bisa diubah atau diperbarui nilainya.

// Apa maksud penggunaan keyword static sebelum keyword final pada deklarasi variabel tersebut?
/*Jawaban : Keyword static digunakan untuk mengakses member baik variabel ataupun method (prosedur atau fungsi) pada class
tertentu tanpa harus membuat suatu objek dari class itu. Dengan adanya perintah 'static', kita tidak perlu membuar objek 
di dalam kelas untuk memanggil variabel tsb.
*/