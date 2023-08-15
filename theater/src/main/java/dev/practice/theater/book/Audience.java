package dev.practice.theater.book;

public class Audience {

    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    /**
     * 관람객은 티켓을 살 수 있다. (티켓을 사면 돈을 리턴해준다.)
     *
     * 가방에게 티켓을 맡긴다.
     *
     * 가방에서 돈을 빼는 행위를 얘가 해야할 것 같지만..
     * 가방도 자의식을 가졌다 라고 생각해야한다...
     */
    public Long buy(Ticket ticket) {
        return bag.hold(ticket);
    }
}
