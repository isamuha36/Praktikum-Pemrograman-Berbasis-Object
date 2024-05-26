public abstract class Student {
    String name;
    String NIM;
    boolean isActive = true;
    String finalProject;
    String advisor;
    int semester;


    public void ajukanCuti() {
        isActive = false;
    }

    public abstract void ajukanTugasAKhir(String topik, String pembimbing);

    public abstract void dropOut();
}
