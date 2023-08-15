package dev.practice.theater.book;

public class Bag {

    private Long amount;
    private Invitation invitation;

    private Ticket ticket;

    /**
     * 가방은 자의식을 가진 능동적인 존재이다.
     * - 자신의 데이터를 스스로 처리하는 자율적인 객체를 만들면 결합도를 낮출 수 있고 응집도를 높일 수 있다.
     *
     * 가방에게 티켓을 전해주면
     * - 티켓을 보관한다.
     * - 초대권이 있으면 돈을 그대로 냅두고..
     * - 초대권이 없으면 돈을 티켓 값 만큼 빼서 리턴..
     */
    public Long hold(Ticket ticket) {
        if(hasInvitation()) {
            setTicket(ticket);
            return 0L;
        }else {
            setTicket(ticket);
            minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }

    private boolean hasInvitation() {
        return invitation != null;
    }


    private void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }



    private void minusAmount(Long amount) {
        this.amount -= amount;
    }
}
