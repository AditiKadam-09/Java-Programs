//How would you check if a String is a palindrome in Java?

import java.util.Scanner;

public class palindrome_String {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String :");
        String str = input.nextLine();
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
