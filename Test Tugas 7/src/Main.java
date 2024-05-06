import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> listItem = new ArrayList<String>() {{
            add("SWORD");
            add("SHIELD");
            add("POTION");
        }};
        Player player1 = new Player(10, 50, "wahab");
        Merchant merchant1 = new Merchant(20, 20, listItem);
        Zombie zombie1 = new Zombie(5, 30, Zombie.Type.MELEE);
        Zombie zombie2 = new Zombie(5, 15, Zombie.Type.RANGED);

        System.out.println("TEST OBJECT INFO");
        player1.entityInfo();
        merchant1.entityInfo();
        zombie1.entityInfo();
        zombie2.entityInfo();

        System.out.println("===================================\n");

        System.out.println("TEST MERCHANT INTERACTION");
        player1.interact(merchant1);

        System.out.println("");
        player1.attack(merchant1);
        player1.attack(merchant1);
        player1.interact(merchant1);
        System.out.println("===================================\n");

        System.out.println("TEST ZOMBIE ATTACK");
        player1.attack(zombie1);
        player1.attack(zombie1);
        player1.attack(zombie1);
        zombie1.attack(player1);
        System.out.println("===================================\n");

        System.out.println("TEST PLAYER ATTACK");
        zombie2.attack(player1);
        zombie2.attack(player1);
        zombie2.attack(player1);
        zombie2.attack(player1);
        player1.interact(merchant1);
        player1.attack(zombie1);
    }
}