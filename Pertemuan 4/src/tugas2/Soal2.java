package tugas2;

public class Soal2 {
    public static void main(String[] args) {
        MovieApp movieApp = new MovieApp();

        Film avanger = new Film("Avanger: Endgame", "Action", 180, 50);
        Film joker = new Film("Joker", "Drama", 122, 60);
        movieApp.addFilm(avanger);
        movieApp.addFilm(joker);

        movieApp.displayAllFilms();

        movieApp.searchFilm("Joker");
        movieApp.searchFilm("Dune");

        movieApp.bookFilm(avanger, 2);
        movieApp.bookFilm(joker, 100);
        movieApp.displayAllFilms();

        movieApp.searchBooking(376);
        movieApp.searchBooking(000);
        movieApp.searchBooking(1);

    }
}
