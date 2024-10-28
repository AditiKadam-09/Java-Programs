//Check Armstrong Number: Write a program to check if a given number is an Armstrong number (e.g., 153 is an Armstrong number).

import java.util.Scanner;

public class Check_Armstrong_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Initialize variables to store the original number, digit count, and sum of
        // powers
        int num1, num2, num3, count = 0, digit, sum = 0;

        // Prompt user for input
        System.out.print("Enter the number: ");
        num1 = input.nextInt();

        // Copy the input number to two other variables for separate calculations
        num2 = num1;
        num3 = num1;

        // Count the number of digits in the number
        while (num1 != 0) {
            num1 = num1 / 10;
            count++;
        }

        // Calculate the sum of each digit raised to the power of the number of digits
        while (num2 != 0) {
            digit = num2 % 10; // Get the last digit
            int res = 1;

            // Raise the digit to the power of 'count'
            for (int i = 1; i <= count; i++) {
                res = res * digit;
            }

            // Add the result to the sum
            sum = sum + res;

            // Remove the last digit from num2
            num2 = num2 / 10;
        }

        // Check if the calculated sum matches the original number
        if (num3 == sum) {
            System.out.println("The given number is an Armstrong number.");
        } else {
            System.out.println("The given number is not an Armstrong number.");
        }
    }
}

// Output :
// Enter the number: 153
// The given number is an Armstrong number.