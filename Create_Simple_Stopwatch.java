//Create a Simple Stopwatch: Implement a simple stopwatch that tracks elapsed time.

import java.util.Scanner;

public class Create_Simple_Stopwatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Press Enter to start the stopwatch.");
        input.nextLine(); // Wait for the user to press Enter

        long startTime = System.currentTimeMillis(); // Record start time

        System.out.println("Stopwatch started... Press Enter to stop.");

        // Create a new thread to display elapsed time every second
        Thread displayThread = new Thread(() -> {
            try {
                while (!Thread.currentThread().isInterrupted()) {
                    long currentTime = System.currentTimeMillis();
                    long elapsedMillis = currentTime - startTime;
                    long elapsedSeconds = elapsedMillis / 1000;
                    long minutes = elapsedSeconds / 60;
                    long seconds = elapsedSeconds % 60;

                    System.out.print("\rElapsed time: " + minutes + " minute(s) and " + seconds + " second(s) ");
                    Thread.sleep(1000); // Update every second
                }
            } catch (InterruptedException e) {
                // Thread interrupted when the stopwatch stops
            }
        });

        displayThread.start();
        input.nextLine(); // Wait for the user to press Enter again to stop the stopwatch
        displayThread.interrupt(); // Stop the display thread

        long endTime = System.currentTimeMillis(); // Record end time
        long elapsedMillis = endTime - startTime; // Calculate total elapsed time in milliseconds
        long elapsedSeconds = elapsedMillis / 1000;
        long minutes = elapsedSeconds / 60;
        long seconds = elapsedSeconds % 60;

        System.out.println("\nStopwatch stopped.");
        System.out.println("Total elapsed time: " + minutes + " minute(s) and " + seconds + " second(s).");
    }
}