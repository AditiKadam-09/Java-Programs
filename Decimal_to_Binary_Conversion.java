//Decimal to Binary Conversion: Write a program that converts a decimal number to its binary representation.

import java.util.Scanner;

public class Decimal_to_Binary_Conversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a decimal number
        System.out.print("Enter the decimal number: ");
        int num = input.nextInt();

        StringBuffer binary = new StringBuffer(); // StringBuffer to store binary digits in reverse order

        // Loop to convert decimal to binary
        while (num != 0) {
            int digit = num % 2; // Get the last binary digit (0 or 1)
            binary.append(digit); // Append the digit to the StringBuffer
            num = num / 2; // Divide the number by 2 to get the next binary digit
        }

        // Reverse the order to get the correct binary representation
        binary.reverse();

        // Display the binary representation of the given number
        System.out.println("Binary representation of the given number is: " + binary.toString());
    }
}

// Output:
// Enter the decimal number: 4
// Binary representation of the given number is: 100