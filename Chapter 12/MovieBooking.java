class BookTheaterSeat {
    int totalSeats = 10;
    synchronized void bookSeat(int seats){
        if(totalSeats >= seats){
            System.out.println(seats + "Booked succussfully");
            totalSeats = totalSeats - seats;
            System.out.println("Seats left : " + totalSeats);
        }
        else{
            System.out.println("Seats are not available.");
            System.out.println("Seats left " + totalSeats);
        }
    }
}

public class MovieBooking extends Thread{
    static BookTheaterSeat b;
    int seats;
    public void run(){
        b.bookSeat(seats);
    }

    public static void main(String[] args) {
        b = new BookTheaterSeat();
        MovieBooking reena = new MovieBooking();
        reena.seats = 5;
        reena.start();

        MovieBooking mahesh = new MovieBooking();
        mahesh.seats = 6;
        mahesh.start();
    }
}

