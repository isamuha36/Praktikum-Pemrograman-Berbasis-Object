public class InternationalStudent extends Student{
    private String nationality;
    private String language;
    public String getNationality(){
        return nationality;
    }
    public String getLanguage(){
        return language;
    }
    public void setNationality(String nationality){
        this.nationality = nationality;
    }
    public void setLanguage(String language){
        this.language = language;
    }

    @Override
    public void displayStudentRaport() {
        super.displayStudentRaport();
        System.out.println(getNama() + "'s final results is " + getIPK());
    }
}
