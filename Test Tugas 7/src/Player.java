public class Player extends Entity {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Player(Integer level, Integer hp, String name) {
        setLevel(level);
        setHp(hp);
        setName(name);
    }

    public void entityInfo() {
        System.out.println("# PLAYER WITH NAME: " + getName() + ", AND LEVEL: " + getLevel());
    }

    public void interact(Merchant merchant) {
        if (getHp() > 0) {
            if (merchant.getHp() <= 0) {
                System.out.println("Merchant: Not in the mood for selling.");
                System.out.println("# CANNOT BUY, MERCHANT IS ANGRY");
            } else {
                System.out.println("Merchant:");
                System.out.println("Items available today:");
                for (String item : merchant.getListItems()) {
                    System.out.println("# " + item);
                }
            }
        } else {
            System.out.println("# PLAYER ALREADY DEAD");
        }
    }

    @Override
    public void attack(Entity entity) {
        if (getHp() <= 0) {
            System.out.println("# PLAYER ALREADY DEAD");
        } else if (entity.getHp() > 0) {
            entity.setHp(entity.getHp() - 10);
            if (entity instanceof Merchant) {
                System.out.println("merchant: hey heyy, why are you attacking me");
            } else if (entity instanceof Zombie) {
                System.out.println("zombie: GRAAA!");
                if (entity.getHp() <= 0) {
                    System.out.println("# ZOMBIE DEAD");
                }
            }
        }
    }
}