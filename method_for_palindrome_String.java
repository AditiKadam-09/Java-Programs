//Create a method that checks if a given String is a palindrome (reads the same forwards and backwards).
//Input: "racecar"
//Output: true

import java.util.Scanner;

public class method_for_palindrome_String {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String :");
        String str = input.nextLine();
        palindrome_String(str);
    }

    public static void palindrome_String(String str) {
        str = str.toLowerCase();
        StringBuffer str2 = new StringBuffer();
        for (int i = str.length() - 1; i >= 0; i--) {
            str2.append(str.charAt(i));
        }
        if (str.equals(str2.toString())) {
            System.out.println("Given String is Palindrome");
        } else {
            System.out.println("Given String is not Palindrome");
        }
    }
}
