import java.util.ArrayList;

public class Barang {
    private String namaBarang;
    private int hargaBarang, jumlahBarang;

    // generate setter namaBarang
//    public void setNamaBarang(String namaBarang) {
//        this.namaBarang = namaBarang;
//    }

    public Barang(String namaBarang, int hargaBarang, int jumlahBarang) {
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.jumlahBarang = jumlahBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public int getHargaBarang() {
        return hargaBarang;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }
}
