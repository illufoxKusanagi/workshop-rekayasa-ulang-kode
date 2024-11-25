
public class TicketRescheduler {

    public void rescheduleTicket(Customer customer, Ticket oldTicket, Ticket newTicket) {
        System.out.println("Memproses penggantian jadwal tiket...");
        customer.printCustomer(customer);
        System.out.println("Film: " + oldTicket.getMovieTitle());
        System.out.println("Jadwal lama: " + oldTicket.getMovieDate() + " jam " + oldTicket.getMovieTime());
        System.out.println("Jadwal baru: " + newTicket.getMovieDate() + " jam " + newTicket.getMovieTime());
        System.out.println("Kursi: " + oldTicket.getSeatNumber());
        System.out.println("Jadwal berhasil diganti.");
    }
}
