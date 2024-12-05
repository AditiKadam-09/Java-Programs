
//Write a Java program that finds the average of numbers stored in an integer array.
import java.util.Scanner;

public class AverageOfArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Check for valid array size
        if (n <= 0) {
            System.out.println("Array size must be greater than 0.");
            return;
        }

        // Declare the array
        int[] numbers = new int[n];

        // Take input for array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Calculate the average
        double average = calculateAverage(numbers);

        // Print the average
        System.out.println("The average of the array is: " + average);

        scanner.close();
    }

    // Method to calculate the average
    public static double calculateAverage(int[] array) {
        int sum = 0;

        // Loop to calculate the sum of elements
        for (int num : array) {
            sum += num;
        }

        // Calculate the average
        return (double) sum / array.length;
    }
}
