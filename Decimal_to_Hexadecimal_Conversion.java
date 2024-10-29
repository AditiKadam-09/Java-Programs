// Decimal to Hexadecimal Conversion: Write a program that converts a decimal number to its hexadecimal representation.

import java.util.Scanner;

public class Decimal_to_Hexadecimal_Conversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object to read input
        System.out.print("Enter the Decimal number: "); // Prompt the user to enter a decimal number
        int num = input.nextInt(); // Read the input decimal number
        StringBuffer hexadecimal = new StringBuffer(); // Initialize a StringBuffer to store the hexadecimal digits
        int digit; // Variable to hold the remainder (digit)

        // Loop until the number becomes zero
        while (num != 0) {
            digit = num % 16; // Get the remainder when num is divided by 16
            // Append the corresponding hexadecimal character to the StringBuffer
            if (digit >= 0 && digit <= 9) {
                hexadecimal.append(digit); // Append digits 0-9 directly
            } else if (digit == 10) {
                hexadecimal.append('A'); // Append 'A' for 10
            } else if (digit == 11) {
                hexadecimal.append('B'); // Append 'B' for 11
            } else if (digit == 12) {
                hexadecimal.append('C'); // Append 'C' for 12
            } else if (digit == 13) {
                hexadecimal.append('D'); // Append 'D' for 13
            } else if (digit == 14) {
                hexadecimal.append('E'); // Append 'E' for 14
            } else if (digit == 15) {
                hexadecimal.append('F'); // Append 'F' for 15
            }
            num = num / 16; // Update num to the quotient for the next iteration
        }

        hexadecimal.reverse(); // Reverse the StringBuffer to get the correct order of hexadecimal digits
        System.out.println("Hexadecimal conversion of this number is " + hexadecimal.toString()); // Output the result
    }
}

// Output:
// Enter the Decimal number: 254
// Hexadecimal conversion of this number is FE