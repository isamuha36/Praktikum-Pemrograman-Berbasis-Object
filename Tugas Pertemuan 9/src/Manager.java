public class Manager extends Karyawan{
    Manager(String nama, String departemen, Character jenisKelamin){
        this.setNama(nama);
        this.setDepartemen(departemen);
        this.setJenisKelamin(jenisKelamin);
    }

    public void setNip(String nip){
        if (nip.charAt(0) == 'M'){
            this.setnip(nip);
            indeks += 1;
        }
    }
    public void setNip(Integer nip){
        if (nip > indeks){
            this.setnip("M000"+nip);
        }
    }
    @Override
    public void displayInfo() {
        System.out.println("Jabatan : Manager");
        super.displayInfo();
        System.out.println("Gaji : "+getGaji()*2);
        System.out.println("Cuti : "+getCuti());
        System.out.println("=============================");
    }
}
