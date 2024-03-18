import java.util.ArrayList;

public class Keranjang {

    private int jmlBarang = 0, totalBerat = 0;

    private ArrayList<Barang> listBarang = new ArrayList<>();

    private Keranjang() {
    }

    public static Keranjang getKeranjang(){
        return new Keranjang();
    }

    void tambahBarang(Barang barang){
        if(jmlBarang+barang.getJumlahBarang() <= 5){
            listBarang.add(barang);
            jmlBarang +=barang.getJumlahBarang();
            System.out.println("Berhasil memasukan ke kranjang");
        }else{
            System.out.println("Wes too, Keranjange wes mbludhag!!");
        }
    }
    int totalHarga(){
        int harga = 0;
        for ( Barang barang: listBarang
             ) {
         harga += barang.getHargaBarang() * barang.getJumlahBarang();
        }
        return harga;
    }

    void printHasil() {
        System.out.println( "Jumlah Barang Di Keranjang Saat Ini : " + jmlBarang);
        System.out.println( "Barang Pada Keranjang: ");
        for(int i = 0; i<listBarang.size(); i++){
            System.out.println("# " + listBarang.get(i).getNamaBarang() + ", jumlah : " + listBarang.get(i).getJumlahBarang());
        }
        System.out.println("Total Harga Yang Harus di Bayar : " + totalHarga());
    }


}
