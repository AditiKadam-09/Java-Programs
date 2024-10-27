//Simple Calculator: Write a basic calculator program that can add, subtract, multiply, or divide two numbers based on user input.

import java.util.Scanner; // Importing Scanner class for taking input

public class Simple_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creating Scanner object for user input
        int num1, num2, ch; // Declaring variables for two numbers and the user's choice

        do {
            // Displaying menu options for the calculator
            System.out.println("Choose one operation to perform:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your Choice: ");
            ch = input.nextInt(); // Storing user choice

            // If the choice is 5, exit immediately without asking for numbers
            if (ch == 5) {
                System.out.println("Exiting the program. Thank you!");
                break;
            }

            // Taking input for the two numbers to be calculated
            System.out.print("Enter first number: ");
            num1 = input.nextInt();
            System.out.print("Enter second number: ");
            num2 = input.nextInt();

            // Performing the selected operation based on user choice
            switch (ch) {
                case 1:
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2)); // Addition
                    break;

                case 2:
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2)); // Subtraction
                    break;

                case 3:
                    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2)); // Multiplication
                    break;

                case 4:
                    // Checking for division by zero
                    if (num2 != 0) {
                        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2)); // Division
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting the program."); // Exiting case
                    break;

                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 5."); // Invalid choice
            }
        } while (ch != 5); // Loop until user chooses to exit (option 5)
    }
}

// Output:
/*
 * Choose one operation to perform:
 * 1. Addition
 * 2. Subtraction
 * 3. Multiplication
 * 4. Division
 * 5. Exit
 * Enter your Choice: 1
 * Enter first number: 45
 * Enter second number: 45
 * 45 + 45 = 90
 * Choose one operation to perform:
 * 1. Addition
 * 2. Subtraction
 * 3. Multiplication
 * 4. Division
 * 5. Exit
 * Enter your Choice: 5
 * Exiting the program. Thank you!
 */