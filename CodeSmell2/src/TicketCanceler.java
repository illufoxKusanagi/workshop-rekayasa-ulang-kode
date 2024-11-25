
public class TicketCanceler implements TicketAction {

    private TicketPrinter ticketPrinter;

    @Override
    public void execute(Customer customer, Ticket ticket) {
        System.out.println("Memproses pembatalan tiket...");
        ticketPrinter.printTicket(customer, ticket);
        System.out.println("Pesanan dibatalkan.");
    }
}
