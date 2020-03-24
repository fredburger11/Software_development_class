package Software_development_class.source;

public class Seat{
  private String seatClass;
  private int price;
  private int number;
  private User reservation;
  

  
  //setters getters
  //seatClass
  public void setSeatClass(String seatClass) {
    seatClass = seatClass;
  }
  
  public String getSeatClass() {
    return seatClass;
  }
  
  //price
  public void setPrice(int seatPrice) {
    price = seatPrice;
  }

  public int getPrice() {
    return price;
  }

  //number
  public void setNumber(int seatNumber) {
    number = seatNumber;
  }

  public int getNumber() {
    return number;
  }

  //reservation
  public void setReservation(User seatReservation) {
    reservation = seatReservation;
  }

  public User getReservation() {
    return reservation;
  }

}