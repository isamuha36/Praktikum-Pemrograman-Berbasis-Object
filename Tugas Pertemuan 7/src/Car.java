public class Car extends Vehicle{
    private CarType carType;
    public Car(String brand, Integer year, Double rentalPrice, CarType type){
        this.setBrand(brand);
        this.setYear(year);
        this.setRentalPrice(rentalPrice);
        this.carType = type;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Tipe Mobil : "+carType);
        System.out.println("Total Diskon : "+(discountFromYear()+discountFromType()));
        System.out.println("Harga sewa setelah diskon : "+(getRentalPrice()-
                (discountFromYear()+discountFromType())));
        System.out.println("------------------------------------------------" +
                "---------------------------------------");
    }

    public Double discountFromType(){
        Double discountType = 0.0;
        if(carType == CarType.FAMILY_CAR){
            discountType = getRentalPrice() * 0.05;
        } else if (carType == CarType.PREMIUM_CAR) {
            discountType = getRentalPrice() * 0.1;
        }
        return discountType;
    }
}
