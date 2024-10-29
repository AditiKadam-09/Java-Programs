//Sum of Prime Numbers Between Two Intervals: Calculate the sum of all prime numbers within two specified ranges.

import java.util.Scanner;

public class Sum_of_Prime_Numbers_Between_Two_Intervals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the range
        System.out.print("Enter the start of the range: ");
        int start = input.nextInt(); // Start of the interval
        System.out.print("Enter the end of the range: ");
        int end = input.nextInt(); // End of the interval

        int sum = 0; // Variable to hold the sum of prime numbers

        // Loop through each number in the specified range
        for (int i = start; i <= end; i++) {
            // Skip numbers less than 2, as they are not prime
            if (i < 2) {
                continue;
            }
            boolean isPrime = true; // Flag to check if a number is prime

            // Check if the current number is prime
            for (int j = 2; j < i; j++) {
                if (i % j == 0) { // If divisible by any number other than 1 and itself
                    isPrime = false; // Not a prime number
                    break; // Exit the loop
                }
            }
            // If the number is prime, add it to the sum
            if (isPrime) {
                sum = sum + i;
            }
        }

        // Output the sum of prime numbers in the given range
        System.out.println("The sum of all prime numbers between " + start + " and " + end + " is " + sum);
    }
}

// Output:
// Enter the start of the range: 11
// Enter the end of the range: 20
// The sum of all prime numbers between 11 and 20 is 60