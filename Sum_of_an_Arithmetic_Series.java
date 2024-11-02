//Sum of an Arithmetic Series: Calculate the sum of an arithmetic series.

import java.util.Scanner;

public class Sum_of_an_Arithmetic_Series {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the first term of the series from the user
        System.out.print("Enter the first term: ");
        int a = input.nextInt();

        // Get the common difference of the series
        System.out.print("Enter the common difference: ");
        int d = input.nextInt();

        // Get the number of terms up to which the sum is to be calculated
        System.out.print("Enter the number of terms for which you want the sum of this series: ");
        int n = input.nextInt();

        // Initialize an array to store the arithmetic series terms
        int arr[] = new int[n];
        arr[0] = a; // Set the first term

        // Generate each term of the series
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + d; // Each term is previous term + common difference
        }

        // Display the arithmetic series
        System.out.println("The arithmetic series is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Calculate the sum of the arithmetic series using the formula
        double Sn = (n / 2.0) * (2 * a + (n - 1) * d);

        // Display the sum of the series
        System.out.println("\nSum of this series is: " + Sn);

        input.close();
    }
}

// Output:
// Enter the first term: 3
// Enter the common difference: 4
// Enter the number of terms for which you want the sum of this series: 5
// The arithmetic series is:
// 3 7 11 15 19
// Sum of this series is: 55.0