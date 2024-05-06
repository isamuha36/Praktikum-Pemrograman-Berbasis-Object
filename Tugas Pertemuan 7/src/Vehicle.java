public class Vehicle {
    private String brand;
    private Integer year;
    private Double rentalPrice;

    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setYear(Integer year){
        this.year = year;
    }
    public void setRentalPrice(Double rentalPrice){
        this.rentalPrice = rentalPrice;
    }
    public String getBrand(){
        return brand;
    }
    public Integer getYear(){
        return year;
    }
    public Double getRentalPrice(){
        return rentalPrice;
    }

    public void displayInfo(){
        System.out.println("Detail Mobil:");
        System.out.println("Tahun : "+getYear());
        System.out.println("Harga Sewa : "+getRentalPrice());
    }
    public Double discountFromYear(){
        Double discountYear = 0.0;
        if (year < 2010){
            discountYear = rentalPrice * 0.1;
        }
        return discountYear;
    }
}
