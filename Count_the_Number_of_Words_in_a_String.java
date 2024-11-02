//Count the Number of Words in a String: Count the number of words in a string.

import java.util.Scanner;

public class Count_the_Number_of_Words_in_a_String {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = input.nextLine().trim(); // Trim leading and trailing spaces

        int count = 1; // Start count at 1 assuming the input is not empty

        // Loop through characters to count spaces between words
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                count++;
            }
        }

        System.out.println("Count of words in sentence: " + count);

        input.close();
    }
}

// Output:
// Enter the String: He is a good man
// Count of words in sentence: 5