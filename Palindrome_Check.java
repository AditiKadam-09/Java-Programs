// Palindrome Check: Write a program to check if a given integer is a palindrome (e.g., 121 is a palindrome, 123 is not).

import java.util.Scanner; // Importing Scanner class for taking input

public class Palindrome_Check {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creating Scanner object to read input
        int num1, num2, digit, rev = 0; // Declaring variables: num1 (original number), num2 (copy of original), digit
                                        // (current digit), rev (reversed number)

        System.out.print("Enter the number: "); // Prompting user to enter a number
        num1 = input.nextInt(); // Reading the number and storing it in num1
        num2 = num1; // Storing the original number in num2 for comparison

        // Loop to reverse the number
        while (num1 != 0) {
            digit = num1 % 10; // Extracting the last digit of num1
            rev = (rev * 10) + digit; // Building the reversed number by shifting previous digits and adding the
                                      // current one
            num1 = num1 / 10; // Removing the last digit from num1
        }

        // Checking if the original number is equal to the reversed number
        if (num2 == rev) {
            System.out.println(num2 + " is a palindrome number.");
        } else {
            System.out.println(num2 + " is not a palindrome number.");
        }
    }
}

// Output:
// Enter the number: 123321
// 123321 is a palindrome number.