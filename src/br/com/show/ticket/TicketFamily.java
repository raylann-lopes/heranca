package br.com.show.ticket;
public class TicketFamily extends Ticket {
    private int PersonNumber;

    @Override
    public double getValue (){
        double Value = super.getValue();
        if (PersonNumber > 3){
            this.Value = (Value * 3) * 0.95;
        } else {
            this.Value = Value * PersonNumber;
        }
        return this.Value;
    }
    public int getPersonNumber() {
        return PersonNumber;
    }

    public void setPersonNumber(int personNumber) {
        PersonNumber = personNumber;
    }
}
