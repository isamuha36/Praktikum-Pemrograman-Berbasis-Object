public class Salesman extends Karyawan{
    private Integer target;
    private Integer penjualan;
    public void setTarget(Integer target){
        this.target = target;
    }
    public void setPenjualan(Integer penjualan){
        this.penjualan = penjualan;
    }
    Salesman(String nama, String departemen, Character jenisKelamin){
        this.setNama(nama);
        this.setDepartemen(departemen);
        this.setJenisKelamin(jenisKelamin);
    }

    public void setNip(String nip){
        if (nip.charAt(0) == 'S'){
            this.setnip(nip);
            indeks += 1;
        }
    }
    public void setNip(Integer nip){
        if (nip > indeks){
            this.setnip("S000"+nip);
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Jabatan : Pegawai");
        super.displayInfo();
        if (penjualan >= target){
            System.out.println("Gaji : "+getGaji()*2);
        } else {
            System.out.println("Gaji : "+getGaji());
        }
        System.out.println("Cuti : "+getCuti());
        System.out.println("=============================");
    }
}
