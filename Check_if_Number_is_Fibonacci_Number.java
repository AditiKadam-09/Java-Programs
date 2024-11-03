// Check if a Number is a Fibonacci Number: Check if a number is in the Fibonacci series.

import java.util.Scanner;

public class Check_if_Number_is_Fibonacci_Number {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt(); // Read the input number

        // Initialize the first two Fibonacci numbers
        int first = 0;
        int second = 1;

        // Flag to check if the number is in the Fibonacci series
        boolean isFibonacci = false;

        // Check if the input number is a Fibonacci number
        if (num == first || num == second) {
            isFibonacci = true; // Handle the first two Fibonacci numbers
        } else {
            int temp = 0; // Variable to store the next Fibonacci number
            while (temp < num) {
                temp = first + second; // Calculate the next Fibonacci number
                if (temp == num) { // Check if the number matches the Fibonacci number
                    isFibonacci = true; // Set the flag to true
                    break; // Exit the loop if found
                }
                // Update the first two Fibonacci numbers for the next iteration
                first = second;
                second = temp;
            }
        }

        // Output the result based on the flag
        if (isFibonacci) {
            System.out.println("The given number is in the Fibonacci sequence.");
        } else {
            System.out.println("The given number is not in the Fibonacci sequence.");
        }

        input.close(); // Close the Scanner object to prevent resource leaks
    }
}

// Output:
// Enter the number: 3
// The given number is in the Fibonacci sequence.