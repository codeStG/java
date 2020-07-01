import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static CellPhone cellPhone = new CellPhone("214 713 2785");


    public static void main(String[] args) {

        boolean quit = false;
        showOptions();
        while(!quit) {
            System.out.println("\nEnter Option: (6 to show available options)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nQuitting...");
                    quit = true;
                    break;

                case 1:
                    cellPhone.displayContacts();
                    break;

                case 2:
                    addNewContact();
                    break;

                case 3:
                    updateContact();
                    break;

                case 4:
                    removeContact();

                case 5:
                    searchContact();
                    break;

                case 6:
                    showOptions();
                    break;
            }
        }
    }

    private static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if(cellPhone.addNewContact(newContact)) {
            System.out.println("New contact added: name = " + name + ", phone = " + phone);
        } else {
            System.out.println("Cannot add, " + name + " already on file.");
        }
    }

    private static void updateContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContact = cellPhone.searchContact(name);
        if(existingContact == null) {
            System.out.println("Contact " + name + " not found.");
            return;
        }

        System.out.println("Enter updated contact name: ");
        String updatedName = scanner.nextLine();
        System.out.println("Enter updated contact phone number: ");
        String updatedNumber = scanner.nextLine();
        Contact updatedContact = Contact.createContact(updatedName, updatedNumber);
        cellPhone.updateContact(existingContact, updatedContact);
    }

    private static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContact = cellPhone.searchContact(name);
        if (existingContact == null) {
            System.out.println("Contact " + name + " not found.");
            return;
        }

        cellPhone.removeContact(existingContact);
        System.out.println("Successfully deleted contact");
    }

    private static void searchContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContact = cellPhone.searchContact(name);
        if (existingContact == null) {
            System.out.println("Contact " + name + " not found.");
            return;
        }
        System.out.println("Name: " + existingContact.getName() + "\nPhone number: " + existingContact.getPhoneNumber());
    }

    private static void showOptions() {
        System.out.println("\nAvailable options include:\npress");
        System.out.println("0 - to quit\n" +
                           "1 - to display contacts\n" +
                           "2 - to add a new contact\n" +
                           "3 - to update an existing contact\n" +
                           "4 - to remove an existing contact\n" +
                           "5 - to query whether a contact exists\n" +
                           "6 - to print a list of available options.");
        System.out.println("Choose your option: ");
    }
}
