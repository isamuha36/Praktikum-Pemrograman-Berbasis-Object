import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Perpustakaan {
    String nama ;
    String lokasi;
    ArrayList<Buku> listBuku; //= new ArrayList<>(); ini sama seperti baris 13
    int jmlHariOprasional;

    Perpustakaan() {
        System.out.println("TEST");
        listBuku = new ArrayList<Buku>();
        jmlHariOprasional = 6;
    }

    Perpustakaan(String namaPerpus, String lokasiPerpus, Integer jmlHari){
        this.nama = namaPerpus;
        this.lokasi = lokasiPerpus;
        this.jmlHariOprasional = jmlHari;
        this.listBuku = new ArrayList<Buku>();
    }

    void printSemuaBuku(){
        for (Buku buku : this.listBuku) {
            System.out.println(buku.judul);
        }
    }

    int jmlHariLibur(){
        int totalHari = 7;
        int hariLibur = totalHari - jmlHariOprasional;

        return hariLibur;
    }

    void tambahBuku(List<Buku> bukuBaru){
        for(Buku b : bukuBaru){
            this.listBuku.add(b);
        }
//        for (int i = 0; i < bukuBaru.size(); i++){
//        Buku b = bukuBaru.get(i);
//            this.listBuku.add(b);
        }
    }


