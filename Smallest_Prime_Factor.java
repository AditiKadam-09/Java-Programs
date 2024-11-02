// Find the Smallest Prime Factor: Find the smallest prime factor of a number.

import java.util.Scanner; // Import the Scanner class for user input.

public class Smallest_Prime_Factor {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user.
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number.
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int factor = 0; // Initialize a variable to hold the smallest prime factor.

        // Check if the input number is less than or equal to 1.
        if (num <= 1) {
            System.out.println("Please enter a positive number greater than 1."); // Inform the user to enter a valid
                                                                                  // number.
        } else {
            // Loop through numbers starting from 2 up to the given number.
            for (int i = 2; i < num; i++) {
                // Check if 'i' is a factor of 'num'.
                if (num % i == 0) {
                    factor = i; // Assign the smallest factor found to 'factor'.
                    break; // Exit the loop after finding the smallest prime factor.
                }
            }
        }

        // Check if a prime factor was found and print the result.
        if (factor != 0) {
            System.out.println("Smallest prime factor of " + num + " is " + factor); // Print the smallest prime factor.
        } else {
            System.out.println(num + " is a prime number; it has no prime factors."); // Inform the user that the number
                                                                                      // is prime.
        }

        // Close the scanner to prevent resource leaks.
        input.close();
    }
}

// Output:
// Enter the number: 28
// Smallest prime factor of 28 is 2