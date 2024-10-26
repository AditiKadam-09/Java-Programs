//Convert Celsius to Fahrenheit: Write a program to convert a temperature given in Celsius to Fahrenheit.

import java.util.Scanner; // Importing the Scanner class for taking user input

public class Convert_Celsius_to_Fahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creating an object of Scanner class to read input from the user
        double C, F; // Declaring double variables 'C' for Celsius and 'F' for Fahrenheit

        System.out.print("Enter the temperature in Celsius: "); // Prompting the user to enter a temperature in Celsius
        C = input.nextDouble(); // Reading the Celsius temperature from the user and storing it in 'C'

        F = (C * (9.0 / 5)) + 32; // Converting Celsius to Fahrenheit using the formula
        System.out.println(C + " degree Celsius is " + F + " degree Fahrenheit"); // Displaying the result in Fahrenheit

    }
}

// output:
// Enter the temperature in Celsius: 100
// 100.0 degree Celsius is 212.0 degree Fahrenheit