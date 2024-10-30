// Generate Random Numbers: Generate N random numbers within a specified range.

import java.util.Scanner;
import java.util.Random;

public class Generate_Random_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner object for user input
        Random random = new Random(); // Create Random object for generating random numbers

        // Prompt user to enter the number of random values (N)
        System.out.print("Enter the number of random numbers to generate (N): ");
        int N = input.nextInt();

        // Prompt user to enter the minimum and maximum range values
        System.out.print("Enter the minimum range value: ");
        int min = input.nextInt();

        System.out.print("Enter the maximum range value: ");
        int max = input.nextInt();

        System.out.println("\nGenerated Random Numbers:");
        for (int i = 0; i < N; i++) {
            // Generate a random number within the specified range
            int randomNum = random.nextInt(max - min + 1) + min;
            System.out.println(randomNum); // Print each random number
        }

    }
}

// Output:
/*
 * Enter the number of random numbers to generate (N): 3
 * Enter the minimum range value: 10
 * Enter the maximum range value: 20
 * 
 * Generated Random Numbers:
 * 12
 * 14
 * 19
 */