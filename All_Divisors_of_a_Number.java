//Find All Divisors of a Number: Write a program to find all divisors of a given number.

import java.util.Scanner;

public class All_Divisors_of_a_Number {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter the number: ");
        int num = input.nextInt(); // Store the user input in variable `num`

        // Print the message to indicate divisors will be listed
        System.out.println("Divisors of " + num + ":");

        // Loop from 1 up to the number itself to find all divisors
        for (int i = 1; i <= num; i++) {
            // Check if `i` divides `num` without a remainder
            if (num % i == 0) {
                // If true, `i` is a divisor, so print it
                System.out.println(i);
            }
        }
    }
}

// Output:
/*
 * Enter the number: 9
 * Divisors of 9:
 * 1
 * 3
 * 9
 */