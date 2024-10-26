//Check Even or Odd: Write a program that takes an integer and checks if it’s even or odd.

import java.util.Scanner; // Importing the Scanner class for taking user input

public class Check_Even_or_Odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creating an object of the Scanner class to read input from the user
        int num; // Declaring an integer variable 'num' to store the user's input

        System.out.print("Enter the number: "); // Prompting the user to enter a number
        num = input.nextInt(); // Reading the integer input from the user and storing it in 'num'

        // Using the modulus operator to check if 'num' is even or odd
        if (num % 2 == 0) { // If the remainder when 'num' is divided by 2 is 0, it's even
            System.out.println(num + " is the even number."); // Displaying that the number is even
        } else { // If the remainder is not 0, it's odd
            System.out.println(num + " is the odd number."); // Displaying that the number is odd
        }

    }
}

// Output :
// Enter the number :23456789
// 23456789 is the odd number.