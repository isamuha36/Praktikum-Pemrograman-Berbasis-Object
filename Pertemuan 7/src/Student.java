public class Student {
    private String nama;
    private String NIM;
    private Integer semester;
    private Double IPK;
    private String spv;

    public String getSpv(){
        return spv;
    }
    public String getNama() {
        return nama;
    }
    public String getNIM() {
        return NIM;
    }
    public Integer getSemester(){
        return semester;
    }
    public Double getIPK(){
        return IPK;
    }

    public void setSpv(String spv) {
        this.spv = spv;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setNIM(String NIM) {
        this.NIM = NIM;
    }
    public void setSemester(Integer semester) {
        this.semester = semester;
    }
    public void setIPK(Double IPK) {
        this.IPK = IPK;
    }

    public void displayStudentRaport(){
        System.out.println("Nilai akhir "+nama+" adalah "+IPK);
    }
    public void requestSpv(String spv){
        if (semester > 7){
            this.spv = spv;
        }
    }
}
