//Find Maximum of Two Numbers: Create a program that takes two numbers and displays the larger one.

import java.util.Scanner; // Importing the Scanner class for taking user input

public class Maximum_of_Two_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creating an object of Scanner class to read input from the user
        int num1, num2; // Declaring integer variables 'num1' and 'num2' to store the user inputs

        System.out.print("Enter the first number: "); // Prompting the user to enter the first number
        num1 = input.nextInt(); // Reading the first integer input from the user and storing it in 'num1'

        System.out.print("Enter the second number: "); // Prompting the user to enter the second number
        num2 = input.nextInt(); // Reading the second integer input from the user and storing it in 'num2'

        // Using conditional statements to compare 'num1' and 'num2'
        if (num1 > num2) { // Checking if 'num1' is greater than 'num2'
            System.out.println(num1 + " is greater than " + num2); // Displaying that 'num1' is the larger number
        } else if (num2 > num1) { // Checking if 'num2' is greater than 'num1'
            System.out.println(num2 + " is greater than " + num1); // Displaying that 'num2' is the larger number
        } else { // If neither condition is true, the numbers are equal
            System.out.println("Both numbers are the same"); // Displaying that both numbers are equal
        }

    }
}

// output:
// Enter the first number :12
// Enter the second number :56
// 56 is greater than 12
