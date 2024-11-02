//Find the Mode of an Array: Find the mode of an array.

import java.util.Scanner; // Import Scanner class for user input.

public class Mode_of_an_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object for user input.

        // Prompt the user to enter the size of the array.
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt(); // Read the size of the array.

        int arr[] = new int[size]; // Initialize the array with the specified size.

        // Prompt the user to enter the elements of the array.
        System.out.println("Enter " + size + " elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt(); // Read each element from user input.
        }

        int mode = arr[0]; // Initialize mode with the first element.
        int maxCount = 0; // Variable to track the maximum count.

        // Loop through each element to count its occurrences.
        for (int i = 0; i < arr.length; i++) {
            int count = 0; // Reset count for each element.

            // Count occurrences of arr[i]
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++; // Increment count if a match is found.
                }
            }

            // Update mode if the current count is greater than maxCount
            if (count > maxCount) {
                maxCount = count; // Update maximum count.
                mode = arr[i]; // Update mode with the current number.
            }
        }

        // Display the mode of the array.
        System.out.println("The mode of the array is: " + mode);

        input.close(); // Close the scanner to prevent resource leaks.
    }
}

// Output:
// Enter the size of the array: 6
// Enter 6 elements of the array:
// 1 2 2 3 1 1
// The mode of the array is: 1