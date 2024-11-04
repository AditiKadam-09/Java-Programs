//Calculate the Sum of Squares of N Natural Numbers: Calculate the sum of squares of the first N natural numbers.

import java.util.Scanner;

public class Calculate_Sum_of_Squares_of_N_Natural_Numbers {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the value of N
        System.out.print("Enter the number up to which you want the sum of squares: ");
        int n = input.nextInt();

        // Initialize sum variable to store the sum of squares
        int sum = 0;

        // Calculate the sum of squares for numbers from 1 to N
        for (int i = 1; i <= n; i++) {
            sum = sum + (i * i); // Add square of i to sum
        }

        // Display the calculated sum
        System.out.println("The sum of squares up to " + n + " is: " + sum);
    }
}

// Output:
// Enter the number up to which you want the sum of squares: 5
// The sum of squares up to 5 is: 55