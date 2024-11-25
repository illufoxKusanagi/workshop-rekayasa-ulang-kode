
class TicketPrinter {

    public void printTicket(Customer customer, Ticket ticket) {
        customer.printCustomer(customer);
        ticket.printTicket(ticket);
        System.out.println("Kursi: " + ticket.getSeatNumber());
    }
}
