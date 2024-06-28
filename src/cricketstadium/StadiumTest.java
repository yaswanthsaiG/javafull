package cricketstadium;

import java.time.LocalDateTime;

public class StadiumTest {
    public static void main() {
        // Create a stadium
        Stadium stadium = new Stadium("CityABC", 10000);

        // Create a match
        Match match = new Match("TeamA vs TeamB", LocalDateTime.now().plusDays(7), 25.0, stadium.getSeatingCapacity());

        // Book a ticket
        if (match.bookTicket()) {
            Ticket ticket = new Ticket(match, 101, match.getTicketPrice());
            System.out.println(STR."Ticket booked successfully for Match: \{match.getTeams()} at \{match.getDateTime()}. Seat Number: \{ticket.getSeatNumber()}. Price: $\{ticket.getPrice()}");
        } else {
            System.out.println("Sorry, no more seats available for the match.");
        }
    }
}
