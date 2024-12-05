
//Design a Java program that merges two sorted arrays into a single sorted array.
import java.util.Scanner;

public class MergeSortedArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first sorted array
        System.out.print("Enter the size of the first sorted array: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Enter elements of the first sorted array:");
        for (int i = 0; i < size1; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }

        // Input for the second sorted array
        System.out.print("Enter the size of the second sorted array: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Enter elements of the second sorted array:");
        for (int i = 0; i < size2; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }

        // Merge the two sorted arrays
        int[] mergedArray = mergeSortedArrays(array1, array2);

        // Print the merged sorted array
        System.out.println("Merged Sorted Array:");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }

        scanner.close();
    }

    // Method to merge two sorted arrays
    public static int[] mergeSortedArrays(int[] array1, int[] array2) {
        int size1 = array1.length;
        int size2 = array2.length;
        int[] mergedArray = new int[size1 + size2];

        int i = 0, j = 0, k = 0;

        // Merge arrays until one of them is exhausted
        while (i < size1 && j < size2) {
            if (array1[i] <= array2[j]) {
                mergedArray[k++] = array1[i++];
            } else {
                mergedArray[k++] = array2[j++];
            }
        }

        // Copy remaining elements from the first array (if any)
        while (i < size1) {
            mergedArray[k++] = array1[i++];
        }

        // Copy remaining elements from the second array (if any)
        while (j < size2) {
            mergedArray[k++] = array2[j++];
        }

        return mergedArray;
    }
}
