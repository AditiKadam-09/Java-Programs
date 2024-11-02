//Implement Insertion Sort: Implement the insertion sort algorithm.

import java.util.Scanner;

public class Insertion_Sort {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter " + size + " elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        // Insertion sort algorithm
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j;
            // Find the position where current element should be inserted
            for (j = i - 1; j >= 0 && arr[j] > current; j--) {
                arr[j + 1] = arr[j]; // Shift element to the right
            }
            arr[j + 1] = current; // Insert current element in the correct position
        }

        // Display sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        input.close();
    }
}

// Output:
// Enter the size of the array: 5
// Enter 5 elements of the array:
// 2 4 3 1 5
// Sorted array:
// 1 2 3 4 5