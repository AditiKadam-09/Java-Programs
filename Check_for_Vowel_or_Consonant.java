//Check for Vowel or Consonant: Write a program that checks if a given character (A-Z or a-z) is a vowel or a consonant.

import java.util.Scanner; // Importing Scanner class for taking input

public class Check_for_Vowel_or_Consonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creating a Scanner object to read user input
        char ch; // Declaring a variable of type char to store the character

        // Prompting the user to enter a character
        System.out.print("Enter a character: ");
        ch = input.next().charAt(0); // Storing the first character of input into 'ch'

        // Checking if the character is a vowel (both lowercase and uppercase cases are
        // considered)
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("The given character is a vowel.");
        } else {
            System.out.println("The given character is a consonant.");
        }
    }
}

// Output:
// Enter a character: A
// The given character is a vowel.