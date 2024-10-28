//Check for Strong Number: Write a program that checks if a given number is a strong number (e.g., 145 is a strong number).

import java.util.Scanner;

public class Check_for_Strong_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter the number: ");
        int num = input.nextInt(); // Read user input
        int num1 = num; // Store the original number for comparison
        int digit, sum = 0; // Initialize variables for digit and sum

        // Loop to calculate the sum of the factorials of each digit
        while (num != 0) {
            digit = num % 10; // Get the last digit
            int fact = 1; // Initialize factorial variable

            // Calculate the factorial of the digit
            for (int i = 1; i <= digit; i++) {
                fact = fact * i; // Calculate factorial
            }

            sum = sum + fact; // Add factorial to sum
            num = num / 10; // Remove the last digit
        }

        // Check if the sum of factorials is equal to the original number
        if (sum == num1) {
            System.out.println(num1 + " is a strong number"); // Output if it is strong
        } else {
            System.out.println(num1 + " is not a strong number"); // Output if it is not strong
        }
    }
}

// Output:
// Enter the number: 145
// 145 is a strong number
