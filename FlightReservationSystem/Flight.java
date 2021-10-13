package FlightReservationSystem;

public class Flight {
    private int flightNo, flightCapacity, seatsBooked;
    private String flightAirline;

    public Flight(int flightNo, String flightAirline, int flightCapacity, int seatsBooked){
        this.flightNo = flightNo;
        this.flightAirline = flightAirline;
        this.flightCapacity = flightCapacity;
        this.seatsBooked = seatsBooked;
    }

    public String getFlightDetails(){
        return "Flight no.: "+flightNo+", Flight Airline: "+flightAirline+
                ", Flight Capacity: "+flightCapacity+", No. of seats booked: "+seatsBooked;

    }

    public void checkAvailability(){
        int availableSeats = flightCapacity - seatsBooked;
        System.out.println("Available Seats: "+availableSeats);
    }
    public void updateNoofSeatsBooked(){
        seatsBooked++;
    }

}
