package dev.practice.theater.book;

import java.util.ArrayList;
import java.util.List;

public class TicketOffice {

    private Long amount;

    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(Long amount, List<Ticket> tickets) {
        this.amount = amount;
        this.tickets = tickets;
    }

    public void sellTicketTo(Audience audience) {

        Ticket ticket = getTicket();

        Long amount = audience.buy(ticket);

        plusAmount(amount);
    }

    private void plusAmount(Long amount) {
        this.amount += amount;
    }

    private Ticket getTicket() {
        return tickets.remove(0);
    }
}
