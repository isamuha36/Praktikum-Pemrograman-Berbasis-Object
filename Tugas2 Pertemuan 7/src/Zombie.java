public class Zombie extends Entity {
    private Type types;

    enum Type {
        MEELE, RANGED
    }
    public Type getTypes() {
        return types;
    }
    public void setTypes(Type types) {
        this.types = types;
    }

    public Zombie(Integer level, Integer hp, Type types) {
        this.setLevel(level);
        this.setHP(hp);
        this.setTypes(types);
    }
    public void entityInfo() {
        System.out.println("# ZOMBIE DENGAN TIPE : " + getTypes() + ", DAN LEVEL : " + getLevel());
    }

    public void attack(Entity entity) {
        if (getHP() <= 0) {
            System.out.println("# ZOMBIE SUDAH MATI");
        } else if (entity.getHP() > 0) {
            if (getTypes() == Type.MEELE) {
                entity.setHP(entity.getHP() - 20);
                if (entity.getClass() == Merchant.class) {
                    System.out.println("merchant : hey heyy, ngapain nyerang");
                } else if (entity.getClass() == Player.class) {
                    System.out.println("player : UGHH");
                    if (entity.getHP() <= 0) {
                        System.out.println("# YOU DIE, GAME OVER");
                    }
                }
            } else if (getTypes() == Type.RANGED) {
                entity.setHP(entity.getHP() - 15);
                    if (entity.getClass() == Merchant.class) {
                        System.out.println("merchant : hey heyy, ngapain nyerang");
                    } else if (entity.getClass() == Player.class) {
                        System.out.println("player : UGHH");
                        if (entity.getHP() <= 0) {
                            System.out.println("# YOU DIE, GAME OVER");
                }
            }
        }
    }
}
}