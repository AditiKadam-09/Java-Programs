//Calculate Factorial: Write a program to calculate the factorial of a given number.
//A factorial is multiplication of given positive integer by all the positive integers less than itself down to 1

import java.util.Scanner; // Importing the Scanner class for taking user input

public class Calculate_Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creating an object of Scanner class to read input from the user
        int num, fact = 1; // Declaring integer variables: 'num' for the input number, and 'fact'
                           // initialized to 1 for calculating the factorial

        System.out.print("Enter the number: "); // Prompting the user to enter a number
        num = input.nextInt(); // Reading the integer input from the user and storing it in 'num'

        // Loop to calculate the factorial of 'num'
        for (int i = 1; i <= num; i++) { // Iterating a loop from 1 up to 'num'
            fact = fact * i; // Multiplying 'fact' by 'i' to accumulate the product for factorial calculation
        }

        // Displaying the final factorial result
        System.out.println(num + "! is " + fact); // Printing the factorial of the input number

    }
}

// Output:
// Enter the number :5
// 5! is 120