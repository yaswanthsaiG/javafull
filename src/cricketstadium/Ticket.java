package cricketstadium;

public class Ticket {
    private final int seatNumber;
    private final double price;
    public Ticket(Match ignoredMatch, int seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public double getPrice() {
        return price;
    }

}

