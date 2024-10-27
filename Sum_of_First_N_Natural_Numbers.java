// Sum of First N Natural Numbers: Write a program to calculate the sum of the first N natural numbers, where N is provided by the user.

import java.util.Scanner; // Importing Scanner class for taking input

public class Sum_of_First_N_Natural_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creating a Scanner object to read input
        int n, sum = 0; // Declaring variables: n for the input number, sum initialized to 0

        // Prompting the user to enter the number up to which they want the sum
        System.out.print("Enter the number up to which you want the sum: ");
        n = input.nextInt(); // Reading the input and storing it in variable n

        // Looping from 1 to n to calculate the sum of the first n natural numbers
        for (int i = 1; i <= n; i++) {
            sum = sum + i; // Adding the current value of i to sum
        }

        // Displaying the result
        System.out.println("Sum of the first " + n + " natural numbers is: " + sum);
    }
}

// Output:
// Enter the number up to which you want the sum: 10
// Sum of the first 10 natural numbers is: 55