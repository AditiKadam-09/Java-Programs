// Find Largest and Smallest in Array: Find the largest and smallest elements in an array.

import java.util.Scanner;

public class Largest_and_Smallest_in_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner object for user input

        // Prompt user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        // Initialize the array with the specified size
        int arr[] = new int[size];

        // Prompt user to enter elements of the array
        System.out.println("Enter the " + size + " elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt(); // Read each element from user input
        }

        // Initialize min and max variables with the first element of the array
        int min = arr[0], max = arr[0];

        // Traverse the array to find the smallest and largest elements
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) { // Update min if current element is smaller
                min = arr[i];
            }
            if (arr[i] > max) { // Update max if current element is larger
                max = arr[i];
            }
        }

        // Display the largest and smallest elements found
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);

    }
}

// Output:
// Enter the size of the array: 5
// Enter the 5 elements of the array:
// 1 3 6 0 5
// Maximum element: 6
// Minimum element: 0