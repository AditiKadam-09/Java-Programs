//Sort an Array: Sort an array of integers in ascending order using any sorting algorithm.

import java.util.Scanner;

public class Sort_an_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking array size input
        System.out.print("Enter the size of an array: ");
        int size = input.nextInt();

        // Declaring array and taking elements input
        int arr[] = new int[size];
        System.out.println("Enter the " + size + " elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        // Sorting array using Bubble Sort algorithm
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    // Swap arr[i] and arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Displaying sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

// output:
// Enter the size of an array: 6
// Enter the 6 elements of the array:
// 12 11 18 16 13 10
// Sorted array:
// 10 11 12 13 16 18