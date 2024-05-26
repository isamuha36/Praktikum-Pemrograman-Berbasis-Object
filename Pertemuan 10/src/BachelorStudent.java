public class BachelorStudent extends Student{
    @Override
    public void ajukanTugasAKhir(String topik, String pembimbing) {
        if (semester > 6){
            this.finalProject = topik;
            this.advisor = pembimbing;
        }
    }

    @Override
    public void dropOut() {
        if (semester > 14){
            this.isActive = false;
        }
    }
}
