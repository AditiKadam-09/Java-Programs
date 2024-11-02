// Calculate Distance Between Two Points: Use the distance formula for 2D points.

import java.util.Scanner; // Import the Scanner class for user input.

public class Calculate_Distance_Between_Two_Points {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user.
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the coordinates of point 1.
        System.out.println("Enter the x & y coordinates of point 1:");
        System.out.print("x-coordinate: ");
        float p1X = input.nextFloat(); // Read the x-coordinate of point 1.
        System.out.print("y-coordinate: ");
        float p1Y = input.nextFloat(); // Read the y-coordinate of point 1.

        // Prompt the user to enter the coordinates of point 2.
        System.out.println("Enter the x & y coordinates of point 2:");
        System.out.print("x-coordinate: ");
        float p2X = input.nextFloat(); // Read the x-coordinate of point 2.
        System.out.print("y-coordinate: ");
        float p2Y = input.nextFloat(); // Read the y-coordinate of point 2.

        // Calculate the square of the differences in the x-coordinates and
        // y-coordinates.
        double dX = (p2X - p1X) * (p2X - p1X); // Square of difference in x-coordinates.
        double dY = (p2Y - p1Y) * (p2Y - p1Y); // Square of difference in y-coordinates.

        // Calculate the distance using the distance formula.
        double distance = Math.sqrt(dX + dY); // Calculate the square root of the sum of squares.

        // Output the calculated distance.
        System.out.println("Distance is: " + distance + " units.");

        // Close the scanner to prevent resource leaks.
        input.close();
    }
}

// output:
/*
 * Enter the x & y coordinates of point 1:
 * x-coordinate: 3
 * y-coordinate: 4
 * Enter the x & y coordinates of point 2:
 * x-coordinate: 7
 * y-coordinate: 1
 * Distance is: 5.0 units.
 */