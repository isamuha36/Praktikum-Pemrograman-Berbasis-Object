import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class TravelAgent {
    private List<Trip> availableTrips;
    private HashMap<String, Customer> bookings;
    Integer id;
    public TravelAgent() {
        availableTrips = new ArrayList<>();
        bookings = new HashMap<>();
    }

    public void addTrip(Trip trip) {
        availableTrips.add(trip);
    }

    public void showAvailableTrip() {
        System.out.println("Terdapat "+ availableTrips.size() + " trip yang masih tersedia:");
        for (Trip trip : availableTrips) {
            System.out.println("Destination: " + trip.getDestination() + " -- Keberangkatan : " +
                    trip.getDepartureDate() +
                    " -- Harga: " + trip.getPrice() +
                    " -- Qty: " + trip.getQty() +
                    " -- Jenis: " + trip.getTripType());
        }
    }

    public void bookTrip(Customer customer, Trip trip) {
        String customerId = customer.getId();
        if (!bookings.containsKey(customer.getId())) {
            if (trip.getQty() > 0) {
                System.out.println("Pemesanan berhasil dilakukan dengan booking id " + customerId);
                trip.setQty(trip.getQty() - 1);
                bookings.put(customerId, customer);
            } else {
                System.out.println("Pemesanan gagal, perjalanan ke " + trip.getDestination() + " telah habis terjual");
            }
        } else {
            System.out.println("Pemesanan gagal, pengguna telah memiliki pesanan pada trip yang sama dengan id " + customerId);
        }
    }

    public void cancelBooking(String email, Trip trip) {
        for (String key : bookings.keySet()) {
            if (bookings.get(key).getEmail().equals(email)) {
                System.out.println("pesanan dengan id booking " + key + " berhasil dibatalkan");
                trip.setQty(trip.getQty() + 1);
                bookings.remove(key);
                return;
            } else {
                System.out.println("pesanan tidak ditemukan");
            }
        }
    }

    public void getBookingsByCustomerEmail(String email) {
        if (bookings.containsKey(email)) {
            System.out.println("Pesanan dengan id booking " + bookings.get(email) + " berhasil ditemukan");
        } else {
            System.out.println("Tidak ditemukan pesanan untuk email " + email);
        }
    }

    public HashMap<String, Customer> getBookings() {
        return bookings;
    }
}



//if (bookings.containsKey(email)) {
//        System.out.println("Pesanan dengan id booking " + bookings.get(id) + " berhasil dibatalkan");
//        trip.setQty(trip.getQty() + 1);
//        bookings.remove(id);
//        } else {
//                System.out.println("pesanan tidak ditemukan");
//        }
//
//Terdapat 4 trip yang masih tersedia:
//Destination: Paris -- Keberangkatan : Wed May 01 00:00:00 WIB 2024 -- Harga: 15000000 -- Qty: 2 -- Jenis: FLIGHT
//Destination: New York -- Keberangkatan : Wed May 15 00:00:00 WIB 2024 -- Harga: 20000000 -- Qty: 3 -- Jenis: FLIGHT
//Destination: London -- Keberangkatan : Mon Apr 22 00:00:00 WIB 2024 -- Harga: 18000000 -- Qty: 10 -- Jenis: HOTEL
//Destination: Tokyo -- Keberangkatan : Thu Apr 25 00:00:00 WIB 2024 -- Harga: 8000000 -- Qty: 7 -- Jenis: PACKAGE
//-----------------------------------------------------------------------------------------
//Pemesanan berhasil dilakukan dengan booking id 22b03638-2f0b-43ab-948a-53551a364d90
//Pemesanan berhasil dilakukan dengan booking id 639a3d5a-d3a9-4a68-b7dc-6cfacae068da
//Pemesanan berhasil dilakukan dengan booking id e50c0830-ba19-486a-b6cc-c74156b24965
//Pemesanan gagal, perjalanan ke Paris telah habis terjual
//Pemesanan berhasil dilakukan dengan booking id 50457a48-cb74-4632-8e58-5ef5e73f5919
//Pemesanan gagal, pengguna telah memiliki pesanan pada trip yang sama dengan id 50457a48-cb74-4632-8e58-5ef5e73f5919
//-----------------------------------------------------------------------------------------
//Terdapat 3 trip yang masih tersedia:
//Destination: New York -- Keberangkatan : Wed May 15 00:00:00 WIB 2024 -- Harga: 20000000 -- Qty: 1 -- Jenis: FLIGHT
//Destination: London -- Keberangkatan : Mon Apr 22 00:00:00 WIB 2024 -- Harga: 18000000 -- Qty: 10 -- Jenis: HOTEL
//Destination: Tokyo -- Keberangkatan : Thu Apr 25 00:00:00 WIB 2024 -- Harga: 8000000 -- Qty: 7 -- Jenis: PACKAGE
//-----------------------------------------------------------------------------------------
//pesanan dengan id booking 22b03638-2f0b-43ab-948a-53551a364d90 berhasil dibatalkan
//pesanan dengan id booking 639a3d5a-d3a9-4a68-b7dc-6cfacae068da berhasil dibatalkan
//pesanan tidak ditemukan
//-----------------------------------------------------------------------------------------
//Terdapat 4 trip yang masih tersedia:
//Destination: Paris -- Keberangkatan : Wed May 01 00:00:00 WIB 2024 -- Harga: 15000000 -- Qty: 2 -- Jenis: FLIGHT
//Destination: New York -- Keberangkatan : Wed May 15 00:00:00 WIB 2024 -- Harga: 20000000 -- Qty: 1 -- Jenis: FLIGHT
//Destination: London -- Keberangkatan : Mon Apr 22 00:00:00 WIB 2024 -- Harga: 18000000 -- Qty: 10 -- Jenis: HOTEL
//Destination: Tokyo -- Keberangkatan : Thu Apr 25 00:00:00 WIB 2024 -- Harga: 8000000 -- Qty: 7 -- Jenis: PACKAGE