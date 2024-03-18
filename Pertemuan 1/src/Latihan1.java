import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        int panjang = 58;
        int lebar = 88;
        int tinggi = 7;
        System.out.println("volume balok adalah "+panjang * lebar * tinggi);

        int alasSegitiga = 98;
        int tinggiSegitiga = 57;
        double setengah = 0.5;
        double LuasSegitiga = 1/2* alasSegitiga* tinggi;
        System.out.println(LuasSegitiga);
        double setengahCoba = 1.0/2;
        System.out.println(setengahCoba);
        double cek = 2/3;
        System.out.println("coba cek: "+cek);
        System.out.println("Luas segitiga adalah "+setengah* alasSegitiga * tinggiSegitiga);

        System.out.println("masukan jumlah galon");
//        double konversi = 3.7854;
        float konversi = 3.7854f;
//        int jumlahGalon = 10;
        Scanner scan = new Scanner(System.in);
        int jmlGalon = scan.nextInt();
        float hasil = konversi*jmlGalon;
        scan.close();
        System.out.println("Liter galon: "+hasil);

        System.out.printf("%.3f", hasil);

//        Scanner input = new Scanner(System.in);
//        String inputString = input.next();
//        input.close();
//        System.out.printf("Nama: %s", inputString);
    }
}
