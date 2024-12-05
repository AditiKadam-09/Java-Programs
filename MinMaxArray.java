
//Demonstrate how to find the minimum and maximum values in a given array
import java.util.Scanner;

public class MinMaxArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Check for valid array size
        if (n <= 0) {
            System.out.println("Array size must be greater than 0.");
            return;
        }

        // Declare the array
        int[] array = new int[n];

        // Input elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Find the minimum and maximum values
        int min = findMinimum(array);
        int max = findMaximum(array);

        // Print the results
        System.out.println("The minimum value in the array is: " + min);
        System.out.println("The maximum value in the array is: " + max);

        scanner.close();
    }

    // Method to find the minimum value in the array
    public static int findMinimum(int[] array) {
        int min = array[0];
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    // Method to find the maximum value in the array
    public static int findMaximum(int[] array) {
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
}
