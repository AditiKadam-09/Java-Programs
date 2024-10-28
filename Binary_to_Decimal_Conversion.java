//Binary to Decimal Conversion: Create a program that converts a binary number to a decimal number.

import java.util.Scanner;

public class Binary_to_Decimal_Conversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a binary number
        System.out.print("Enter the binary number: ");
        int num = input.nextInt(); // Read binary number as integer
        int originalNum = num; // Store the original number for conversion
        int decimalValue = 0; // To hold the decimal value
        int count = 0; // To count the number of digits in the binary number

        // Count the number of digits in the binary number
        while (num != 0) {
            num = num / 10; // Remove the last digit
            count++;
        }

        // Reset num to the original number for conversion
        num = originalNum;

        // Convert binary to decimal
        for (int i = 0; i < count; i++) {
            // Get the last digit (0 or 1)
            int digit = num % 10;

            // Calculate the decimal value using the position of the digit (2^i)
            int result = 1;
            for (int j = 0; j < i; j++) {
                result = result * 2;
            }
            decimalValue += digit * result;

            // Remove the last digit
            num = num / 10; // Move to the next binary digit
        }

        // Print the decimal equivalent
        System.out.println("Decimal equivalent: " + decimalValue);
    }
}

// Example Output:
// Enter the binary number: 101
// Decimal equivalent: 5