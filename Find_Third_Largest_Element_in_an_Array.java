// Find Third Largest Element in an Array: Write a program to find the third largest number in a given array.

import java.util.Scanner;

public class Find_Third_Largest_Element_in_an_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object for user input

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt(); // Read the size of the array
        int arr[] = new int[size]; // Initialize the array with the specified size

        // Prompt the user to enter the elements of the array
        System.out.println("Enter " + size + " elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt(); // Read each element into the array
        }

        // Sort the array in ascending order using a simple bubble sort
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) { // Compare elements
                    // Swap elements if they are in the wrong order
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Output the third largest element from the sorted array
        System.out.println("The third largest element in the array is " + arr[arr.length - 3]);
    }
}

// Output:
// Enter the size of the array: 6
// Enter 6 elements of the array:
// 12 32 34 54 56 76
// The third largest element in the array is 54