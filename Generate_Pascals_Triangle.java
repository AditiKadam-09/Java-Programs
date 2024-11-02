//Generate Pascal's Triangle: Generate Pascal's Triangle for a given number of rows.
//Construction Rules:
//The topmost row (row 0) is simply 1.
//Each number is the sum of the two numbers directly above it from the previous row.
//The edges of the triangle are always 1.

import java.util.Scanner;

public class Generate_Pascals_Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the number of rows for Pascal's Triangle
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int rows = input.nextInt();

        // Loop to generate each row of Pascal's Triangle
        for (int i = 0; i < rows; i++) {
            // Print leading spaces for formatting
            for (int space = 0; space < rows - i - 1; space++) {
                System.out.print(" ");
            }

            // Calculate and print each element in the current row
            int number = 1; // The first number in each row is always 1
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " "); // Print the current number
                number = number * (i - j) / (j + 1); // Update number for next element
            }

            // Move to the next line after finishing the current row
            System.out.println();

            input.close();
        }
    }
}

// Output:
/*
 * Enter the number of rows for Pascal's Triangle: 5
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 */