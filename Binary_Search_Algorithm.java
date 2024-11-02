//Binary Search Algorithm: Implement binary search on a sorted array.

import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search_Algorithm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object for user input

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        int[] arr = new int[size]; // Initialize the array of the given size

        // Prompt the user to enter the elements of the array
        System.out.println("Enter " + size + " elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt(); // Read each element into the array
        }

        // Sort the array using Arrays.sort() method
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr)); // Display the sorted array

        // Prompt the user to enter the number to search
        System.out.print("Enter the number to search: ");
        int target = input.nextInt(); // Read the target number

        // Call the binary search method and store the result
        int result = binarySearch(arr, target);

        // Display the result to the user
        if (result == -1) {
            System.out.println("Number not found in the array."); // If number not found
        } else {
            System.out.println("Number found at index: " + result); // If number is found
        }

        input.close(); // Close the Scanner to free resources
    }

    // Method to perform binary search
    public static int binarySearch(int[] arr, int target) {
        int left = 0; // Initialize the left boundary
        int right = arr.length - 1; // Initialize the right boundary

        // Loop until the left boundary exceeds the right boundary
        while (left <= right) {
            int mid = left + (right - left) / 2; // Calculate the middle index

            // Check if the target is present at mid
            if (arr[mid] == target) {
                return mid; // Return the index if found
            }
            // If the target is greater, ignore the left half
            else if (arr[mid] < target) {
                left = mid + 1; // Move the left boundary to mid + 1
            }
            // If the target is smaller, ignore the right half
            else {
                right = mid - 1; // Move the right boundary to mid - 1
            }
        }

        // If the target is not found in the array
        return -1; // Return -1 to indicate not found
    }
}

// Output:
/*
 * Enter the size of the array: 6
 * Enter 6 elements of the array:
 * 3 5 6 2 1 4
 * Sorted array: [1, 2, 3, 4, 5, 6]
 * Enter the number to search: 7
 * Number not found in the array.
 */