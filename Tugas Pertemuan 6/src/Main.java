public class Main {
    public static void main(String[] args) {

        Toko mebel1 = new Toko();
        mebel1.getGudangBarang().tambahBahan(Gudang.BAHAN.KAYU, 20);
        mebel1.getGudangBarang().tambahBahan(Gudang.BAHAN.BAUT, 100);
        mebel1.getGudangBarang().tambahBahan(Gudang.BAHAN.CAT, 15);

        mebel1.getGudangBarang().buatBarang(Toko.TIPEBARANG.KURSI, 3);
        mebel1.getGudangBarang().cekStokBahan();

        mebel1.getGudangBarang().buatBarang(Toko.TIPEBARANG.KURSI, 5);
        mebel1.getGudangBarang().buatBarang(Toko.TIPEBARANG.MEJA, 5);

        mebel1.getGudangBarang().tambahBahan(Gudang.BAHAN.KAYU, 20);
        mebel1.getGudangBarang().tambahBahan(Gudang.BAHAN.BAUT, 100);
        mebel1.getGudangBarang().tambahBahan(Gudang.BAHAN.CAT, 15);
        mebel1.getGudangBarang().cekStokBahan();

        mebel1.getGudangBarang().buatBarang(Toko.TIPEBARANG.KURSI, 5);

        mebel1.getGudangBarang().cekIsiGudang();

        Pembeli pembeli1 = new Pembeli("hanif", Toko.TIPEBARANG.KURSI, 10);
        Pembeli pembeli2 = new Pembeli("muflih", Toko.TIPEBARANG.MEJA, 5);
        Pembeli pembeli3 = new Pembeli("fabih", Toko.TIPEBARANG.LEMARI, 3);

        mebel1.tambahAntrian(pembeli1);
        mebel1.tambahAntrian(pembeli2);
        mebel1.tambahAntrian(pembeli3);
        mebel1.cekIsiAntrian();

        mebel1.selesaikanAntrian();
        mebel1.cekIsiAntrian();
        mebel1.getGudangBarang().cekIsiGudang();

    }
}
// menjual 3 jenis barang yaitu kursi, meja, dan lemari.
// Gudang kayu, baut, dan cat
// Meja 3 kayu, 20 baut, 2 cat
// Kursi  2 kayu, 10 baut, 1 cat
// Lemari 5 kayu, 30 baut, 3 cat
// Gudang maskimal kursi 20, meja 10, lemari 5
// Gudang bisa merestock atau mengurangi bahan yang sudah ada dan mengecek seluruh stock bahan saat ini
// Gudang bisa memproduksi barang, memasukan atau mengeluarkan barang hasil produksi dan mengecek jumlah ketersediaan dari tiap barang
// Toko dapat menerima pembeli dan menyimpannya dalam antrian.
// Jika jumlah barang yang ingin dibeli tersedia, toko dapat menyulesaikan antrian tersebut
// Toko bisa mengecek list antrian saat ini.