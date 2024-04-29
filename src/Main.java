public class Main {
    public static void main(String[] args) {
      BookingSystem bookingSystem = new BookingSystem();
      bookingSystem.addFlight(new Flight("Wrocław", "Rzym", "20-02-2024", 4,35));
        bookingSystem.addFlight(new Flight("Warszawa", "Bolonia", "29-02-2024", 4,35));
      bookingSystem.displayAvailableFlights();

      Flight flight1 = bookingSystem.searchFlights("Wrocław","20 luty").get(0);

      bookingSystem.makeReservation(flight1, "jakub Duren",500 );

      bookingSystem.displayAvailableFlights();

      int reservation = bookingSystem.searchFlights("Wrocław", "20-02-2024").get(0).getAvilableSeats();

      bookingSystem.cancelReservation(reservation);
      bookingSystem.displayAvailableFlights();
    }
}