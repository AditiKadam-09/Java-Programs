//Sum of Odd Numbers in an Array: Create a program that calculates the sum of all odd numbers in an integer array.

import java.util.Scanner;

public class Sum_of_Odd_Numbers_in_an_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        // Initialize the array with the specified size
        int arr[] = new int[size];

        // Prompt the user to enter each element in the array
        System.out.println("Enter the " + size + " elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        // Variable to store the sum of odd numbers
        int sum = 0;

        // Iterate through the array to find and add all odd numbers
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) { // Check if the element is odd
                sum = sum + arr[i]; // Add the odd element to sum
            }
        }

        // Display the sum of odd numbers in the array
        System.out.println("The sum of odd numbers in the given array is: " + sum);
    }
}

// Output:
// Enter the size of the array: 6
// Enter the 6 elements of the array:
// 11 12 13 14 15 16
// The sum of odd numbers in the given array is: 39