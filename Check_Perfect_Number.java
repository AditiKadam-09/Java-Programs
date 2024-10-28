//Perfect Number Check: Write a program that checks if a given number is a perfect number (e.g., 6 is a perfect number).

import java.util.Scanner;

public class Check_Perfect_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int sum = 0;

        // Calculate the sum of all divisors of num (excluding num itself)
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }

        // Check if sum of divisors equals the original number
        if (sum == num) {
            System.out.println("The given number is a perfect number.");
        } else {
            System.out.println("The given number is not a perfect number.");
        }
    }
}

// Output:
// Enter the number :28
// given number is perfect number