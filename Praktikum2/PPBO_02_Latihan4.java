// Nama : Hafidh Muhammad Akbar
// NIM  : M0521026
public class PPBO_02_Latihan4 {

    public static void main(String[] args) {
        Person dummy1 = new Person();
        Person dummy2 = new Person();
        Person dummy3 = new Person();
        System.out.println( "Jumlah objek Person yang telah terbuat: "+Person.count);
        
        Person dummy4 = new Person();
        System.out.println( "Jumlah objek Person yang telah terbuat: "+Person.count);
    }
}


class Person
{
    static int count;

    Person(){
        count++;
    }
    /*
        Tulis kode kalian di sini 
    */
}


// Lengkapi class Person supaya dapat menghitung jumlah objek yang telah dibuat dari class Person,
// Gunakan variable static dan constructor, serta tampilkan nilai tersebut pada baris print yang telah
// disediakan 

/* Output yang diharapkan:
    Jumlah objek Person yang telah terbuat: 3 
    Jumlah objek Person yang telah terbuat: 4
 */