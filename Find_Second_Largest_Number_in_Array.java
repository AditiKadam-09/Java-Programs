//Find Second Largest Number in Array: Write a program to find the second largest number in an array.

import java.util.Scanner;

public class Find_Second_Largest_Number_in_Array {
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

        // Sorting array in ascending order using bubble sort
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // Swap if the current element is greater than the next element
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // The second last element in the sorted array is the second largest
        int max = arr[arr.length - 2];
        System.out.println("Second largest element in the given array is " + max);
    }
}

// Output:
// Enter the size of the array: 5
// Enter the 5 elements of the array:
// 12 45 67 87 65
// Second largest element in the given array is 67