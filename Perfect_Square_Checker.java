// Perfect Square Checker: Write a program that checks if a given integer is a perfect square.

import java.util.Scanner;

public class Perfect_Square_Checker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter the number: ");
        int num = input.nextInt(); // Read the number from user input

        boolean isSquare = false; // Flag to check if the number is a perfect square

        // Loop from 1 to the number to check for a perfect square
        for (int i = 1; i <= num; i++) {
            // Check if the square of the current number equals the input number
            if ((i * i) == num) {
                isSquare = true; // Set flag to true if it is a perfect square
                break; // Exit the loop as we found a perfect square
            }
        }

        // Output the result based on the flag
        if (isSquare) {
            // Output indicating that the number is a perfect square
            System.out.println(num + " is a perfect square.");
        } else {
            // Output indicating that the number is not a perfect square
            System.out.println(num + " is not a perfect square.");
        }
    }
}

// Output:
// Enter the number: 25
// 25 is a perfect square.