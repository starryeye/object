package dev.practice.theater.book;

public class TicketSeller {

    /**
     * TODO
     * -- 내생각 --
     * TicketSeller 가 왜.. TicketOffice 를 소유하고 있는 것인가..?
     */

    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    /**
     * -- 내생각 --
     * TicketSeller 가 TicketOffice 를 소유하고 있어서 아래의 메서드도 어색한 것 같다..
     */
    public void sellTo(Audience audience) {
        ticketOffice.sellTicketTo(audience);
    }
}
