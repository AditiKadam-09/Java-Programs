import java.util.Scanner;

public class Sum_of_Diagonal_Elements {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user.
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the size of the matrix.
        System.out.print("Enter the size of the matrix: ");
        int size = input.nextInt();

        // Initialize a square 2D array (matrix) of the specified size.
        int arr[][] = new int[size][size];

        // Prompt the user to enter all the elements of the matrix.
        System.out.println("Enter " + (size * size) + " elements of the matrix:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                // Read each element of the matrix from user input.
                arr[i][j] = input.nextInt();
            }
        }

        // Initialize variables to hold the sums of the main and secondary diagonals.
        int mainDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        // Loop through the matrix to calculate the sums of both diagonals.
        for (int i = 0; i < arr.length; i++) {
            // Add the element on the main diagonal (where row index equals column index).
            mainDiagonalSum += arr[i][i];

            // Add the element on the secondary diagonal (where row index + column index
            // equals size - 1).
            secondaryDiagonalSum += arr[i][size - 1 - i];
        }

        // Output the sum of the main diagonal elements.
        System.out.println("Sum of the main diagonal elements of the matrix is: " + mainDiagonalSum);

        // Output the sum of the secondary diagonal elements.
        System.out.println("Sum of the secondary diagonal elements of the matrix is: " + secondaryDiagonalSum);

        // Close the scanner to prevent resource leaks.
        input.close();
    }
}

// Output:
/*
 * Enter the size of the matrix: 3
 * Enter 9 elements of the matrix:
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * Sum of the main diagonal elements of the matrix is: 15
 * Sum of the secondary diagonal elements of the matrix is: 15
 */