//Check for Prime Number: Write a program that checks if a given integer is a prime number.

import java.util.Scanner; // Importing the Scanner class for taking user input

public class Check_for_Prime_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creating an object of Scanner class to read user input
        int num; // Declaring an integer variable 'num' to store the user input
        boolean prime = true; // Declaring a boolean variable 'prime' initialized to true, assuming the number
                              // is prime initially

        System.out.print("Enter the number: "); // Prompting the user to enter a number
        num = input.nextInt(); // Reading the integer input from the user and storing it in 'num'

        // Checking if the input number is 0 or 1, which are not prime numbers
        if (num == 0 || num == 1) {
            prime = false; // Setting 'prime' to false, as 0 and 1 are not considered prime numbers
        } else {
            // Loop to check for divisors from 2 up to (num - 1)
            for (int i = 2; i < num; i++) {
                // If 'num' is divisible by 'i' without a remainder, it is not prime
                if (num % i == 0) {
                    prime = false; // Setting 'prime' to false as we found a divisor
                    break; // Exiting the loop early since 'num' is confirmed to be not prime
                }
            }
        }

        // Checking the value of 'prime' to determine if 'num' is prime or not
        if (prime == true) { // If 'prime' is true, 'num' is a prime number
            System.out.println(num + " is a prime number"); // Printing that the number is prime
        } else { // If 'prime' is false, 'num' is not a prime number
            System.out.println(num + " is not a prime number"); // Printing that the number is not prime
        }
    }
}

// Output:
// Enter the number: 56
// 56 is not a prime number