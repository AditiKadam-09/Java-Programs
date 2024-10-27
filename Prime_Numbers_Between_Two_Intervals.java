//Prime Numbers Between Two Intervals: Write a program that takes two integers and prints all the prime numbers between them.

import java.util.Scanner;

public class Prime_Numbers_Between_Two_Intervals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start, end;

        // Taking the start and end values from the user
        System.out.print("Enter the start number: ");
        start = input.nextInt();
        System.out.print("Enter the end number: ");
        end = input.nextInt();

        System.out.println("Prime numbers between " + start + " to " + end + " are:");

        // Loop through each number in the specified range
        for (int i = start; i <= end; i++) {
            boolean isPrime = true; // Flag to track if i is prime

            // Skip 1 as it is not a prime number
            if (i <= 1) {
                continue;
            }

            // Check if i has any divisor other than 1 and itself
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false; // Set flag to false if a divisor is found
                    break; // Exit the inner loop as we found a divisor
                }
            }

            // If the number has no divisors, it is prime
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}

// Output:
// Enter the start number: 1
// Enter the end number: 10
// Prime numbers between 1 to 10 are:
// 2
// 3
// 5
// 7