//Implement a do-while loop that prompts the user to enter a number until they enter a negative number

import java.util.Scanner;

public class PromptUntilNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        // Do-while loop to prompt the user until they enter a negative number
        do {
            System.out.print("Enter a number: ");
            number = scanner.nextInt(); // Read the user's input
        } while (number >= 0); // Repeat the loop if the number is non-negative

        System.out.println("You entered a negative number: " + number);

        scanner.close();
    }
}
