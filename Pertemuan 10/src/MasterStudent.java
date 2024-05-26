public class MasterStudent extends Student{
    @java.lang.Override
    public void ajukanTugasAKhir(String topik, String pembimbing) {
        this.finalProject = topik;
        this.advisor = pembimbing;
    }

    @Override
    public void dropOut(){
        if (semester > 8){
            this.isActive = false;
        }
    }
}
