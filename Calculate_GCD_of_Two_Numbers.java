//Calculate GCD of Two Numbers: Write a program to find the greatest common divisor (GCD) of two integers.

import java.util.Scanner;

public class Calculate_GCD_of_Two_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the two numbers
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        int res = 1; // Initialize remainder variable to start the loop

        // Use the Euclidean algorithm to find the GCD
        while (res != 0) {
            res = num1 % num2; // Calculate remainder
            num1 = num2; // Assign num2 to num1
            num2 = res; // Assign remainder to num2
        }

        // num1 holds the GCD after the loop finishes
        System.out.println("Greatest common factor is " + num1);
    }
}

// Output:
// Enter first number :48
// Enter second number :18
// Greatest common factor is 6