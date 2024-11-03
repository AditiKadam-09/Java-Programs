// Reverse a String: Write a program that reverses a given string.

import java.util.Scanner;

public class Reverse_a_String {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter the String: ");
        String str1 = input.nextLine(); // Read the input string

        // Create a StringBuffer to hold the reversed string
        StringBuffer str2 = new StringBuffer();

        // Loop through the original string in reverse order
        for (int i = str1.length() - 1; i >= 0; i--) {
            str2.append(str1.charAt(i)); // Append each character to the StringBuffer
        }

        // Output the reversed string
        System.out.println("Reversed String: " + str2.toString());
    }
}

// Output:
// Enter the String: Sanjivani
// Reversed String: inavijnaS