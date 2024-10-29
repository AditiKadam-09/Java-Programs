//Check Armstrong Number for N Digits: Write a program to check if a given N-digit number is an Armstrong number.

import java.util.Scanner;

public class Check_Armstrong_Number_for_N_Digit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of digits in the number
        System.out.print("Enter the total digits in the number: ");
        int n = input.nextInt();

        // Prompt the user to enter the number to be checked
        System.out.print("Enter the " + n + "-digit number: ");
        int num = input.nextInt();

        // Store the original number for comparison later
        int num1 = num;
        int sum = 0; // Initialize the sum to store the result of Armstrong calculation

        // Loop to calculate the sum of each digit raised to the power of n
        while (num != 0) {
            int digit = num % 10; // Extract the last digit of the number
            int res = 1; // Variable to store each digit raised to the power of n

            // Loop to calculate digit^n
            for (int i = 1; i <= n; i++) {
                res *= digit;
            }

            // Add the result to the total sum
            sum += res;
            num /= 10; // Remove the last digit from the number
        }

        // Check if the calculated sum is equal to the original number
        if (num1 == sum) {
            System.out.println(num1 + " is an Armstrong number");
        } else {
            System.out.println(num1 + " is not an Armstrong number");
        }
    }
}

// Output:
// Enter the total digits in the number: 3
// Enter the 3-digit number: 153
// 153 is an Armstrong number