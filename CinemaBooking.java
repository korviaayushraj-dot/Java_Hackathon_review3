class CinemaBooking {
    private String customerName;
    private String movieName;
    private double ticketPrice;
    private int numberOfTickets;
    public CinemaBooking() {
        this.customerName = "UNKNOWN";
        this.movieName = "UNKNOWN";
        this.ticketPrice = 0.0;
        this.numberOfTickets = 0;
    }
    public CinemaBooking(String customerName, String movieName, double ticketPrice, int numberOfTickets) {
        this.customerName = customerName.toUpperCase();
        this.movieName = movieName.toUpperCase();
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }
    public void bookTickets(String customerName, String movieName, double ticketPrice, int numberOfTickets) {
        this.customerName = customerName.toUpperCase();
        this.movieName = movieName.toUpperCase();
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
        calculateAndDisplay();
    }
    public void bookTickets(String customerName, String movieName, int numberOfTickets) {
        this.customerName = customerName.toUpperCase();
        this.movieName = movieName.toUpperCase();
        this.numberOfTickets = numberOfTickets;
        System.out.println("Customer Name   : " + this.customerName);
        System.out.println("Movie Name      : " + this.movieName);
        System.out.println("Number of Tickets: " + this.numberOfTickets);
    }
    public void calculateAndDisplay() {
        System.out.println("========== CINEMA TICKET BOOKING ==========");
        System.out.println();
        System.out.println("Customer Name   : " + customerName);
        System.out.println("Movie Name      : " + movieName);
        if (numberOfTickets <= 0) {
            System.out.println("Booking Status  : Booking Failed (Invalid number of tickets)");
            System.out.println();
            return;
        }
        double totalAmount = ticketPrice * numberOfTickets;
        double discount = 0.0;
        if (numberOfTickets >= 5) {
            discount = totalAmount * 0.10;
        }
        double finalAmount = totalAmount - discount;
        System.out.printf("Ticket Price    : Rs. %.2f\n", ticketPrice);
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.println("Booking Status  : Booking Successful");
        System.out.printf("Total Amount    : Rs. %.2f\n", totalAmount);
        System.out.printf("Discount        : Rs. %.2f\n", discount);
        System.out.printf("Final Amount    : Rs. %.2f\n", finalAmount);
        System.out.println();
    }
    public boolean verifyCustomer(String otherCustomerName) {
        return this.customerName.equalsIgnoreCase(otherCustomerName);
    }
}
public class Main {
    public static void main(String[] args) {
        CinemaBooking booking1 = new CinemaBooking("Sneha", "Avatar", 200.00, 5);
        booking1.calculateAndDisplay();
        CinemaBooking booking2 = new CinemaBooking();
        booking2.bookTickets("Arjun", "Avatar", 2);
    }
}