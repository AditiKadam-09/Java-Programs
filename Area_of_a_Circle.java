//Area of a Circle: Create a program that takes the radius as input and calculates the area using 𝜋𝑟*r

import java.util.Scanner; // Importing the Scanner class for taking user input

public class Area_of_a_Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creating an object of the Scanner class to read input from the user
        double r, a; // Declaring variables 'r' for radius and 'a' for area
        double PI = 3.141; // Declaring the value of PI

        System.out.print("Enter the radius of the circle: "); // Prompting the user to enter the radius
        r = input.nextDouble(); // Reading the radius input from the user and storing it in 'r'

        a = PI * r * r; // Calculating the area of the circle using the formula: Area = π * r²
        System.out.println("Area of the circle is: " + a + " sq. units"); // Displaying the calculated area

    }
}

// output:
// Enter the radius of circle :4.5
// Area of the circle is :63.60525 sq.unit