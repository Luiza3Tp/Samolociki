import java.util.List;

public interface FlightReservationSystem {
    void makeReservation(Flight flight, String passengerName, double ticketPrice);

    void cancelReservation(Reservation reservation);

    List<Flight> searchFlights(String destination, String departureData);

    void displayAvailableFlights();
}
