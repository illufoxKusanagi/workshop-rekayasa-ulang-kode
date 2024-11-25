
class Ticket {

    private String movieTitle;
    private String movieDate;
    private String movieTime;
    private String seatNumber;

    public Ticket(String movieTitle, String movieDate, String movieTime, String seatNumber) {
        this.movieTitle = movieTitle;
        this.movieDate = movieDate;
        this.movieTime = movieTime;
        this.seatNumber = seatNumber;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getMovieDate() {
        return movieDate;
    }

    public String getMovieTime() {
        return movieTime;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void printTicket(Ticket ticket) {
        System.out.println("Film: " + ticket.getMovieTitle() + " pada " + ticket.getMovieDate() + " jam " + ticket.getMovieTime());
    }
}
