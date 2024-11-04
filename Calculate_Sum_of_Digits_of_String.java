//Calculate the Sum of the Digits of a String: Calculate the sum of all digits present in a given string.

import java.util.Scanner;

public class Calculate_Sum_of_Digits_of_String {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter the String: ");
        String str = input.nextLine(); // Store the input string

        int sum = 0; // Initialize a variable to hold the sum of digits

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Get the character at the current position

            // Check if the character is a digit
            if (Character.isDigit(ch)) {
                // Convert the character to its integer value and add it to the sum
                sum += ch - '0';
            }
        }

        // Print the result
        System.out.println("The sum of all digits in the string is: " + sum);
    }
}

// Output:
// Enter the String: 2124UMLF2003
// The sum of all digits in the string is: 14