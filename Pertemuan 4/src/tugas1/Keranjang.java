package tugas1;

import java.util.ArrayList;

public class Keranjang {
    ArrayList<Barang> listBarang = new ArrayList<>();

    void tambahBarang(Barang barang) {
        if (listBarang.size() < 3) {
            listBarang.add(barang);
            System.out.println("Berhasil memasukan ke keranjang");
        } else {
            System.out.println("Wes too, Keranjange wes mbludhag!!");
        }
    }

    void printHasil(){
        Integer totalBarang = 0;
        Integer totalHarga = 0;
        for (Barang b : listBarang){
            totalBarang += b.jumlahBarang;
        }
        System.out.println("Jumlah Barang Di Keranjang Saat ini : "+totalBarang);
        System.out.println("Barang Pada Keranjang");
        for (Barang b : listBarang){
            System.out.println("# "+b.namaBarang+", jumlah : "+b.jumlahBarang);
            totalHarga += b.hargaBrang * b.jumlahBarang;
        }
        System.out.println("Total Harga Yang Harus di Bayar : "+totalHarga);

    }
}