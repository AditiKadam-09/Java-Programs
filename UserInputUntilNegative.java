
//Prompts the user to enter numbers until they enter a negative number.
import java.util.Scanner;

public class UserInputUntilNegative {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;

        // Loop to keep asking for numbers until a negative number is entered
        do {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            // If the number is negative, the loop will stop
            if (number < 0) {
                System.out.println("You entered a negative number. Exiting...");
            } else {
                System.out.println("You entered: " + number);
            }

        } while (number >= 0); // Continue the loop as long as the number is non-negative

        scanner.close();
    }
}
