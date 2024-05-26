public class Potion extends Item{
    private Integer duration;
    private Integer effect_point;
    private Type tipe;
    public enum Type{
        attack, defense
    }

    public Potion(String nama, Integer rank, Double price, Integer duration, Integer effect_point, Type tipe){
        super(nama, rank, price);
        this.duration = duration;
        this.effect_point = effect_point;
        this.tipe = tipe;
        System.out.println("Potion created");
        System.out.println("Name: "+nama);
        System.out.println("Rank: "+rank);
        System.out.println("Price: "+price);
        System.out.println("Duration: "+duration);
        System.out.println("Effect Point: "+effect_point);
        System.out.println("Type: "+tipe);
        System.out.println("----------------------");

    }

    public void use(){
        if (tipe == Type.attack){
            attack();
        } else if (tipe == Type.defense){
            defense();
        }
    }
    public void attack(){
        System.out.println("Damage dealt by "+ effect_point);
    }
    public void defense(){
        System.out.println("Damage Mitigated by "+effect_point);
    }
}
