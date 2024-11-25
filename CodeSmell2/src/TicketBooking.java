
public class TicketBooking {

    private TicketPrinter ticketPrinter;

    public void bookTicket(Customer customer, Ticket ticket) {
        System.out.println("Memproses pemesanan tiket...");
        ticketPrinter.printTicket(customer, ticket);
        System.out.println("Pesanan selesai.");
    }
}
