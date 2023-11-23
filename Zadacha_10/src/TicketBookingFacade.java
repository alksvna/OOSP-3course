class TicketBookingFacade {
    private EventSelection eventSelection;
    private SeatSelection seatSelection;
    private TicketPayment ticketPayment;

    public TicketBookingFacade() {
        this.eventSelection = new EventSelection();
        this.seatSelection = new SeatSelection();
        this.ticketPayment = new TicketPayment();
    }

    public void bookTicket(String event,  String date, int row, int seatNumber, double amount) {
        eventSelection.selectionEvent(event, date);
        seatSelection.selectSeat(row, seatNumber);
        ticketPayment.makePayment(amount);
    }
}
