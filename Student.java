public class Student {
  private String name;
  private int idNumber;
  private String contactNumber;

  // Define default constructor
  public Student() {
    name = "";
    idNumber = 0;
    contactNumber = "";
  }

  // Define the overloaded constructor
  public Student(String name, int idNumber, String contactNumber) {
    this.name = name;
    this.idNumber = idNumber;
    this.contactNumber = contactNumber;
  }

  // Define a toString method
  public String toString() {
    return name + " (" + contactNumber + "), Id Number: " + idNumber;
  }

  // Add a getIdNumber method
  public int getIdNumber() {
    return idNumber;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setContactNumber(String contactNumber) {
    this.contactNumber = contactNumber;
  }
}