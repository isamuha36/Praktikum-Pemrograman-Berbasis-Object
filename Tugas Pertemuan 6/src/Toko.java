import java.util.ArrayList;
import java.util.List;

public class Toko {
    List<Pembeli> antrian = new ArrayList<>();
    private Gudang gudangBarang = new Gudang();
    TIPEBARANG tipeBarang;
    enum TIPEBARANG {
        KURSI, MEJA, LEMARI
    }

    public Gudang getGudangBarang() {
        return gudangBarang;
    }
    public void tambahAntrian(Pembeli pembeli){
        if (antrian.size() > 5){
            System.out.println("antrian penuh");
        } else {
            antrian.add(pembeli);
            System.out.println("berhasil menambah antrian");
        }
    }
    public void cekIsiAntrian(){
        System.out.println();
        System.out.println("LIST ANTRIAN");
        for (int i = 0; i < antrian.size(); i++) {
            System.out.println("antrian ke "+(i+1)+"," +
                    " nama : "+antrian.get(i).getNama()+"," +
                    " barang di beli"+antrian.get(i).getBarangDiBeli()+"," +
                    " jumlah barang di baeli : "+antrian.get(i).getJumlahBarang());
        }
        System.out.println();
    }
    public void selesaikanAntrian(){
        Toko.TIPEBARANG barang = antrian.get(0).getBarangDiBeli();
        Integer jumlah = antrian.get(0).getJumlahBarang();
        Integer jumlahProduk = getGudangBarang().isiGudang.get(barang);
        if (jumlahProduk >= jumlah){
            getGudangBarang().isiGudang.put(barang, jumlahProduk - jumlah);
            antrian.remove(0);
            System.out.println(jumlah+" "+barang+" berhasil di keluarkan dari gudang");
            System.out.println("antrian terdepan berhasil di selesaikan");
        }
    }
}
