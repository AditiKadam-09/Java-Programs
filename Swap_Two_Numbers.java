// Swap Two Numbers: Swap two numbers without using a temporary variable.

import java.util.Scanner;

public class Swap_Two_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object for user input

        // Prompt user for the first number
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        // Prompt user for the second number
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        // Display the numbers before swapping
        System.out.println("\nNumbers before swapping:");
        System.out.println("Num 1: " + num1);
        System.out.println("Num 2: " + num2);

        // Swapping the numbers without a temporary variable
        num1 = num1 + num2; // Add both numbers and store in num1
        num2 = num1 - num2; // Subtract num2 from the new num1 to get the original num1
        num1 = num1 - num2; // Subtract the new num2 from the new num1 to get the original num2

        // Display the numbers after swapping
        System.out.println("\nNumbers after swapping:");
        System.out.println("Num 1: " + num1);
        System.out.println("Num 2: " + num2);

    }
}

// Output:
/*
 * Enter the first number: 5
 * Enter the second number: 7
 * 
 * Numbers before swapping:
 * Num 1: 5
 * Num 2: 7
 * 
 * Numbers after swapping:
 * Num 1: 7
 * Num 2: 5
 */