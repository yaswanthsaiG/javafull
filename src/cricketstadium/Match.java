package cricketstadium;

import java.time.LocalDateTime;

public class Match {
    private final String teams;
    private final LocalDateTime dateTime;
    private final double ticketPrice;
    private int availableSeats;

    public Match(String teams, LocalDateTime dateTime, double ticketPrice, int availableSeats) {
        this.teams = teams;
        this.dateTime = dateTime;
        this.ticketPrice = ticketPrice;
        this.availableSeats = availableSeats;
    }

    public String getTeams() {
        return teams;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public boolean bookTicket() {
        if (availableSeats > 0) {
            availableSeats--;
            return true;
        }
        return false;
    }
}