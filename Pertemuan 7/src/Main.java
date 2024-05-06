public class Main {
    public static void main(String[] args) {
        Student nino = new Student();
        nino.setNama("Nino");
        nino.setNIM("TRPL01");
        nino.setSemester(2);
        nino.setIPK(4.0);
        nino.displayStudentRaport();

        InternationalStudent bule = new InternationalStudent();
        bule.setNama("Nino Bule");
        bule.setNIM("TRPL-INT-01");
        bule.setSemester(1);
        bule.setLanguage("English");
        bule.setNationality("American");
        bule.setIPK(4.0);
        bule.displayStudentRaport();

    }
}