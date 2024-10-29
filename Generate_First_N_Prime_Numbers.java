//Generate First N Prime Numbers: Write a program to generate the first N prime numbers.

import java.util.Scanner;

public class Generate_First_N_Prime_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of prime numbers to generate
        System.out.print("Enter the number of prime numbers you want: ");
        int n = input.nextInt(); // Read the desired number of prime numbers
        int count = 0; // Counter for how many prime numbers have been found
        int num = 2; // The number to be checked for primality

        // Continue until the desired number of prime numbers is found
        while (count < n) {
            boolean isPrime = true; // Flag to indicate if the current number is prime

            // Check if the current number is prime
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false; // Set flag to false if num is divisible by i
                    break; // No need to check further; exit the loop
                }
            }

            // If the number is prime, print it and increment the count
            if (isPrime) {
                System.out.print(num + " "); // Print the prime number
                count++; // Increment the count of prime numbers found
            }
            num++; // Move to the next number to check for primality
        }
    }
}

// Output:
// Enter the number of prime numbers you want: 6
// 2 3 5 7 11 13