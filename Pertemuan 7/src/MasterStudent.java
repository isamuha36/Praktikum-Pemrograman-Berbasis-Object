public class MasterStudent extends Student{
    private String thesesTopic;

    public void applyThesesTopic( String ThesesTopic ) {
        this.thesesTopic = thesesTopic;
    }

    @Override
    public void requestSpv(String spv) {
        setSpv(spv);
    }
}
