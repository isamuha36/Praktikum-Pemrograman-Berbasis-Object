import java.util.ArrayList;

public class Merchant extends Entity {
    private ArrayList<String> listItems = new ArrayList<>();

    public ArrayList<String> getListItems() {
        return listItems;
    }

    public void setListItems(ArrayList<String> listItems) {
        this.listItems = listItems;
    }

    public Merchant(Integer level, Integer hp, ArrayList<String> listItems) {
        setLevel(level);
        setHp(hp);
        setListItems(listItems);
    }

    public void entityInfo() {
        System.out.println("# MERCHANT WITH LEVEL: " + getLevel());
    }
}
