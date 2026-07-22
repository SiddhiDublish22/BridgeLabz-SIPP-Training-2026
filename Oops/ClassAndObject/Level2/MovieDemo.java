package ClassAndObject.Level2;

class MovieTicket {

    String movieName;
    int seatNumber;
    double price;

    void bookTicket(String movie, int seat, double cost) {

        movieName = movie;
        seatNumber = seat;
        price = cost;
    }

    void displayTicket() {

        System.out.println("Movie: " + movieName);
        System.out.println("Seat: " + seatNumber);
        System.out.println("Price: " + price);
    }
}

public class MovieDemo {

    public static void main(String[] args) {

        MovieTicket t = new MovieTicket();

        t.bookTicket("Avengers", 15, 250);

        t.displayTicket();
    }
}
