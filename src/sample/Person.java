package sample;

public class Person {

  public Person(String firstName, String lastname) {
    this.firstName = firstName;
    this.lastname = lastname;
  }

  private String firstName;
  private String lastname;

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }



}
