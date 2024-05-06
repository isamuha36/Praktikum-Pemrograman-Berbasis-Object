import java.util.ArrayList;
public class Merchant extends Entity{
    private ArrayList<String> list_item = new ArrayList<>();
    public ArrayList<String> getList_item() {
        return list_item;
    }
    public void setList_item(ArrayList<String> list_item) {
        this.list_item = list_item;
    }

    public Merchant(Integer level, Integer hp, ArrayList<String> list){
        this.setLevel(level);
        this.setHP(hp);
        this.setList_item(list);
    }
    public void entitiyInfo(){
        System.out.println("# MERCHANT DENGAN LEVEL : "+getLevel());
    }
}
