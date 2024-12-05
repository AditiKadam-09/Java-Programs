//Prints a multiplication table but skips the multiplication by 5.

import java.util.Scanner;

public class MultiplicationTableSkippingFive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a number for which to print the multiplication table
        System.out.print("Enter a number to print its multiplication table: ");
        int number = scanner.nextInt();

        // Loop through numbers 1 to 10 to print the multiplication table
        for (int i = 1; i <= 10; i++) {
            // Skip the multiplication by 5
            if (i == 5) {
                continue;
            }
            // Print the multiplication result
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close();
    }
}
