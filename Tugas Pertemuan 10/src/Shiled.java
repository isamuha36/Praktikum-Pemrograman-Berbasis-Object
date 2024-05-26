public class Shiled extends Item{
    private Integer damage_block;
    public Shiled(String nama, Integer rank, Double price, Integer damage_block){
        super(nama, rank, price);
        this.damage_block = damage_block;
        System.out.println("Shiled created");
        System.out.println("Name: "+nama);
        System.out.println("Rank: "+rank);
        System.out.println("Price: "+price);
        System.out.println("Damage Block: "+damage_block);
        System.out.println("----------------------");
    }
    public void defense(){
        System.out.println("Damage Mitigated by "+damage_block);
    }
}
