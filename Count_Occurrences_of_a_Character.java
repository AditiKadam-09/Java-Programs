// Count Occurrences of a Character: Count how many times a specific character appears in a string.

import java.util.Scanner;

public class Count_Occurrences_of_a_Character {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner object for user input

        // Prompt user to enter a string
        System.out.print("Enter the String: ");
        String str = input.nextLine();

        // Prompt user to enter the character to search for
        System.out.print("Enter the character: ");
        char ch = input.nextLine().charAt(0); // Read the character from input

        int count = 0; // Initialize counter for occurrences of the character

        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) { // Check if the character matches the user input character
                count++; // Increment count if there's a match
            }
        }

        // Display the result
        System.out.println("Occurrence of '" + ch + "' in the given string is " + count + " times.");

    }
}

// Output:
// Enter the String: sanjivani University
// Enter the character: a
// Occurrence of 'a' in the given string is 2 times.