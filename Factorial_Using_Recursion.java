//Factorial Using Recursion: Implement a program that calculates the factorial of a given number using a recursive method.

import java.util.Scanner;

public class Factorial_Using_Recursion {

    // Main method to run the program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        // Call the recursive method and display the result
        System.out.println("Factorial of " + num + " is " + fact(num));
    }

    // Recursive method to calculate factorial
    public static int fact(int n) {
        // Base case: if n is 0 or 1, return 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive case: n * factorial of (n-1)
        return n * fact(n - 1);
    }
}

// Output:
// Enter the number: 5
// Factorial of 5 is 120