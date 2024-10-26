//Sum of Digits: Write a program that takes a number and calculates the sum of its digits.

import java.util.Scanner; // Importing the Scanner class for taking user input

public class Sum_of_Digits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creating a Scanner object to read input from the user
        int num, digit, sum = 0; // Declaring integer variables: 'num' for the input number, 'digit' for each
                                 // extracted digit, and 'sum' initialized to 0 to store the sum of digits

        System.out.print("Enter the number: "); // Prompting the user to enter a number
        num = input.nextInt(); // Reading the integer input from the user and storing it in 'num'

        // Loop to calculate the sum of the digits of 'num'
        while (num != 0) { // Repeat until 'num' becomes 0
            digit = num % 10; // Extracting the last digit of 'num' by finding the remainder when divided by
                              // 10
            sum = sum + digit; // Adding the extracted digit to the current sum
            num = num / 10; // Removing the last digit from 'num' by dividing it by 10
        }

        // Displaying the final result
        System.out.println("Sum of digits of the given number is " + sum); // Outputting the total sum of digits

    }
}

// Output:
// Enter the number :143
// Sum of digits of given number is 8