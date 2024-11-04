//Sort Names by Length: Sort a list of names based on their lengths.

import java.util.Scanner;

public class Sort_Names_by_Length {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        // Clear the buffer after reading an integer
        input.nextLine(); // This prevents skipping the next input

        // Create an array to store the names
        String str[] = new String[size];

        // Prompt the user to enter the names
        System.out.println("Enter " + size + " names:");
        for (int i = 0; i < str.length; i++) {
            str[i] = input.nextLine(); // Read each name into the array
        }

        // Sort the array of names by their lengths using a simple bubble sort algorithm
        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                // Compare the lengths of adjacent names
                if (str[i].length() > str[j].length()) {
                    // Swap if the current name is longer than the next
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }

        // Output the sorted names
        System.out.println("\nNames sorted by length:");
        for (String name : str) {
            System.out.println(name); // Print each name on a new line
        }

        // Close the scanner to prevent resource leaks
        input.close();
    }
}

// Output:
/*
 * Enter the size of the array: 5
 * Enter 5 names:
 * The
 * Below
 * a
 * Then
 * an
 * 
 * Names sorted by length:
 * a
 * an
 * The
 * Then
 * Below
 */