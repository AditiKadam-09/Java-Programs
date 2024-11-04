//Check for Magic Number: Check if a number is a magic number (where the sum of its digits repeatedly adds up to 1).

import java.util.Scanner;

public class Check_for_Magic_Number {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        // Variable to store the sum of digits
        int sum = num;

        // Loop until the sum reduces to a single digit
        while (sum > 9) {
            sum = calculateDigitSum(sum); // Calculate the sum of digits
        }

        // Check if the resulting sum is 1 (magic number condition)
        if (sum == 1) {
            System.out.println(num + " is a magic number.");
        } else {
            System.out.println(num + " is not a magic number.");
        }

        // Close the scanner to prevent resource leaks
        input.close();
    }

    // Method to calculate the sum of digits of a number
    private static int calculateDigitSum(int number) {
        int sum = 0; // Variable to hold the sum of digits
        while (number > 0) {
            sum += number % 10; // Add the last digit to sum
            number /= 10; // Remove the last digit
        }
        return sum; // Return the calculated sum
    }
}

// Output:
// Enter the number: 123
// 123 is not a magic number.