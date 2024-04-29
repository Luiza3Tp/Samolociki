import java.util.ArrayList;
import java.util.List;

public class BookingSystem implements FlightReservationSystem {
    private List<Flight> flights;
    private List<Reservation> reservations;

    public BookingSystem() {
        flights = new ArrayList<Flight>();
        reservations = new ArrayList<>();

    }

    @Override
    public void makeReservation(Flight flight, String passengerName, double ticketPrice) {
        if(flight.getAvilableSeats() >0){
            Reservation reservation = new Reservation(ticketPrice, passengerName, flight);
            reservations.add(reservation);
            System.out.println("rezerwacja zakończona pomyślnie");
        }else{
            System.out.println("rezerwacja nie udana spróbuj pownownie");
        }
    }

    @Override
    public void cancelReservation(Reservation reservation) {
        Flight flight = reservation.getFlight();
        flight.setAvilableSeats(flight.getAvilableSeats() + 1);
        reservations.remove(reservation);
        System.out.println("rezerwacja anulowana");

    }

    @Override
    public List<Flight> searchFlights(String destination, String departureData) {
        List<Flight> matchingFlight =  new ArrayList<>();
        for(Flight flight : flights) {
            if (flight.getDestination().equalsIgnoreCase(destination) && flight.getDeparture().equals(departureData)) {
                matchingFlight.add(flight);
            }
        }
            return matchingFlight;
    }


    @Override
    public void displayAvailableFlights() {
        System.out.println("dostępne loty:");
        for(Flight flight : flights) {
            System.out.println("przyloty: " + flight.getDestination()+" odloty"+ flight.getDeparture() +
                    " data " +flight.getDepartureDate() + " czas trwania "+ flight.getDuration()+
                    "H , ilość wolnych miejsc" + flight.getAvilableSeats());

        }
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }
}
