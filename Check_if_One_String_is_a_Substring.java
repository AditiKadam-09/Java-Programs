//Check if One String is a Substring: Check if one string is a substring of another.

import java.util.Scanner;

public class Check_if_One_String_is_a_Substring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the main string
        System.out.print("Enter the main string: ");
        String str = input.nextLine();

        // Prompt the user to enter the substring
        System.out.print("Enter the substring to check: ");
        String substr = input.nextLine();

        // Check if the main string contains the substring
        if (str.contains(substr)) {
            System.out.println("'" + substr + "' is a substring of '" + str + "'");
        } else {
            System.out.println("'" + substr + "' is not a substring of '" + str + "'");
        }
        input.close();
    }
}

// Output:
// Enter the main string: Sanjivani University
// Enter the substring to check: Sanjivani
// 'Sanjivani' is a substring of 'Sanjivani University'