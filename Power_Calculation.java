// Power Calculation: Write a program that calculates the result of raising one number to the power of another.

import java.util.Scanner; // Importing Scanner class for taking input

public class Power_Calculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creating a Scanner object to read input
        int num, power, result = 1; // Declaring variables: num (base), power (exponent), result (initially 1)

        // Prompting the user to enter the base number
        System.out.print("Enter the base number: ");
        num = input.nextInt(); // Reading the base number and storing it in variable num

        // Prompting the user to enter the exponent
        System.out.print("Enter the exponent: ");
        power = input.nextInt(); // Reading the exponent and storing it in variable power

        // Looping power times to multiply num and calculate num raised to the power
        for (int i = 1; i <= power; i++) {
            result = result * num; // Multiplying result by num in each iteration
        }

        // Displaying the final result
        System.out.println(num + " raised to the power of " + power + " is " + result);
    }
}

// Output:
// Enter the base number: 5
// Enter the exponent: 3
// 5 raised to the power of 3 is 125