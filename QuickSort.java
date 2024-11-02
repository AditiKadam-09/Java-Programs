import java.util.Arrays; // Import the Arrays class for printing the array.
import java.util.Scanner; // Import the Scanner class for user input.

public class QuickSort {

    // Method to perform quick sort on an array.
    public static void quickSort(int[] arr, int low, int high) {
        // Check if low index is less than high index.
        if (low < high) {
            // Find the partitioning index.
            int partitionIndex = partition(arr, low, high);

            // Recursively sort the elements before and after partitioning.
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    // Method to partition the array into two halves.
    private static int partition(int[] arr, int low, int high) {
        // Select the rightmost element as the pivot.
        int pivot = arr[high];
        int i = low - 1; // Index of the smaller element.

        // Loop through the array and rearrange elements based on the pivot.
        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to the pivot.
            if (arr[j] <= pivot) {
                i++; // Increment the index of the smaller element.
                // Swap arr[i] and arr[j].
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap the pivot element with the element at index i + 1.
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // Return the partition index.
        return i + 1;
    }

    // Main method to test the quick sort algorithm.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object for user input.

        // Prompt the user to enter the size of the array.
        System.out.print("Enter the number of elements in the array: ");
        int size = input.nextInt(); // Read the size of the array.

        int[] arr = new int[size]; // Initialize the array with the specified size.

        // Prompt the user to enter the elements of the array.
        System.out.println("Enter " + size + " elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt(); // Read each element from user input.
        }

        System.out.println("Original array: " + Arrays.toString(arr)); // Print the original array.

        // Call the quickSort method on the array.
        quickSort(arr, 0, arr.length - 1);

        // Print the sorted array.
        System.out.println("Sorted array: " + Arrays.toString(arr));

        input.close(); // Close the scanner to prevent resource leaks.
    }
}

// Output:
// Enter the number of elements in the array: 6
// Enter 6 elements of the array:
// 1 7 2 5 8 10
// Original array: [1, 7, 2, 5, 8, 10]
// Sorted array: [1, 2, 5, 7, 8, 10]