//  Nama    : Hafidh Muhammad Akbar
//  NIM     : M0521026

class MyThread extends Thread {
    int length;
    String marker;

    public MyThread(int length, String marker){
        this.length = length;
        this.marker = marker;

        var mainThread = Thread.currentThread().getName();
        System.out.println(this.getName() + " is created on " + mainThread);
    }

    @Override
    public void run(){
        int count = 0;
        while(count < length){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            count++;
            var progressString = getProgress(count, marker);
            System.out.println(this.getName() + ": " + progressString);
        }
    }

    private String getProgress(int count, String marker){
        var result = "";
        for(int i=0; i<count; i++){
            result+=marker;
        }

        return result;
    }
}

public class PPBO_11_Latihan1 {
    public static void main(String[] args) {
        System.out.println("Hello from thread '" + Thread.currentThread().getName() + "'\n");

        var thread1 = new MyThread(10, "#");
        var thread2 = new MyThread(5, ">");

        thread1.start();

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread2.start();
    }
}

/* 
 * Jawablah pertanyaan berikut
 * 1. Jelaskan mengapa program di atas tidak bisa dijalankan (memiliki error/exception)
 *    Jawab : Program tersebut menghasilkan error karena perintah "Thread.sleep()" akan
 *              menghasilkan exception "InterruptedException" apabila ada Thread lain
 *              yang mengganggu Thread yang sekarang ketika dalam keadaan sleep. Hal ini
 *              karean thread melanjutkan eksekusi dari kondisi atau state sebelumnya
 *              sebelum berhenti setealh kondisi atau waktu sleep selesai.
 * 
 * 
 * 2. Jelaskan dan terapkan bagaimana cara mengatasinya. Kemudian, kumpulkan program dalam keadaan sudah bisa dijalankan
 *    Jawab : Untuk mengatasi kode dia tas, kita bisa menggunakan "try catch"
 *              untuk menangkap exception yang mungkin terjadi.
 * 
 * 
 * 3. Jelaskan secara singkat algoritma program di atas
 *    Jawab : Program tersebut akan membuat dua buah objek bernama "thread1" dan "thread2".
 *              Selanjutnya, kedua thread tsb akan menjalankan method run yang berisi perintah 
 *              untuk menampilkan suatu pola dalam penjang/length tertentu.
 * 
 * 
*/