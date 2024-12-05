//Create a while loop that prompts the user for their flight choice until a valid number is entered

import java.util.Scanner;

public class FlightChoice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int flightChoice = 0; // Initialize flight choice with an invalid number

        // Loop until a valid flight choice is entered
        while (flightChoice < 1 || flightChoice > 3) {
            System.out.print("Enter your flight choice (1, 2, or 3): ");

            // Check if the user enters a valid number
            if (scanner.hasNextInt()) {
                flightChoice = scanner.nextInt();

                if (flightChoice < 1 || flightChoice > 3) {
                    System.out.println("Invalid choice. Please choose between 1, 2, or 3.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 3.");
                scanner.next(); // Clear the invalid input
            }
        }

        System.out.println("You have selected flight choice: " + flightChoice);

        scanner.close();
    }
}
