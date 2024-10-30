// Count Vowels and Consonants: Count vowels and consonants in a string.

import java.util.Scanner;

public class Count_Vowels_and_Consonants {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner object for user input

        // Prompt user to enter a string
        System.out.print("Enter the string: ");
        String str = input.nextLine();

        // Convert the input string to lowercase to handle case-insensitive comparisons
        str = str.toLowerCase();

        int vowels = 0, consonants = 0; // Initialize counters for vowels and consonants

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Get the current character

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
            // Check if the character is an alphabetic consonant
            else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
        }

        // Display the count of vowels and consonants
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

    }
}

// Output:
// Enter the string: Sanjivani
// Vowels: 4
// Consonants: 5