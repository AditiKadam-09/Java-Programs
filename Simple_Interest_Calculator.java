// Simple Interest Calculator: Write a program to calculate simple interest using the formula

import java.util.Scanner; // Importing the Scanner class for taking user input

public class Simple_Interest_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creating an object of the Scanner class to read input from the user

        float p, r, t, si; // Declaring variables: p for principal amount, r for rate of interest, t for
                           // time period, si for simple interest

        // Prompting the user to enter the principal amount
        System.out.print("Enter the Principal amount: Rs.");
        p = input.nextFloat(); // Reading the principal amount from the user and storing it in 'p'

        // Prompting the user to enter the rate of interest
        System.out.print("Enter the rate of interest: ");
        r = input.nextFloat(); // Reading the rate of interest from the user and storing it in 'r'

        // Prompting the user to enter the time period
        System.out.print("Enter the time period: ");
        t = input.nextFloat(); // Reading the time period from the user and storing it in 't'

        // Calculating simple interest using the formula: SI = (P * R * T) / 100
        si = (p * r * t) / 100; // Storing the calculated simple interest in 'si'

        // Displaying the calculated simple interest
        System.out.println("The simple interest is Rs." + si);

    }
}

// Output:
// Enter the Pricipal amount : Rs.12450
// Enter the rate of interest :8
// Enter the time period :5
// The simple interest is Rs.4980.0