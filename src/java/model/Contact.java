
package model;

/**
 *
 * @author Andualem Teshome
 */
public class Contact {
  
  private int id;
  private String firstName;
  private String lastName;
  private String phone;
  private String email;
  private boolean isFamily;

  public Contact() {
    firstName = "";
    lastName = "";
    phone = "";
    email = "";
    isFamily = false;
  }

  protected Contact(int id){
    this.id = id;
  }
  
  protected Contact(int id, String firstName, String lastName, String phone, 
          String email, boolean isFamily) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.phone = phone;
    this.email = email;
    this.isFamily = isFamily;
  }

  
  public Contact(String firstName, String lastName, String phone, 
          String email, boolean isFamily) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.phone = phone;
    this.email = email;
    this.isFamily = isFamily;
  }
  
  public int getId(){
    return id;
  }

  protected void setId(int id){
    this.id = id;
  }
  
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
  
  public boolean isFamily(){
    return isFamily;
  }
  
  public void setIsFamily(boolean isFamily){
    this.isFamily = true;
  }

  @Override
  public int hashCode() {
    int hash = 5;
    hash = 67 * hash + this.id;
    return hash;
  }
  
  @Override
  public boolean equals(Object o){
    if (o == null) return false;
    if (! (o instanceof Contact)) return false;
    Contact c = (Contact) o;
    return id == c.id;
  }
  
}
