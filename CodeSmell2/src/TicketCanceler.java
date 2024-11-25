
public class TicketCanceler {

    private TicketPrinter ticketPrinter;

    public void cancelTicket(Customer customer, Ticket ticket) {
        System.out.println("Memproses pembatalan tiket...");
        ticketPrinter.printTicket(customer, ticket);
        System.out.println("Pesanan dibatalkan.");
    }
}
