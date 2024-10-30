// Area of a Triangle: Calculate the area of a triangle given base and height.

import java.util.Scanner;

public class Area_of_a_Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner object for user input

        // Prompt user to enter the base of the triangle
        System.out.print("Enter the base of the triangle: ");
        float base = input.nextFloat();

        // Prompt user to enter the height of the triangle
        System.out.print("Enter the height of the triangle: ");
        float height = input.nextFloat();

        // Calculate the area of the triangle using the formula (1/2 * base * height)
        double area = 0.5 * base * height;

        // Display the calculated area
        System.out.print("The area of the triangle is " + area + " square units.");

    }
}

// Output:
// Enter the base of the triangle: 12
// Enter the height of the triangle: 4.5
// The area of the triangle is 27.0 square units.