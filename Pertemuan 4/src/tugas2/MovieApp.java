package tugas2;

import java.util.ArrayList;

public class MovieApp {
    ArrayList<Film> listMovie = new ArrayList<>();
    Integer bookingId = 1;
    ArrayList<Booking> listBooking = new ArrayList<>();
    void addFilm(Film film){
        listMovie.add(film);
    }

    void displayAllFilms(){
        System.out.println("List of Films:");
        for (Film i : listMovie){
            System.out.println(i.title+" - "+i.genre+" - Duration: "+i.duration+" mins - Available Seats: "+i.availableSeats);
        }
    }
    void searchFilm(String title){
        boolean cek = false;
        for (Film i : listMovie){
            if (i.title.equals(title)){
                cek = true;
                break;
            }
        }
        if(cek){
            System.out.println("Film Tersedia");
        } else{
            System.out.println("Film Tidak Tersedia");
        }
    }

    void bookFilm(Film film, Integer numberOfTicket){
        boolean cek = false;
        for(Film i : listMovie){
            if (i == film && i.availableSeats >= numberOfTicket){
                Booking booking = new Booking(bookingId, film);
                i.availableSeats -= numberOfTicket;
                System.out.println("Pesanan berhasil dengan detail pemesanan:");
                System.out.println("Film: "+i.title);
                System.out.println("Jumlah Tiket: "+numberOfTicket);
                System.out.println("Booking ID: "+booking.bookingId);
                bookingId += 1;
                listBooking.add(booking);
                cek = true;
                break;
            }
        }
        if (!cek){
            System.out.println("Pesanan tidak dapat diproses. Kursi tidak tersedia");
        }
    }

    void searchBooking(Integer bookId){
        boolean cek = false;
        for (Booking b : listBooking) {
            if (b.bookingId.equals(bookId)){
                System.out.println("Pesanan Ditemukan");
                cek = true;
                break;
            }
        }
        if (!cek){
            System.out.println("Pesanan Tidak Ditemukan");
        }
    }
}
