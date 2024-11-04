//Count the Number of Digits in a String: Count how many digits are present in a given string.

import java.util.Scanner;

public class Count_Number_of_Digits_in_String {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter the String: ");
        String str = input.nextLine();

        // Initialize a counter to count the digits
        int count = 0;

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            // Check if the character is a digit
            if (Character.isDigit(str.charAt(i))) {
                count++; // Increment the count if it is a digit
            }
        }

        // Print the total count of digits found in the string
        System.out.println("Count: " + count);

        // Close the scanner to prevent resource leaks
        input.close();
    }
}

// Output:
// Enter the String: 2124UMLF2003
// Count: 8