public class MasterStudent extends Student{
    private String thesesTopic;

    public void applyThesesTopic( String ThesesTopic ) {
        this.thesesTopic = thesesTopic;
    }

    @Override
    public void requestSpv(String spv) {
        setSpv(spv);
    }
    public void propuseTheses(String theses){
        this.thesesTopic = theses;
    }
    public void propuseTheses(String theses, String spv){
        this.thesesTopic = theses;
        requestSpv(spv);
    }

    public void propuseTheses(String theses, String spv, Integer smt){
        if (getSemester() == smt){
            this.propuseTheses(theses, spv);
        }
    }
}
