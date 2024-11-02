// Convert String to Integer: Convert a string to an integer without built-in functions.

import java.util.Scanner;

public class Convert_String_to_Integer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a string that represents an integer
        System.out.print("Enter the String: ");
        String str = input.nextLine();

        // Initialize the integer value to 0 and a variable to handle sign
        int num = 0;
        int sign = 1;

        // Check for a negative sign at the beginning of the string
        int startIndex = 0;
        if (str.charAt(0) == '-') {
            sign = -1; // Set sign to -1 if the number is negative
            startIndex = 1; // Start processing digits from the next character
        }

        // Loop through each character in the string, starting from startIndex
        for (int i = startIndex; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Convert character to its integer equivalent by subtracting '0' from it
            int digit = ch - '0';

            // Update the integer value by shifting current value left by one place
            // (multiplying by 10) and adding the new digit
            num = num * 10 + digit;
        }

        // Apply the sign to the final number
        num *= sign;

        // Display the result
        System.out.println("Number: " + num);

        // Close the scanner to avoid resource leak
        input.close();
    }
}

// Output:
// Enter the String: 435
// Number: 435