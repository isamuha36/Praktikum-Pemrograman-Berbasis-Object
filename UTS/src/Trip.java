import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Trip {
    private String destination;
    private Integer price;
    private Date departureDate;
    private Integer qty;
    private TripType tripType;
    enum TripType {
        FLIGHT, HOTEL, PACKAGE
    }

    public String getDestination() {
        return destination;
    }
    public Integer getPrice() {
        return price;
    }
    public Date getDepartureDate() {
        return departureDate;
    }
    public Integer getQty() {
        return qty;
    }
    public TripType getTripType() {
        return tripType;
    }
    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Trip(String destination, Integer price, String departureDate, TripType tripType, Integer qty) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        Date date;
        try {
            date = dateFormat.parse(departureDate);
        }
        catch (Exception e) {
            date = new Date();
        }

        this.destination = destination;
        this.price = price;
        this.departureDate = date;
        this.tripType = tripType;
        this.qty = qty;
    }
}
