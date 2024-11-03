//Count the Number of Occurrences of a Substring: Count how many times a substring appears in a string.

import java.util.Scanner;

public class Count_Number_of_Occurrences_of_Substring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String str = input.nextLine();
        System.out.print("Enter the substring to count: ");
        String substr = input.nextLine();

        int count = 0;
        int index = 0;

        // Search for substr within str, starting at each successive position
        while ((index = str.indexOf(substr, index)) != -1) {
            count++;
            index += substr.length(); // Move index forward to avoid overlapping matches
        }

        System.out.println("The substring appears " + count + " times.");

        input.close();
        ;
    }
}

// Output:
// Enter the main string: banana
// Enter the substring to count: na
// The substring appears 2 times.