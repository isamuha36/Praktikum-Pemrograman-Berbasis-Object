public class Pegawai extends Karyawan {
    public void setNip(String nip){
        if (nip.charAt(0) == 'P'){
            this.setnip(nip);
            indeks += 1;
        }
    }
    public void setNip(Integer nip){
        if (nip > indeks){
            this.setnip("P000"+nip);
        }
    }

    Pegawai(String nama, String departemen, Character jenisKelamin){
        this.setNama(nama);
        this.setDepartemen(departemen);
        this.setJenisKelamin(jenisKelamin);
    }

    @Override
    public void displayInfo() {
        System.out.println("Jabatan : Pegawai");
        super.displayInfo();
        System.out.println("Gaji : "+getGaji());
        System.out.println("Cuti : "+getCuti());
        System.out.println("=============================");
    }
}