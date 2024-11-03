//Check for Harshad Number: Check if a number is a Harshad number.
//A Harshad number (also known as a Niven number) is an integer that is divisible by the sum of its digits.

import java.util.Scanner;

public class Check_for_Harshad_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object for user input

        // Prompt the user to enter a number
        System.out.print("Enter the number: ");
        int num = input.nextInt(); // Read the input number
        int originalNum = num; // Store the original number to use in the final check
        int sum = 0; // Initialize sum of digits to 0

        // Calculate the sum of digits of the number
        while (num != 0) {
            int digit = num % 10; // Extract the last digit
            sum = sum + digit; // Add the digit to sum
            num = num / 10; // Remove the last digit from the number
        }

        // Check if the original number is divisible by the sum of its digits
        if (originalNum % sum == 0) {
            System.out.println(originalNum + " is a Harshad number."); // Output if it is a Harshad number
        } else {
            System.out.println(originalNum + " is not a Harshad number."); // Output if it is not a Harshad number
        }

        input.close(); // Close the scanner
    }
}

// Output:
// Enter the number: 18
// 18 is a Harshad number.