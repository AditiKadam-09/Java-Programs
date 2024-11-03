// Check for Abundant Number: Check if a number is an abundant number.
// An abundant number (or excessive number) is a positive integer for which the sum of its proper divisors 
// is greater than the number itself. Proper divisors are all divisors of the number, excluding the number itself.

import java.util.Scanner;

public class Check_for_Abundant_Number {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user.
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number.
        System.out.print("Enter the number: ");
        int num = input.nextInt(); // Read the number input by the user.

        int sum = 0; // Initialize a variable to hold the sum of proper divisors.

        // Loop through numbers from 1 to num/2 to find proper divisors.
        for (int i = 1; i <= num / 2; i++) {
            // Check if 'i' is a divisor of 'num'.
            if (num % i == 0) {
                sum += i; // Add the divisor to the sum.
            }
        }

        // Check if the sum of the proper divisors is greater than the original number.
        if (sum > num) {
            System.out.println(num + " is an abundant number."); // Print if the number is abundant.
        } else {
            System.out.println(num + " is not an abundant number."); // Print if the number is not abundant.
        }

        // Close the scanner to prevent resource leaks.
        input.close();
    }
}

// Output:
// Enter the number: 12
// 12 is an abundant number.