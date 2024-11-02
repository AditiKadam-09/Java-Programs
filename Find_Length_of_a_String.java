// Find Length of a String: Find the length of a given string without built-in methods.

import java.util.Scanner;

public class Find_Length_of_a_String {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter the String: ");
        String str = input.nextLine();

        // Initialize a counter to track the number of characters
        int count = 0;

        // Loop through each character in the string and increment the counter
        for (char ch : str.toCharArray()) {
            count++;
        }

        // Display the length of the string
        System.out.println("Length of String: " + count);

        // Close the Scanner
        input.close();
    }
}

// Output:
// Enter the String: Sanjivani University
// Length of String: 20