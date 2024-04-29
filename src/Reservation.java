import java.util.List;

class Reservation {
    private Flight flight;
    private String passengerName;
    private double ticketPrice;

    public Reservation(double ticketPrice, String passengerName, Flight flight) {
        this.ticketPrice = ticketPrice;
        this.passengerName = passengerName;
        this.flight = flight;
        flight.setAvilableSeats(flight.getAvilableSeats() - 1);
    }

    public Flight getFlight() {
        return flight;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

     interface  FlightReservation {
        void reserve(Flight flight, String passengerName, double ticketPrice);
        void cancel(Reservation reservation);
        List<Flight> searchFlights(String destination, String departureData);
        void displayAvailableFilghts();
     }
}
