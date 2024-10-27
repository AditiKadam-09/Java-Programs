// Greatest of Three Numbers: Write a program to find the greatest of three numbers entered by the user.

import java.util.Scanner; // Importing Scanner class to take user input

public class Greatest_of_Three_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creating a Scanner object to read input

        int num1, num2, num3; // Declaring three integer variables to store the three numbers

        // Prompting the user to enter the first number and storing it in num1
        System.out.print("Enter first number :");
        num1 = input.nextInt();

        // Prompting the user to enter the second number and storing it in num2
        System.out.print("Enter second number :");
        num2 = input.nextInt();

        // Prompting the user to enter the third number and storing it in num3
        System.out.print("Enter third number :");
        num3 = input.nextInt();

        // Checking if num1 is greater than both num2 and num3
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the greatest number among all.");

            // Checking if num2 is greater than both num1 and num3
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is the greatest number among all.");

            // If neither num1 nor num2 is the greatest, num3 must be the largest
        } else if (num3 > num1 && num3 > num2) {
            System.out.println(num3 + " is the greatest number among all.");

            // If none of the above conditions are met, it means at least two numbers are
            // the same or all are equal
        } else {
            System.out.println("All numbers are the same, or any two numbers are the same.");
        }
    }
}

// Output:
// Enter first number :123
// Enter second number :345
// Enter third number :678
// 678 is the greatest number among all.