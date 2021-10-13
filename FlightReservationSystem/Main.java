package FlightReservationSystem;

public class Main {
    public static void main(String[] args) {
        Flight flight = new Flight(123,"Vistara Airline",150,90);

        Passenger passenger = new Passenger("ABC","+91 0123456789","ABC@mail.com",
                                            "XYZ","Pune","Maharashtra");

        RegularTicket regularTicket = new RegularTicket("X1","Mumbai","Madurai",flight,
                "14/10/2021 - 10:50 pm IST","15/10/2021 - 02:50 am IST",passenger,85
        ,18000, true, "Food", "4H");

        TouristTicket touristTicket = new TouristTicket("X2","Mumbai","Hyderabad", flight,
                "15/10/2021 - 08:30 am IST","15/10/2021 - 12:00 am IST", passenger, 011,
                14000, true, "Hotel Rawstark",new String[]{"a","b","c"}, "3H 30M");

        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);
    }

    public static void printTicketDetails(Ticket ticket){
        System.out.println(ticket.getPnr());
    }
}
