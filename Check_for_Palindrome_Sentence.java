// Check for Palindrome Sentence: Check if a sentence is a palindrome.

import java.util.Scanner; // Import the Scanner class for user input.

public class Check_for_Palindrome_Sentence {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user.
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a sentence.
        System.out.print("Enter the Sentence: ");
        // Read the input, convert it to lowercase, and remove spaces and punctuation
        // for uniformity.
        String str = input.nextLine().toLowerCase().replaceAll("[^a-z0-9]", "");

        // Create a StringBuffer object with the cleaned input string and reverse it.
        StringBuffer str1 = new StringBuffer(str).reverse();

        // Check if the original cleaned string is equal to the reversed string.
        if (str.equals(str1.toString())) {
            System.out.println("The given sentence is a palindrome."); // Inform the user that the sentence is a
                                                                       // palindrome.
        } else {
            System.out.println("The given sentence is not a palindrome."); // Inform the user that the sentence is not a
                                                                           // palindrome.
        }

        // Close the scanner to prevent resource leaks.
        input.close();
    }
}

// Output:
// Enter the Sentence: Was it a car or a cat I saw?
// The given sentence is a palindrome.