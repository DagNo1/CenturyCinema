package Model;

import java.util.ArrayList;

public class Reservation {
    int screening_id;
    int ticket_seller_id;
    ArrayList<String> Reserved_seats;

    public int getScreening_id() {
        return screening_id;
    }

    public void setScreening_id(int screening_id) {
        this.screening_id = screening_id;
    }

    public int getTicket_seller_id() {
        return ticket_seller_id;
    }

    public void setTicket_seller_id(int ticket_seller_id) {
        this.ticket_seller_id = ticket_seller_id;
    }

    public ArrayList<String> getReserved_seats() {
        return Reserved_seats;
    }

    public void setReserved_seats(ArrayList<String> Reserved_seats) {
        this.Reserved_seats = Reserved_seats;
    }
}
