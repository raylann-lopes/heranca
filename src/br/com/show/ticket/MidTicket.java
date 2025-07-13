package br.com.show.ticket;

public class MidTicket extends Ticket {
    @Override
    public double getValue() {
        double Value = super.getValue();
        return Value / 2;
    }
}
