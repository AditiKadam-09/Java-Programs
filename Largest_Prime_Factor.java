// Find Largest Prime Factor: Find the largest prime factor of a number.

import java.util.Scanner; // Import the Scanner class for user input.

public class Largest_Prime_Factor {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user.
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number.
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int largestFactor = 0; // Initialize a variable to hold the largest prime factor.

        // Check if the input number is less than or equal to 1.
        if (num <= 1) {
            System.out.println("Please enter a positive number greater than 1."); // Inform the user to enter a valid
                                                                                  // number.
        } else {
            // Loop through numbers starting from 2 up to the square root of 'num'.
            for (int i = 2; i < num; i++) {
                // Check if 'i' is a factor of 'num'.
                if (num % i == 0) { // Use a while loop to divide 'num' by 'i' as long as it's divisible.
                    largestFactor = i; // Assign 'i' as the largest prime factor.
                }
            }
        }

        // Check if a prime factor was found and print the result.
        if (largestFactor != 0) {
            System.out.println("Largest prime factor is " + largestFactor); // Print the largest prime factor.
        } else {
            System.out.println("The number has no prime factors."); // Inform the user that there are no prime factors.
        }

        // Close the scanner to prevent resource leaks.
        input.close();
    }
}

// Output:
// Enter the number: 100
// Largest prime factor is 50