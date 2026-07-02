import java.util.*;

class Contact {
    String name, phone, email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String toString() {
        return name + " | " + phone + " | " + email;
    }
}

public class AddressBookApp {
    public static void main(String[] args) {
        ArrayList<Contact> contacts = new ArrayList<>();
        HashMap<String, Contact> nameMap = new HashMap<>();
        HashSet<String> phoneSet = new HashSet<>();

        addContact(contacts, nameMap, phoneSet, "Siddhi", "9999999999", "siddhi@gmail.com");
        addContact(contacts, nameMap, phoneSet, "Rahul", "8888888888", "rahul@gmail.com");
        addContact(contacts, nameMap, phoneSet, "Aman", "9999999999", "aman@gmail.com");

        searchContact(nameMap, "Siddhi");

        deleteContact(contacts, nameMap, phoneSet, "Rahul");

        displaySorted(contacts);
    }

    static void addContact(ArrayList<Contact> contacts, HashMap<String, Contact> nameMap,
                           HashSet<String> phoneSet, String name, String phone, String email) {

        if (phoneSet.contains(phone)) {
            System.out.println("Duplicate phone number not allowed: " + phone);
            return;
        }

        Contact c = new Contact(name, phone, email);
        contacts.add(c);
        nameMap.put(name, c);
        phoneSet.add(phone);

        System.out.println("Contact added: " + name);
    }

    static void searchContact(HashMap<String, Contact> nameMap, String name) {
        if (nameMap.containsKey(name)) {
            System.out.println("Found: " + nameMap.get(name));
        } else {
            System.out.println("Contact not found");
        }
    }

    static void deleteContact(ArrayList<Contact> contacts, HashMap<String, Contact> nameMap,
                              HashSet<String> phoneSet, String name) {

        if (nameMap.containsKey(name)) {
            Contact c = nameMap.get(name);
            contacts.remove(c);
            nameMap.remove(name);
            phoneSet.remove(c.phone);
            System.out.println("Contact deleted: " + name);
        } else {
            System.out.println("Contact not found");
        }
    }

    static void displaySorted(ArrayList<Contact> contacts) {
        Collections.sort(contacts, (a, b) -> a.name.compareTo(b.name));

        System.out.println("\nContacts sorted by name:");
        for (Contact c : contacts) {
            System.out.println(c);
        }
    }
}
