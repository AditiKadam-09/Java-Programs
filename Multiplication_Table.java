//Multiplication Table: Generate a multiplication table for any integer input.

import java.util.Scanner; // Importing the Scanner class for taking user input

public class Multiplication_Table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creating a Scanner object to read input from the user
        int num; // Declaring an integer variable 'num' to store the user input number

        System.out.print("Enter the number: "); // Prompting the user to enter a number
        num = input.nextInt(); // Reading the integer input from the user and storing it in 'num'

        System.out.println("Multiplication table of " + num); // Displaying the title for the multiplication table

        // Loop to generate the multiplication table
        for (int i = 1; i <= 10; i++) { // Iterating a loop from 1 to 10 to create the table
            // Printing each line of the table by multiplying 'num' with the current loop
            // index 'i'
            System.out.println(num + " x " + i + " = " + num * i);
        }

    }
}

// Output:
/*
 * Enter the number :17
 * Multiplication talbe of 17
 * 17 x 1 = 17
 * 17 x 2 = 34
 * 17 x 3 = 51
 * 17 x 4 = 68
 * 17 x 5 = 85
 * 17 x 6 = 102
 * 17 x 7 = 119
 * 17 x 8 = 136
 * 17 x 9 = 153
 * 17 x 10 = 170
 */