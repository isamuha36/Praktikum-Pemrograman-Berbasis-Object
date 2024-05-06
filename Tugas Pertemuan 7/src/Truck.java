public class Truck extends Vehicle{
    private Integer cargoCapacity;
    public Truck(String brand, Integer year, Double rentalPrice, Integer cargoCapacity){
        this.setBrand(brand);
        this.setYear(year);
        this.setRentalPrice(rentalPrice);
        this.cargoCapacity = cargoCapacity;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Kapasitas Kargo : "+cargoCapacity);
        System.out.println("Total Diskon : "+(discountFromYear()+discountFromCargoCapacity()));
        System.out.println("Harga Sewa Setelah Diskon : "+(getRentalPrice()-(discountFromYear()
                +discountFromCargoCapacity())));
        System.out.println("----------------------------------------------------------------" +
                "-----------------------");
    }

    public Double discountFromCargoCapacity(){
        Double discountCargoCapacity = 0.0;
        if (cargoCapacity > 2000){
            discountCargoCapacity = getRentalPrice() * 0.1;
        }
        return discountCargoCapacity;
    }
}
