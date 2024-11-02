//Check for Pythagorean Triplets: Check if three given numbers form a Pythagorean triplet.

import java.util.Scanner;

public class Check_for_Pythagorean_Triplets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking three numbers as input from the user
        System.out.print("Enter the first number: ");
        float a = input.nextFloat();
        System.out.print("Enter the second number: ");
        float b = input.nextFloat();
        System.out.print("Enter the third number: ");
        float c = input.nextFloat();

        // Check if the numbers satisfy the Pythagorean triplet condition
        // The numbers form a Pythagorean triplet if a² + b² = c² or a² + c² = b² or b²
        // + c² = a²
        if ((a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a)) {
            System.out.println("The given numbers form a Pythagorean triplet.");
        } else {
            System.out.println("The given numbers do not form a Pythagorean triplet.");
        }

        input.close();
    }
}

// Output:
// Enter the first number: 3
// Enter the second number: 4
// Enter the third number: 5
// The given numbers form a Pythagorean triplet.