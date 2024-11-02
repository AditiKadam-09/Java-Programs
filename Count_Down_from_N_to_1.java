// Count Down from N to 1: Count down from a specified number N to 1.

import java.util.Scanner;

public class Count_Down_from_N_to_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the starting value for the countdown
        System.out.print("Enter the value from which you want to start count down: ");
        int n = input.nextInt();

        // Countdown message
        System.out.println("Countdown Started:");

        // Countdown loop from N to 1
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
            try {
                // Pauses for 1000 milliseconds between numbers
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Countdown interrupted.");
            }
        }

        // Close the Scanner
        input.close();

        System.out.println("Countdown complete!");
    }
}
