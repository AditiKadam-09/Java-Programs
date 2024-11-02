// Count Character Frequency: Count how often each character appears in a string.

import java.util.Scanner;

public class Count_Character_Frequency {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = input.nextLine().toLowerCase(); // Convert to lowercase to handle both cases

        // Initialize an array to store frequency of each character (26 letters)
        int[] frequency = new int[26];

        // Iterate through the string and count occurrences of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if character is a letter
            if (ch >= 'a' && ch <= 'z') {
                // Increment the corresponding index in the frequency array
                frequency[ch - 'a']++;
            }
        }

        // Print the frequency of each character in the string
        System.out.println("Character frequencies:");
        for (int i = 0; i < 26; i++) {
            if (frequency[i] > 0) { // Only display characters that appear in the string
                System.out.println((char) (i + 'a') + ": " + frequency[i]);
            }
        }

        // Close the scanner
        input.close();
    }
}

// Output:
/*
 * Enter the String: Sanjivani
 * Character frequencies:
 * a: 2
 * i: 2
 * j: 1
 * n: 2
 * s: 1
 * v: 1
 */