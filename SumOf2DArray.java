
//Write a Java program that sums the elements of a 2D array.
import java.util.Scanner;

public class SumOf2DArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the dimensions of the 2D array
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Declare the 2D array
        int[][] array = new int[rows][columns];

        // Input elements for the 2D array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        // Calculate the sum of the elements
        int sum = calculateSum(array);

        // Print the result
        System.out.println("The sum of all elements in the 2D array is: " + sum);

        scanner.close();
    }

    // Method to calculate the sum of a 2D array
    public static int calculateSum(int[][] array) {
        int sum = 0;

        // Loop through each row and column
        for (int[] row : array) {
            for (int value : row) {
                sum += value;
            }
        }

        return sum;
    }
}
