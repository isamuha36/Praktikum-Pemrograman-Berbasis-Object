public class Player extends Entity{
    private String name;
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public Player(Integer level, Integer hp, String name){
        this.setLevel(level);
        this.setHP(hp);
        this.setName(name);
    }

    public void entityInfo(){
        System.out.println("# PLAYER DENGAN NAMA : "
                +getName()+", DAN level : "+ getLevel());
    }
    public void interact(Merchant merchant){
        if (getHP() > 0){
            if (merchant.getHP() <= 0){
                System.out.println("Merchant : Dah lah males jualan");
                System.out.println("# TIDAK BISA BELI, MERCHANT NGAMBEK");
            } else {
                System.out.println("Merchant :");
                System.out.println("Barang tersedia hari ini");
                for (String item : merchant.getList_item()){
                    System.out.println("# "+item);
                }
            }
        } else {
            System.out.println("# PLAYER SUDAH MATI");
        }
    }

    public void attack(Entity entity) {
        if (getHP() <= 0){
            System.out.println("# PLAYER SUDAH MATI");
        } else if (entity.getHP() > 0) {
            entity.setHP(entity.getHP()-10);
            if (entity.getClass() == Merchant.class) {
                System.out.println("merchant : hey heyy, ngapain nyerang");
            } else if (entity.getClass() == Zombie.class) {
                System.out.println("zombie : GRAAA!");
                if (entity.getHP() <= 0){
                    System.out.println("# ZOMBIE MATI");
                }
            }
        }
    }
}
