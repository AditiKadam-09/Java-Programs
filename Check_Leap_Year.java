//Check Leap Year: Write a program that checks if a given year is a leap year.

import java.util.Scanner;

public class Check_Leap_Year {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a year
        System.out.print("Enter the year: ");
        int year = input.nextInt();

        // Check if the year is a leap year
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}

// Output:
// Enter the year :2024
// 2024 is the leap year