public class Main {

    public static void main(String[] args) {TicketBookingFacade ticketBookingFacade = new TicketBookingFacade();

        String event = "Концерт";
        String date = "26.12.2023";
        int row = 13;
        int seatNumber = 10;
        double amount = 2500;

        ticketBookingFacade.bookTicket(event, date, row, seatNumber, amount);
    }
}
