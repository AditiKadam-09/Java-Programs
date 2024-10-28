//Calculate Compound Interest: Write a program to calculate compound interest given the principal, rate, and time.

import java.util.Scanner;

public class Calculate_Compound_Interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt for the principal amount
        System.out.print("Enter principal amount: Rs. ");
        double p = input.nextDouble();

        // Prompt for the rate of interest
        System.out.print("Enter rate of interest: ");
        double r = input.nextDouble();

        // Prompt for the time period in years
        System.out.print("Enter time period: ");
        double t = input.nextDouble();

        // Calculate compound interest factor using the formula (1 + r/100)^t
        double res = 1;
        for (int i = 1; i <= t; i++) {
            res *= (1 + (r / 100));
        }

        // Calculate final amount A = P * (1 + r/100)^t
        double A = p * res;

        // Calculate compound interest CI = A - P
        double CI = A - p;

        // Display the calculated compound interest
        System.out.println("Compound interest is Rs. " + CI);
    }
}

// Output:
// Enter principal amount: Rs. 12000
// Enter rate of interest: 6
// Enter time period: 3
// Compound interest is Rs. 2292.1920000000027