package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andualem Teshome
 */
public class ContactService {

  private int nextId = 0;
  private final List<Contact> contacts;

  public final static ContactService instance = new ContactService();

  private ContactService() {
    contacts = new ArrayList<>(
            List.of(
                    new Contact(nextId++, "Joe", "Smith", "724-2414", "joe@gmail.com", true),
                    new Contact(nextId++, "Mike", "Brown", "234-241", "mike@gmail.com", false)
            )
    );
  }

  public List<Contact> getContacts() {
    return List.copyOf(contacts);
  }
  
  public Contact getContactById(int id){
    for(Contact c: contacts)
      if (c.getId()== id)
        return c;
    return null;
  }

  public void addContact(Contact c) {
    c.setId(nextId++);
    contacts.add(c);
  }

  public void addContact(String first, String last,
          String phone, String email, boolean family) {
    contacts.add(new Contact(nextId++, first, last,
            "000-000", "email@email", false));
  }

  public void removeContact(int id) {
    contacts.remove(new Contact(id));
  }

  public void updateContact(Contact c) {
    for (int i = 0; i < contacts.size(); i++) {
      if (contacts.get(i).getId() == c.getId()) {
        contacts.set(i, c);
        break;
      }
    }
  }
  
  public void updateContact(int id, String firstName, String lastName, String phone, String email, boolean family){
    updateContact(new Contact(id, firstName, lastName, phone, email, family));
  }
}
