// Find the Median of an Array: Find the median of a given array of numbers.

import java.util.Scanner;
import java.util.Arrays;

public class Median_of_an_Array {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int n = input.nextInt();

        // Create an array to hold the elements
        int arr[] = new int[n];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter " + n + " elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt(); // Read each element into the array
        }

        // Sort the array to arrange the elements in ascending order
        Arrays.sort(arr);

        // Calculate the median
        double median;
        if (n % 2 == 0) { // If the number of elements is even
            // Median is the average of the two middle numbers
            median = (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        } else { // If the number of elements is odd
            // Median is the middle number
            median = arr[n / 2];
        }

        // Display the median
        System.out.println("The median of the array is: " + median);

        // Close the scanner to prevent resource leaks
        input.close();
    }
}

// Output:
// Enter the size of the array: 5
// Enter 5 elements of the array:
// 23 21 22 25 24
// The median of the array is: 23.0