//LCM of Two Numbers: Write a program to find the least common multiple (LCM) of two integers.

import java.util.Scanner; // Importing the Scanner class for taking input

public class LCM_of_Two_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creating an object of Scanner class to read user input
        int num1, num2, LCM; // Declaring variables for two numbers and their LCM

        // Prompting user to enter the first number
        System.out.print("Enter the first number: ");
        num1 = input.nextInt(); // Storing the first number in num1

        // Prompting user to enter the second number
        System.out.print("Enter the second number: ");
        num2 = input.nextInt(); // Storing the second number in num2

        // Storing original values for later use in the output
        int originalNum1 = num1;
        int originalNum2 = num2;

        // Calculating GCD using the Euclidean algorithm
        while (num2 != 0) {
            int res = num1 % num2; // Finding the remainder of num1 divided by num2
            num1 = num2; // Updating num1 to num2
            num2 = res; // Updating num2 to the remainder
        }

        // Calculating LCM using the formula: LCM = (originalNum1 * originalNum2) / GCD
        LCM = (originalNum1 * originalNum2) / num1; // num1 now holds the GCD

        // Displaying the result
        System.out.println("LCM of " + originalNum1 + " and " + originalNum2 + " is " + LCM);
    }
}

// Output:
// Enter the first number: 15
// Enter the second number: 12
// LCM of 15 and 12 is 60