//Initialize and print a 2D array of integers in Java.

public class TwoDArrayExample {
    public static void main(String[] args) {
        // Initialize a 2D array
        int[][] array = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println("Contents of the 2D array:");

        // Loop through the rows and columns to print the array
        for (int i = 0; i < array.length; i++) { // Iterate through rows
            for (int j = 0; j < array[i].length; j++) { // Iterate through columns
                System.out.print(array[i][j] + " "); // Print each element
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
