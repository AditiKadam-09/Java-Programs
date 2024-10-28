//Fibonacci Sequence Generator: Write a program that generates the Fibonacci sequence up to a given number of terms.

import java.util.Scanner;

public class Fibonacci_Sequence_Generator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms for the Fibonacci series: ");
        int N = input.nextInt(); // Number of terms to generate

        // Edge cases for 0 or 1 terms
        if (N <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        if (N == 1) {
            System.out.println("Fibonacci series: 0");
            return;
        }

        int first = 0; // First term
        int second = 1; // Second term

        System.out.println("Fibonacci series:");
        System.out.print(first + " " + second + " "); // Print the first two terms

        // Generate Fibonacci series up to N terms
        for (int i = 3; i <= N; i++) { // Start from 3 since the first two terms are printed
            int seq = first + second; // Calculate the next term
            System.out.print(seq + " "); // Print the next term
            first = second; // Update the first term
            second = seq; // Update the second term
        }
        System.out.println(); // New line at the end
    }
}

// Output:
// Enter the number of terms for the Fibonacci series: 6
// Fibonacci series:
// 0 1 1 2 3 5 8
