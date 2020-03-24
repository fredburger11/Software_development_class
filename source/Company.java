package Software_development_class.source;

public class Company{
  private String name;
  private int id;
  
  //setters and getters
  
  //name
  public void setName(String companyName) {
    name = companyName;
  }

  public String getName() {
    return name;
  }

  //id
  public void setId(int companyID) {
    id = companyID;
  }

  public int getId() {
    return id;
  }
}