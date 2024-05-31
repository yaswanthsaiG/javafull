package TicketBooking;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

    public class TicketBookingTest {
        public static void main(String[] args){
            Ticket ticket = new Ticket();
            ticket.seatNO=01;
            ticket.status="Successful";
            ticket.ticketNUm ="01";


            Ticket ticket1 = new Ticket();
            ticket1.seatNO=02;
            ticket1.status="FAILED";
            ticket1.ticketNUm ="02";

            Ticket ticket2 = new Ticket();
            ticket2.seatNO=03;
            ticket2.status="Blocked";
            ticket2.ticketNUm="03";

            Ticket ticket3 = new Ticket();
            ticket3.seatNO=04;
            ticket3.status="Successful";
            ticket3.ticketNUm="04";

            Ticket ticket4 = new Ticket();
            ticket4.seatNO=05;
            ticket4.status="Blocked";
            ticket4.ticketNUm="05";

            List<Ticket> ticketList = new ArrayList<>();
            ticketList.add(ticket);
            ticketList.add(ticket1);
            ticketList.add(ticket2);
            ticketList.add(ticket3);
            ticketList.add(ticket4);



            Iterator<Ticket> iteratorFailed = ticketList.iterator();
            for (;iteratorFailed.hasNext();){
                Ticket ticket5 = iteratorFailed.next();
                if (ticket5.status.equals("FAILED")){
                    System.out.println("Failed tickets seat Nober "+ticket5.seatNO);
                }
            }

            Iterator<Ticket> iteratorSuccessful = ticketList.iterator();
            for (;iteratorSuccessful.hasNext();){
                Ticket ticket5 = iteratorSuccessful.next();
                if (ticket5.status.equals("Successful")){
                    System.out.println("Successful tickets seat Nober "+ticket5.seatNO);
                }
            }

            Iterator<Ticket> iteratorBlocked = ticketList.iterator();
            for (;iteratorBlocked.hasNext();){
                Ticket ticket5 = iteratorBlocked.next();
                if (ticket5.status.equals("Blocked")){
                    System.out.println(" Blocked seats "+ticket5.seatNO);
                }
            }

            Predicate<Ticket> failed = (ticket5) -> ticket5.status.equals("FAILED");


            Predicate<Ticket> successful = (ticket5) -> ticket5.status.equals("Successful");

            Predicate<Ticket> blocked = (ticket5) -> ticket5.status.equals("Blocked");

        }

    }

