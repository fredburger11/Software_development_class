package Software_development_class.source;

public class Seat{
    private String seatClass;
    private int price;
    private int number;
    private User reservation;



    // Setters and getters
    // SeatClass
    public void setSeatClass(String seatClass) {
        seatClass = seatClass;
    }

    public String getSeatClass() {
        return seatClass;
    }

    // Price
    public void setPrice(int seatPrice) {
        price = seatPrice;
    }

    public int getPrice() {
        return price;
    }

    // Number
    public void setNumber(int seatNumber) {
        number = seatNumber;
    }

    public int getNumber() {
        return number;
    }

    // Reservation
    public void setReservation(User seatReservation) {
        reservation = seatReservation;
    }

    public User getReservation() {
        return reservation;
    }

}
