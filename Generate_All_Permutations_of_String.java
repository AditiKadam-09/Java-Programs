//Generate All Permutations of a String: Generate all permutations of a given string.

import java.util.Scanner;

public class Generate_All_Permutations_of_String {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = input.nextLine(); // Read input string

        System.out.println("All permutations of the string are:");
        // Call the recursive method to generate permutations
        generatePermutations(str, 0, str.length() - 1);
    }

    // Method to generate permutations
    private static void generatePermutations(String str, int left, int right) {
        if (left == right) {
            // If left index is equal to right index, we have a complete permutation
            System.out.println(str); // Print the permutation
        } else {
            for (int i = left; i <= right; i++) {
                str = swap(str, left, i); // Swap the current character with the left index
                generatePermutations(str, left + 1, right); // Recursively generate permutations for the rest of the
                                                            // string
                str = swap(str, left, i); // Backtrack: undo the swap
            }
        }
    }

    // Utility method to swap characters in a string
    private static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray(); // Convert string to character array
        char temp = charArray[i]; // Store the character at the left index
        charArray[i] = charArray[j]; // Swap the characters
        charArray[j] = temp; // Restore the character at the right index
        return String.valueOf(charArray); // Convert character array back to string
    }
}

// Output:
/*
 * Enter the String: abc
 * All permutations of the string are:
 * abc
 * acb
 * bac
 * bca
 * cba
 * cab
 */