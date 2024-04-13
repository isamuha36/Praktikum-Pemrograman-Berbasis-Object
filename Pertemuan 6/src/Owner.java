import java.util.Date;

public class Owner {
    private String name;
    private String Addres;
    private Integer NIK;
    private String job;
    private String gender;
    private Date birthDate;

    public Owner(String name, String Addres, Integer NIK, String job, String gender, Date birthDate){
        this.name = name;
        this.Addres = Addres;
        this.NIK = NIK;
        this.job = job;
        this.gender = gender;
        this.birthDate = birthDate;
    }

    public String getName(){
        return name;
    }
    public String getAddres(){
        return Addres;
    }
    public Integer getNIK(){
        return NIK;
    }
    public String getJob(){
        return job;
    }
    public String getGender(){
        return gender;
    }
    public Date getBirthDate(){
        return birthDate;
    }
}
