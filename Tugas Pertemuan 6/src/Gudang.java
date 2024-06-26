import java.net.http.HttpResponse;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicIntegerArray;

public class Gudang {
    BAHAN bahan;
    enum BAHAN {
        BAUT, KAYU, CAT
    }
    HashMap<Toko.TIPEBARANG, Integer> isiGudang = new HashMap<>();
    HashMap<BAHAN, Integer> stokBahan = new HashMap<>();

    Gudang(){
        isiGudang.put(Toko.TIPEBARANG.MEJA, 0);
        isiGudang.put(Toko.TIPEBARANG.KURSI, 0);
        isiGudang.put(Toko.TIPEBARANG.LEMARI, 0);
    }

    public HashMap cekStokBahan() {
        System.out.println();
        System.out.println("STOK BAHAN :");
        for (BAHAN key : stokBahan.keySet()){
            Integer value = stokBahan.get(key);
            System.out.println("jumlah : "+key+", saat ini adalah : "+value+" buah");
        }
        System.out.println();
        return stokBahan;
    }
    public HashMap cekIsiGudang() {
        System.out.println();
        System.out.println("ISI GUDANG: ");
        for (Toko.TIPEBARANG key : isiGudang.keySet()){
            Integer value = isiGudang.get(key);
            System.out.println("jumlah : "+key+", saat ini adalah : "+value+" buah");
        }
        System.out.println();
        return isiGudang;
    }
    public void tambahBahan(BAHAN bahan, Integer jumlah){
        if (stokBahan.containsKey(bahan)){
            stokBahan.put(bahan, stokBahan.get(bahan) + jumlah);
        } else{
            stokBahan.put(bahan, jumlah);
        }
    }
    public void kurangiBahan(BAHAN bahan, Integer jumlah){
        if (stokBahan.containsKey(bahan)){
            stokBahan.put(bahan, stokBahan.get(bahan) - jumlah);
        } else{
            System.out.println("Bahan tidak ditemukan");
        }
    }
    public Boolean slotTersedia(Toko.TIPEBARANG tipebarang, Integer jumlah) {
        Boolean cek = false;
        switch (tipebarang){
            case KURSI -> {
                if ((isiGudang.get(tipebarang)+ jumlah) <= 20){
                    cek = true;
                }
            } case MEJA -> {
                if ((isiGudang.get(tipebarang)+ jumlah) <= 10){
                    cek = true;
                }
            } case LEMARI -> {
                if ((isiGudang.get(tipebarang)+ jumlah) <= 5){
                    cek = true;
                }
            }
        }
        return cek;
    }
    public Boolean bahanPembuatanMencukupi(Toko.TIPEBARANG tipebarang, Integer jumlah){
        Boolean cek = false;
        switch (tipebarang){
            case KURSI -> {
                if(stokBahan.get(BAHAN.KAYU) >= 2*jumlah && stokBahan.get(BAHAN.BAUT)
                        >= 10*jumlah && stokBahan.get(BAHAN.CAT) >= 1*jumlah){
                    cek = true;
                }
            }
            case MEJA -> {
                if(stokBahan.get(BAHAN.KAYU) >= 3*jumlah && stokBahan.get(BAHAN.BAUT)
                        >= 20*jumlah && stokBahan.get(BAHAN.CAT) >= 2*jumlah){
                    cek = true;
                }
            }
            case LEMARI -> {
                if(stokBahan.get(BAHAN.KAYU) >= 5*jumlah && stokBahan.get(BAHAN.BAUT)
                        >= 30*jumlah && stokBahan.get(BAHAN.CAT) >= 3*jumlah){
                    cek = true;
                }
            }
        }
        return cek;
    }
    public void masukanBarangKeGudang(Toko.TIPEBARANG tipeBarang, Integer jumlah){
        isiGudang.put(tipeBarang, isiGudang.get(tipeBarang) + jumlah);
        System.out.println(jumlah+" "+tipeBarang+" berhasil di tambahkan ke gudang");
    }
    public void keluarkanBarangDariGudang(Toko.TIPEBARANG barang, Integer jumlah){
        isiGudang.put(barang, isiGudang.get(barang) - jumlah);
    }
    public void buatBarang(Toko.TIPEBARANG tipebarang, Integer jumlah) {
        if (slotTersedia(tipebarang, jumlah)) {
            if (bahanPembuatanMencukupi(tipebarang, jumlah)) {
                switch (tipebarang) {
                    case KURSI -> {
                        kurangiBahan(BAHAN.BAUT, 10 * jumlah);
                        kurangiBahan(BAHAN.KAYU, 2 * jumlah);
                        kurangiBahan(BAHAN.CAT, 1 * jumlah);
                        masukanBarangKeGudang(tipebarang, jumlah);
                    }
                    case MEJA -> {
                        kurangiBahan(BAHAN.BAUT, 20 * jumlah);
                        kurangiBahan(BAHAN.KAYU, 3 * jumlah);
                        kurangiBahan(BAHAN.CAT, 2 * jumlah);
                        masukanBarangKeGudang(tipebarang, jumlah);
                    }
                    case LEMARI -> {
                        kurangiBahan(BAHAN.BAUT, 30 * jumlah);
                        kurangiBahan(BAHAN.KAYU, 5 * jumlah);
                        kurangiBahan(BAHAN.CAT, 3 * jumlah);
                        masukanBarangKeGudang(tipebarang, jumlah);
                    }
                }
            } else {
                System.out.println("Bahan tidak mencukupi");
            }
        }
    }
}