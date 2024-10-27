//Count Digits in a Number: Write a program to count the number of digits in an integer input by the user.

import java.util.Scanner; // Importing Scanner class for input

public class Count_Digits_in_a_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creating Scanner object for user input
        int num, count = 0; // Initializing variables to store the number and count of digits
        System.out.print("Enter the number: ");
        num = input.nextInt(); // Storing user input in the variable 'num'

        // Loop to count the digits
        while (num != 0) {
            num = num / 10; // Removing the last digit from the number
            count++; // Incrementing count for each digit
        }

        // Displaying the total count of digits
        System.out.println("The number of digits is: " + count);
    }
}

// Output:
// Enter the number: 12345
// The number of digits is: 5