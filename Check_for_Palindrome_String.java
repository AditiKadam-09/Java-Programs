//Check for Palindrome String: Check if a given string is a palindrome.

import java.util.Scanner;

public class Check_for_Palindrome_String {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input and converting to lowercase for case-insensitive comparison
        System.out.print("Enter the String: ");
        String str = input.nextLine().toLowerCase();

        // Converting string to StringBuffer to use reverse() method
        StringBuffer str1 = new StringBuffer(str);
        String reversedStr = str1.reverse().toString(); // Reversed string

        // Comparing the original string with the reversed string
        if (str.equals(reversedStr)) {
            System.out.println(str + " is a palindrome string");
        } else {
            System.out.println(str + " is not a palindrome string");
        }
    }
}

// Output:
// Enter the String: dad
// dad is a palindrome string

// Enter the String: cat
// cat is not a palindrome string