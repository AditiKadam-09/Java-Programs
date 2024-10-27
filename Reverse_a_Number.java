// Reverse a Number: Write a program to reverse a given integer (e.g., input 1234, output 4321).

import java.util.Scanner; // Importing Scanner class for taking input

public class Reverse_a_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creating a Scanner object to read input
        int num, digit, rev = 0; // Declaring variables: num (original number), digit (current digit), rev
                                 // (reversed number)

        // Prompting the user to enter the number
        System.out.print("Enter the number: ");
        num = input.nextInt(); // Reading the number and storing it in variable num

        // Loop to reverse the number
        while (num != 0) {
            digit = num % 10; // Extracting the last digit of num
            rev = (rev * 10) + digit; // Building the reversed number by shifting previous digits and adding the
                                      // current one
            num = num / 10; // Removing the last digit from num
        }

        // Displaying the reversed number
        System.out.println("Reverse of this number is " + rev);
    }
}

// Output:
// Enter the number :67895
// Reverse of this number is 59876