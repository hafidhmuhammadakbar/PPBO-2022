// Nama : Hafidh Muhammad Akbar
// NIM  : M0521026
public class PPBO_02_Latihan3 {
    String nim, nama, alamat;
    char jenisKelamin;

    PPBO_02_Latihan3(String inputNim, String inputNama, char inputJenisKelamin, String inputAlamat){
        this.nim = inputNim;
        this.nama = inputNama;
        this.jenisKelamin = inputJenisKelamin;
        this.alamat = inputAlamat;
    }

    void CetakData(){
        System.out.println("Data Mahasiswa :");
        System.out.println("NIM : " +nim);
        System.out.println("Nama : " +nama);
        System.out.println("Jenis kelamin : " +jenisKelamin);
        System.out.println("Alamat : " +alamat);
    }

    public static void main(String[] args) {
        PPBO_02_Latihan3 latihan3 = new PPBO_02_Latihan3("M0501001", "Patrick Star", 'L', "Bikini Bottom");
        latihan3.CetakData();
    }
}

// Buatlah constructor untuk menginisiasi nilai dari variabel
// nim, nama, jenisKelamin, alamat
