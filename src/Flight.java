public class Flight {
    private String destination;
    private String departure;
    private String departureDate;
    private int duration;
    private int avilableSeats;

    public Flight(String destination, String departure, String departureDate, int duration, int avilableSeats) {
        this.destination = destination;
        this.departure = departure;
        this.departureDate = departureDate;
        this.duration = duration;
        this.avilableSeats = avilableSeats;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public int getAvilableSeats() {
        return avilableSeats;
    }

    public int getDuration() {
        return duration;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setAvilableSeats(int avilableSeats) {
        this.avilableSeats = avilableSeats;
    }

}
