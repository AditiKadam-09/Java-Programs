// Implement Selection Sort: Implement the selection sort algorithm.

import java.util.Scanner;

public class Selection_Sort {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int num = input.nextInt();

        // Declare an array of the specified size
        int arr[] = new int[num];

        // Input the elements of the array
        System.out.println("Enter " + num + " elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        // Perform Selection Sort
        for (int i = 0; i < arr.length - 1; i++) {
            // Assume the first unsorted element is the smallest
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                // Find the index of the smallest element in the unsorted part
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first unsorted element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        // Print the sorted array
        System.out.println("Sorted Array by selection sort:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Close the scanner to avoid resource leak
        input.close();
    }
}

// Output:
// Enter the size of the array: 6
// Enter 6 elements of the array:
// 12 10 15 14 13 11
// Sorted Array by selection sort:
// 10 11 12 13 14 15