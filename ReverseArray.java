
//Write a Java program to reverse the array
import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Declare the array
        int[] array = new int[n];

        // Input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Reverse the array
        reverseArray(array);

        // Print the reversed array
        System.out.println("Reversed array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        scanner.close();
    }

    // Method to reverse the array
    public static void reverseArray(int[] array) {
        int left = 0, right = array.length - 1;

        while (left < right) {
            // Swap the elements at the left and right indices
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            // Move the indices closer to the center
            left++;
            right--;
        }
    }
}
