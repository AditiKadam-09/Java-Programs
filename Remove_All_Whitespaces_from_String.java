//Remove All Whitespaces from a String: Remove all whitespaces from a string.

import java.util.Scanner;

public class Remove_All_Whitespaces_from_String {
    public static void main(String args[]) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter the string: ");
        String str = input.nextLine();

        // Initialize an empty StringBuffer to store the result without whitespaces
        StringBuffer newStr = new StringBuffer();

        // Loop through each character in the input string
        for (int i = 0; i < str.length(); i++) {
            // Check if the current character is not a whitespace
            if (str.charAt(i) != ' ') {
                // Append the character to newStr if it is not a whitespace
                newStr.append(str.charAt(i));
            }
        }

        // Display the string without whitespaces
        System.out.println("String without whitespaces: " + newStr);

        input.close();
    }
}

// Output:
// Enter the string: sanjivani university
// String without whitespaces: sanjivaniuniversity