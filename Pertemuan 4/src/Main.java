// Kelas utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat objek Lingkaran dengan jari-jari 5
        Lingkaran lingkaran1 = new Lingkaran(5);

        // Menggunakan objek untuk menghitung luas dan keliling lingkaran
        System.out.println("Luas lingkaran: " + lingkaran1.hitungLuas());
        System.out.println("Keliling lingkaran: " + lingkaran1.hitungKeliling());
    }
}