//Create a Simple Timer: Implement a countdown timer.

import java.util.Scanner;

public class Create_a_Simple_Timer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the countdown time in minutes
        System.out.print("Enter the time in minutes: ");
        int min = input.nextInt();

        // Convert minutes to seconds
        int sec = min * 60;

        try {
            // Start countdown from the total seconds to 0
            for (int i = sec; i > 0; i--) {
                int minutesLeft = i / 60; // Calculate remaining minutes
                int secondsLeft = i % 60; // Calculate remaining seconds

                // Display the timer in mm:ss format
                System.out.printf("Time left: %02d:%02d%n", minutesLeft, secondsLeft);

                // Pause execution for 1 second
                Thread.sleep(1000);
            }

            // Display message when timer is complete
            System.out.println("Time's up!");
        } catch (InterruptedException e) {
            System.out.println("Timer interrupted.");
        }
    }
}

// Output:
/*
 * Enter the time in minutes: 1
 * Time left: 01:00
 * Time left: 00:59
 * Time left: 00:58
 * Time left: 00:57
 * Time left: 00:56
 * Time left: 00:55
 * Time left: 00:54
 * Time left: 00:53
 * Time left: 00:52
 * Time left: 00:51
 * Time left: 00:50
 * Time left: 00:49
 * Time left: 00:48
 * Time left: 00:47
 * Time left: 00:46
 * Time left: 00:45
 * Time left: 00:44
 * Time left: 00:43
 * Time left: 00:42
 * Time left: 00:41
 * Time left: 00:40
 * Time left: 00:39
 * Time left: 00:38
 * Time left: 00:37
 * Time left: 00:36
 * Time left: 00:35
 * Time left: 00:34
 * Time left: 00:33
 * Time left: 00:32
 * Time left: 00:31
 * Time left: 00:30
 * Time left: 00:29
 * Time left: 00:28
 * Time left: 00:27
 * Time left: 00:26
 * Time left: 00:25
 * Time left: 00:24
 * Time left: 00:23
 * Time left: 00:22
 * Time left: 00:21
 * Time left: 00:20
 * Time left: 00:19
 * Time left: 00:18
 * Time left: 00:17
 * Time left: 00:16
 * Time left: 00:15
 * Time left: 00:14
 * Time left: 00:13
 * Time left: 00:12
 * Time left: 00:11
 * Time left: 00:10
 * Time left: 00:09
 * Time left: 00:08
 * Time left: 00:07
 * Time left: 00:06
 * Time left: 00:05
 * Time left: 00:04
 * Time left: 00:03
 * Time left: 00:02
 * Time left: 00:01
 * Time's up!
 */