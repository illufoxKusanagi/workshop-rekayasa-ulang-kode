
public class TicketBooking implements TicketAction {

    private TicketPrinter ticketPrinter;

    @Override
    public void execute(Customer customer, Ticket ticket) {
        System.out.println("Memproses pemesanan tiket...");
        ticketPrinter.printTicket(customer, ticket);
        System.out.println("Pesanan selesai.");
    }
}
