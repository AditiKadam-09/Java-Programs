//Addition of Two Numbers: Create a program that takes two numbers as input and displays their sum.

import java.util.Scanner; // Importing the Scanner class for taking user input

public class Addition_of_Two_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creating an object of the Scanner class to read input from the user

        // Prompting the user to enter the first number
        System.out.print("Enter first number: ");
        int num1 = input.nextInt(); // Reading the first number from the user and storing it in 'num1'

        // Prompting the user to enter the second number
        System.out.print("Enter second number: ");
        int num2 = input.nextInt(); // Reading the second number from the user and storing it in 'num2'

        // Performing addition of the two numbers and storing the result
        int result = num1 + num2;

        // Displaying the result of the addition
        System.out.println(num1 + " + " + num2 + " = " + result);

    }
}

// output:
// Enter first number :28
// Enter Second number :23
// 28 + 23 = 51