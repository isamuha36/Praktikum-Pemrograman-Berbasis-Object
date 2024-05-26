public class Sword extends Item{
    private Integer damage;
    public Sword(String nama, Integer rank, Double price, Integer damage){
        super(nama, rank, price);
        this.damage = damage;

        System.out.println("Sword created");
        System.out.println("Name: "+nama);
        System.out.println("Rank: "+rank);
        System.out.println("Price: "+price);
        System.out.println("Damage: "+damage);
        System.out.println("----------------------");
    }
    public void attack(){
        System.out.println("Damage dealt by "+damage);
    }
}
