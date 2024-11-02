// Calculate Sum of Angles in a Triangle: Check if three angles form a triangle.

import java.util.Scanner;

public class Sum_of_Angles_in_a_Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the three angles
        System.out.println("Enter the angles of the triangle");
        System.out.print("First angle: ");
        float first = input.nextFloat();
        System.out.print("Second angle: ");
        float second = input.nextFloat();
        System.out.print("Third angle: ");
        float third = input.nextFloat();

        // Calculate the sum of the angles
        float angleSum = first + second + third;

        // Check if the angles form a triangle
        if (angleSum == 180) {
            System.out.println("The given angles form a triangle.");
        } else {
            System.out.println("The given angles do not form a triangle.");
        }

        // Close the Scanner
        input.close();
    }
}

// Output:
// Enter the angles of the triangle
// First angle: 90
// Second angle: 45
// Third angle: 45
// The given angles form a triangle.