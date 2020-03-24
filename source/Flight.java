package Software_development_class.source;

public class Flight{
  private Airport start;
  private Airport end;
  private int takeoff;
  private int landing;
  private int number;
  private String type;
  private Company company;
  private String amenities;



  //setters and getters
  //start
  public void setStart(Airport flightStart) {
    start = flightStart;
  }
  
  public Airport getStart() {
    return end;
  }
  //end
  public void setEnd(Airport flightEnd) {
    end = flightEnd;
  }
  
  public Airport getEnd() {
    return end;
  }
  //takeoff
  public void setTakeOff(int flightTakeOff) {
    takeoff = flightTakeOff;
  }

  public int getTakeOff() {
    return takeoff;
  }
  //landing
  public void setLanding(int flightLanding) {
    landing = flightLanding;
  }

  public int getLanding() {
    return landing;
  }
  //type
  public void setType(String flightType) {
    type = flightType;
  }

  public String getType() {
    return type;
  }
  //number
  public void setNumber(int flightNumber) {
    number = flightNumber;
  }

  public int getNumber() {
    return number;
  }

  //company
  public void setCompany(Company flightCompany) {
    company = flightCompany;
  }

  public Company getCompany() {
    return company;
  }
  //amenities
  public void setAmenities(String flightAmenities) {
    amenities = flightAmenities;
  }

  public String getFlightAmenities() {
    return amenities;
  }
  /*
  public void setFlightSeatReserve(boolean flightSeatReserve) {
    this.flightSeatReserve = flightSeatReserve;
  }

  public boolean getFlightSeatReserve() {
    return flightSeatReserve;
  }
  */
}