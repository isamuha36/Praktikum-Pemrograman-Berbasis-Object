public class Pembeli {
    private String nama;
    private Toko.TIPEBARANG barangDiBeli;
    private Integer jumlahBarang;
    public String getNama(){
        return nama;
    }
    public Toko.TIPEBARANG getBarangDiBeli(){ return  barangDiBeli; }
    public Integer getJumlahBarang() { return jumlahBarang; }
    Pembeli(String nama, Toko.TIPEBARANG barangDiBeli, Integer jumlahBarang) {
        this.nama = nama;
        this.barangDiBeli = barangDiBeli;
        this.jumlahBarang = jumlahBarang;
    }
}