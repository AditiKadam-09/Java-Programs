// Implement a Text-Based Menu: Create a text-based menu for operations.

import java.util.Scanner;

public class Implement_a_TextBased_Menu {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);
        String str;

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        str = input.nextLine(); // Store the input string

        int choice; // Variable to store the user's menu choice
        do {
            // Display the menu options to the user
            System.out.println("\nChoose an operation:");
            System.out.println("1. Find Length of String");
            System.out.println("2. Convert to Uppercase");
            System.out.println("3. Reverse String");
            System.out.println("4. Check for Palindrome");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            choice = input.nextInt(); // Read the user's choice
            input.nextLine(); // Clear the newline character from the input buffer

            // Perform the selected operation based on the user's choice
            switch (choice) {
                case 1:
                    // Find and display the length of the string
                    System.out.println("Length of the string: " + str.length());
                    break;
                case 2:
                    // Convert the string to uppercase and display it
                    System.out.println("Uppercase version: " + str.toUpperCase());
                    break;
                case 3:
                    // Reverse the string and display the reversed version
                    String reversed = new StringBuilder(str).reverse().toString();
                    System.out.println("Reversed string: " + reversed);
                    break;
                case 4:
                    // Check if the string is a palindrome
                    String reversedStr = new StringBuilder(str).reverse().toString();
                    if (str.equalsIgnoreCase(reversedStr)) {
                        // If the original string is the same as the reversed string
                        System.out.println("The string is a palindrome.");
                    } else {
                        // If they are different
                        System.out.println("The string is not a palindrome.");
                    }
                    break;
                case 5:
                    // Exit the program
                    System.out.println("Exiting the program.");
                    break;
                default:
                    // Handle invalid choices
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5); // Repeat the menu until the user chooses to exit

        input.close();

    }
}

// Output:
/*
 * Enter a string: Sanjivani
 * 
 * Choose an operation:
 * 1. Find Length of String
 * 2. Convert to Uppercase
 * 3. Reverse String
 * 4. Check for Palindrome
 * 5. Exit
 * Enter your choice (1-5): 1
 * Length of the string: 9
 * 
 * Choose an operation:
 * 1. Find Length of String
 * 2. Convert to Uppercase
 * 3. Reverse String
 * 4. Check for Palindrome
 * 5. Exit
 * Enter your choice (1-5): 5
 * Exiting the program.
 */