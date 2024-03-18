import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        Buku buku1 = new Buku();
        buku1.judul = "Introduction Software";
        buku1.id = 2;
        buku1.jmlHalaman = 5000;
        buku1.author = "JK Rowling";

        Buku buku2 = new Buku();
        buku2.judul = "Software Engineer";
        buku2.id = 2;
        buku2.jmlHalaman = 5000;
        buku2.author = "JK Rowling";

        Perpustakaan perpusSV = new Perpustakaan();
        perpusSV.nama = "Perpustakaan Sekolah Vokasi";
        perpusSV.lokasi = "Sekip xxx";
        perpusSV.listBuku.add(buku1);
        perpusSV.listBuku.add(buku2);

        System.out.println(perpusSV.jmlHariOprasional);

        Perpustakaan perpusat = new Perpustakaan("Perpustakaan UGM", "UGM", 5);
        System.out.println(perpusat.lokasi);

        perpusat.listBuku.add(buku1);
        perpusat.listBuku.add(buku2);
        perpusat.printSemuaBuku();

        int i = perpusat.jmlHariLibur();
        System.out.println(i);

        Buku b1 = new Buku();
        b1.judul = "OOP 1";
        Buku b2 = new Buku();
        b2.judul = "OOP 2";

        List<Buku> bukubaru = new ArrayList<>();
        bukubaru.add(b1);
        bukubaru.add(b2);
        perpusat.tambahBuku(bukubaru);
        perpusat.printSemuaBuku();
    }
}
//atribut;
//method;
//constructor;