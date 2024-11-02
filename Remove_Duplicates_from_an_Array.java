//Remove Duplicates from an Array: Remove duplicate elements from an array.

import java.util.Scanner;

public class Remove_Duplicates_from_an_Array {
    public static void main(String[] args) {
        // Initialize the scanner to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        // Declare an array to store user input values
        System.out.println("Enter " + size + " elements of the array:");
        int arr[] = new int[size];

        // Read each element from the user and store it in the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        // Temporary array to store unique elements without duplicates
        int uniqueArr[] = new int[size];
        int uniqueCount = 0; // Keeps track of the number of unique elements

        // Loop through each element in the original array
        for (int i = 0; i < size; i++) {
            boolean isDuplicate = false; // Flag to check if the element is a duplicate

            // Check if the current element already exists in uniqueArr
            for (int j = 0; j < uniqueCount; j++) {
                if (arr[i] == uniqueArr[j]) {
                    isDuplicate = true; // Set flag to true if duplicate is found
                    break; // Exit the loop if a duplicate is found
                }
            }

            // If the element is not a duplicate, add it to uniqueArr
            if (!isDuplicate) {
                uniqueArr[uniqueCount] = arr[i];
                uniqueCount++; // Increment uniqueCount for each unique element
            }
        }

        // Display the array with duplicates removed
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(uniqueArr[i] + " ");
        }

        input.close();
    }
}

// Output:
// Enter the size of the array: 5
// Enter 5 elements of the array:
// 1 2 3 2 3
// Array after removing duplicates:
// 1 2 3