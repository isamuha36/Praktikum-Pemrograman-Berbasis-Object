public class Karyawan {
    static Integer indeks = 0;
    private String nip;
    private String nama;
    private String departemen;
    private Character jenisKelamin;
    private Integer gaji;
    private Integer cuti = 12;
    public Character getJenisKelamin() {
        return jenisKelamin;
    }
    public Integer getGaji() {
        return gaji;
    }
    public Integer getCuti() {
        return cuti;
    }
    public void setnip(String nip) { this.nip = nip; }
    public void setJenisKelamin(Character jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setGaji(Integer gaji) {
        this.gaji = gaji;
    }
    public void setCuti(Integer cuti) {
        this.cuti += cuti;
    }
    public void setCuti(String cuti) {
        if (cuti == "pernikahan"){
            this.cuti += 2;
        } else if (cuti == "persalinan") {
            if(getJenisKelamin() == 'P'){
                this.cuti += 90;
            } else {
                this.cuti += 3;
            }
        }
    }
    public void displayInfo(){
        System.out.println("Nama : "+nama);
        System.out.println("Departemen : "+departemen);
        System.out.println("NIP : "+nip);
        System.out.println("Gaji : "+gaji);
    }

}
