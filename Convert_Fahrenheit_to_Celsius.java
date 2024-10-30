// Convert Fahrenheit to Celsius: Convert temperature from Fahrenheit to Celsius.

import java.util.Scanner;

public class Convert_Fahrenheit_to_Celsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner object for user input

        // Prompt the user to enter the temperature in Fahrenheit
        System.out.print("Enter the temperature in Fahrenheit: ");
        double f = input.nextDouble();

        // Convert Fahrenheit to Celsius using the formula
        double c = (f - 32) * (5.0 / 9);

        // Display the converted temperature in Celsius
        System.out.println("Temperature in Celsius: " + c);

    }
}

// Output:
// Enter the temperature in Fahrenheit: 100
// Temperature in Celsius: 37.77777777777778