//Create a Simple Address Book: Create a simple text-based address book to store names and phone numbers.

import java.util.Scanner;

public class Simple_Address_Book {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ch = 0; // Variable to store the user's choice
        StringBuffer addressBook = new StringBuffer(); // To store names and phone numbers

        while (ch != 3) {
            // Displaying menu options to the user
            System.out.println("1. Store onto address book");
            System.out.println("2. Display address book");
            System.out.println("3. Exit");
            System.out.print("Enter your choice :");
            ch = input.nextInt(); // Reading the user's choice
            input.nextLine(); // Consume the newline character

            switch (ch) {
                case 1: // Store name and phone number
                    System.out.print("Enter the name: ");
                    String name = input.nextLine(); // Read name
                    System.out.print("Enter the phone number: ");
                    String phoneNumber = input.nextLine(); // Read phone number
                    // Append name and phone number on the same line, separated by a space
                    addressBook.append(name + " - " + phoneNumber + "\n");
                    break;

                case 2: // Display the address book
                    System.out.println("Displaying address book:");
                    if (addressBook.length() > 0) {
                        System.out.println(addressBook.toString()); // Display stored names and phone numbers
                    } else {
                        System.out.println("Address book is empty."); // Inform if empty
                    }
                    break;

                case 3: // Exit the program
                    System.out.println("Exiting...");
                    break;

                default: // Handle invalid input
                    System.out.println("Invalid choice. Please select again.");
                    break;
            }
        }
        input.close(); // Close the scanner to prevent resource leaks
    }
}

// Output:
/*
 * 1. Store onto address book
 * 2. Display address book
 * 3. Exit
 * Enter your choice :1
 * Enter the name: aditi
 * Enter the phone number: 1234567890
 * 1. Store onto address book
 * 2. Display address book
 * 3. Exit
 * Enter your choice :2
 * Displaying address book:
 * aditi - 1234567890
 * 
 * 1. Store onto address book
 * 2. Display address book
 * 3. Exit
 * Enter your choice :3
 * Exiting...
 */