public class Salesman extends Karyawan{
    Integer target;
    Integer penjualan;

    @Override
    public Integer hitungThr() {
        if (penjualan >= target){
            return gaji*2;
        } else {
            return gaji;
        }
    }
}
