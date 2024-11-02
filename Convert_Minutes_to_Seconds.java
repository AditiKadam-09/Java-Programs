// Convert Minutes to Seconds: Convert a given number of minutes to seconds.

import java.util.Scanner; // Import the Scanner class for user input.

public class Convert_Minutes_to_Seconds {
    public static void main(String args[]) {
        // Create a Scanner object to read input from the user.
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of minutes.
        System.out.print("Enter the minutes: ");
        int min = input.nextInt(); // Read the number of minutes input by the user.

        // Calculate the equivalent number of seconds.
        int sec = min * 60;

        // Display the result to the user.
        System.out.println(min + " minutes is " + sec + " seconds.");

        // Close the scanner to prevent resource leaks.
        input.close();
    }
}

// Output:
// Enter the minutes: 5
// 5 minutes is 300 seconds.