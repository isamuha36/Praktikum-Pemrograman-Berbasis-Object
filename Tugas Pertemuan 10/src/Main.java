public class Main {
    public static void main(String[] args) {
        Potion heal = new Potion("Heal Potion", 1, 100.0, 1, 50, Potion.Type.defense);
        Potion attack = new Potion("Attack Potion", 1, 100.0, 1, 50, Potion.Type.attack);
        Sword sword = new Sword("Excalibur", 1, 1000.0, 100);
        Shiled shiled = new Shiled("Aegis", 1, 1000.0, 100);
        heal.use();
        attack.use();
        sword.attack();
        shiled.defense();
    }
}