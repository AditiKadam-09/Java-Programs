//Check if a Number is a Perfect Cube: Check if a number is a perfect cube.

import java.util.Scanner;

public class Check_if_Number_is_a_Perfect_Cube {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        // Variable to track if the number is a perfect cube
        boolean isCube = false;

        // Iterate from 1 to the cube root of the number
        for (int i = 1; i <= Math.cbrt(num); i++) {
            // Check if the cube of the current number equals the input number
            if ((i * i * i) == num) {
                isCube = true; // Set the flag to true if a perfect cube is found
                break; // Exit the loop as we found a cube root
            }
        }

        // Output the result based on the isCube flag
        if (isCube) {
            System.out.println(num + " is a perfect cube.");
        } else {
            System.out.println(num + " is not a perfect cube.");
        }

        // Close the scanner to prevent resource leaks
        input.close();
    }
}

// Output:
// Enter the number: 27
// 27 is a perfect cube.