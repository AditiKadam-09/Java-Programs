// Calculate Average of Numbers in an Array: Calculate the average of numbers in an array.

import java.util.Scanner; // Import the Scanner class for user input.

public class Average_of_Numbers_in_an_Array {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user.
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the size of the array.
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt(); // Read the size of the array.

        int arr[] = new int[size]; // Declare an array of the specified size.

        // Prompt the user to enter the elements of the array.
        System.out.println("Enter " + size + " elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt(); // Read each element of the array.
        }

        int sum = 0; // Initialize sum to 0.

        // Calculate the sum of all elements in the array.
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // Add each element to the sum.
        }

        // Calculate the average by dividing the sum by the number of elements.
        float average = (float) sum / arr.length;

        // Output the average.
        System.out.println("The average of numbers in the array is " + average);

        // Close the scanner to prevent resource leaks.
        input.close();
    }
}

// Output:
// Enter the size of the array: 6
// Enter 6 elements of the array:
// 1 2 3 4 5 6
// The average of numbers in the array is 3.5