// Find Common Elements in Two Arrays: Find common elements between two arrays.

import java.util.Scanner;

public class Common_Elements_in_Two_Arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input first array
        System.out.print("Enter the size of the first array: ");
        int size1 = input.nextInt();
        int arr1[] = new int[size1];
        System.out.println("Enter " + size1 + " elements of the first array:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = input.nextInt();
        }

        // Input second array
        System.out.print("Enter the size of the second array: ");
        int size2 = input.nextInt();
        int arr2[] = new int[size2];
        System.out.println("Enter " + size2 + " elements of the second array:");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = input.nextInt();
        }

        // StringBuffer to store common elements
        StringBuffer commonElements = new StringBuffer();

        // Find common elements
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    if (commonElements.indexOf(Integer.toString(arr1[i])) == -1) { // Avoid duplicates
                        commonElements.append(arr1[i] + " ");
                    }
                }
            }
        }

        // Output the common elements
        if (commonElements.length() > 0) {
            System.out.println("Common elements: " + commonElements);
        } else {
            System.out.println("No common elements found.");
        }

        // Close scanner
        input.close();
    }
}

// Output:
/*
 * Enter the size of the first array: 4
 * Enter 4 elements of the first array:
 * 1 2 3 4
 * Enter the size of the second array: 4
 * Enter 4 elements of the second array:
 * 3 4 5 6
 * Common elements: 3 4
 */