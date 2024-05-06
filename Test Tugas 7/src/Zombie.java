public class Zombie extends Entity {
    private Type type;

    public enum Type {
        MELEE, RANGED
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Zombie(Integer level, Integer hp, Type type) {
        setLevel(level);
        setHp(hp);
        setType(type);
    }

    public void entityInfo() {
        System.out.println("# ZOMBIE WITH TYPE: " + getType() + ", AND LEVEL: " + getLevel());
    }

    @Override
    public void attack(Entity entity) {
        if (getHp() <= 0) {
            System.out.println("# ZOMBIE ALREADY DEAD");
        } else if (entity.getHp() > 0) {
            int damage = (getType() == Type.MELEE) ? 20 : 15;
            entity.setHp(entity.getHp() - damage);
            if (entity instanceof Merchant) {
                System.out.println("merchant: hey heyy, why are you attacking me");
            } else if (entity instanceof Player) {
                System.out.println("player: UGHH");
                if (entity.getHp() <= 0) {
                    System.out.println("# YOU DIE, GAME OVER");
                }
            }
        }
    }
}