// Convert Binary to Octal: Convert a binary number to octal.

import java.util.Scanner; // Import the Scanner class for user input.

public class Convert_Binary_to_Octal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object to read input.

        // Prompt the user to enter a binary number.
        System.out.print("Enter the binary number: ");
        int num = input.nextInt(); // Read the binary number as an integer.
        int originalNum = num; // Store the original number for conversion.
        int decimalValue = 0; // To hold the decimal value.
        int count = 0; // To count the number of digits in the binary number.

        // Count the number of digits in the binary number.
        while (num != 0) {
            num = num / 10; // Remove the last digit.
            count++; // Increment the count of digits.
        }

        // Reset num to the original number for conversion.
        num = originalNum;

        // Convert binary to decimal.
        for (int i = 0; i < count; i++) {
            // Get the last digit (0 or 1).
            int digit = num % 10;

            // Calculate the decimal value using the position of the digit (2^i).
            decimalValue += digit * Math.pow(2, i); // Directly use Math.pow for power calculation.

            // Remove the last digit.
            num = num / 10; // Move to the next binary digit.
        }

        System.out.println("Decimal :" + decimalValue);

        // Convert decimal to octal.
        StringBuffer octal = new StringBuffer(); // Use StringBuffer to build the octal number.

        while (decimalValue != 0) {
            int digit = decimalValue % 8; // Get the last digit in octal.
            octal.insert(0, digit); // Insert the digit at the beginning to maintain order.
            decimalValue /= 8; // Move to the next digit.
        }

        // Print the final octal result.
        System.out.println("Octal: " + octal); // Output the octal number.

        // Close the scanner to prevent resource leaks.
        input.close();
    }
}

// Output:
// Enter the binary number: 10101
// Decimal :21
// Octal: 25