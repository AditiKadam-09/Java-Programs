//LCM of Multiple Numbers: Create a program to find the LCM of an array of numbers.

import java.util.Scanner;

public class LCM_of_Multiple_Numbers {
    // Method to calculate GCD
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to calculate LCM using GCD
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt(); // Number of elements
        int[] numbers = new int[n]; // Array to hold the numbers

        // Read numbers into the array
        System.out.println("Enter " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }

        // Calculate LCM of the numbers in the array
        int result = numbers[0];
        for (int i = 1; i < n; i++) {
            result = lcm(result, numbers[i]);
        }

        // Output the result
        System.out.println("LCM of the given numbers is: " + result);
    }
}

// Output:
// Enter the number of elements:6
// Enter 6 numbers:
// 1 23 32 34 45 2
// LCM of the given numbers is: 563040