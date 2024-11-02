// Check for Even/Odd Using Ternary Operator: Use a ternary operator to check if a number is even or odd.

import java.util.Scanner;

public class Check_for_EvenOdd_Using_Ternary_Operator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter the number: ");

        // Read the number input by the user
        int num = input.nextInt();

        // Use a ternary operator to check if the number is even or odd
        // If num is divisible by 2, it is even; otherwise, it is odd
        String result = (num % 2 == 0) ? "The given number is even." : "The given number is odd.";
        System.out.println(result);

        // Close the scanner to prevent resource leaks
        input.close();
    }
}

// output:
// Enter the number: 101
// The given number is odd.