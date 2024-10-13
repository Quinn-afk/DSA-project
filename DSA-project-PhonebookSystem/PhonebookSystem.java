
import java.util.HashMap;
import java.util.Scanner;

public class PhonebookSystem {
    // Data Structures
    private static HashMap<String, String> contacts = new HashMap<>();
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        mainMenu();
    }
//Main menu for the user to input their contacts
    public static void mainMenu() {
        while (true) {
            System.out.println("Phonebook Menu:");
            System.out.println("1. Insert Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Update Contact");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            String choice = scan.nextLine();

            switch (choice) {
                case "1":
                    insertContact();
                    break;
                case "2":
                    searchContact();
                    break;
                case "3":
                    deleteContact();
                    break;
                case "4":
                    updateContact();
                    break;
                case "5":
                    System.out.println("Exiting");
                    return;
                default:
                    System.out.println("Invalid choice, Please try again.");
            }
        }
    }

    public static void insertContact() {
        System.out.print("Enter contact name: ");
        String name = scan.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = scan.nextLine();

        if (contacts.containsKey(name)) {
            System.out.println("Contact already exists.");
        } else {
            contacts.put(name, phoneNumber);
            System.out.println("Contact added successfully.");
        }
    }

    public static void searchContact() {
        System.out.print("Enter contact name to search: ");
        String name = scan.nextLine();

        if (contacts.containsKey(name)) {
            System.out.println("Contact found: " + name +" +26481" + contacts.get(name));
        } else {
            System.out.println("Contact not found.");
        }
    }

    public static void deleteContact() {
        System.out.print("Enter contact name to delete: ");
        String name = scan.nextLine();

        if (contacts.remove(name) != null) {
            System.out.println("Contact deleted successfully.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    public static void updateContact() {
        System.out.print("Enter contact name to update: ");
        String name = scan.nextLine();

        if (contacts.containsKey(name)) {
            System.out.print("Enter new phone number: ");
            String newPhoneNumber = scan.nextLine();
            contacts.put(name, newPhoneNumber);
            System.out.println("Contact updated successfully.");
        } else {
            System.out.println("Contact not found.");
        }
    }
}
