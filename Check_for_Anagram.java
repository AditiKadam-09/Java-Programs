import java.util.Arrays;
import java.util.Scanner;

public class Check_for_Anagram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input two strings
        System.out.print("Enter first string: ");
        String str1 = input.nextLine();
        System.out.print("Enter second string: ");
        String str2 = input.nextLine();

        // Convert both strings to lowercase to make the check case-insensitive
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Convert strings to character arrays
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        // Sort both character arrays
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        // Check if both sorted arrays are equal
        if (Arrays.equals(ch1, ch2)) {
            System.out.println("Both strings are anagrams");
        } else {
            System.out.println("Both strings are not anagrams");
        }
    }
}

// Output:
// Enter first string: heart
// Enter second string: earth
// Both strings are anagrams