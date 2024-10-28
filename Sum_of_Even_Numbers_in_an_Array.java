//Sum of Even Numbers in an Array: Create a program that takes an array of integers and calculates the sum of even numbers.

import java.util.Scanner;

public class Sum_of_Even_Numbers_in_an_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        // Declare the array with the given size
        int arr[] = new int[size];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the " + size + " elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        // Initialize a variable to store the sum of even numbers
        int sum = 0;

        // Loop through the array to check each element
        for (int i = 0; i < arr.length; i++) {
            // If the element is even, add it to the sum
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }

        // Display the sum of even numbers
        System.out.println("Sum of even numbers in the given array is: " + sum);
    }
}

// Output:
// Enter the size of array :6
// Enter the 6 elements of an array :
// 12
// 11
// 13
// 2
// 19
// 7
// Sum of Even numbers in given array is 14