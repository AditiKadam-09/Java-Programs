/*
 * Write a Java program to reverse a given String without using the built-in reverse method. Example:
 * Input: "Hello"
 * Output: "olleH"
 */

import java.util.Scanner;

public class reverse_String_without_builtIn_reverse_method {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String :");
        String str = input.nextLine();
        StringBuffer str2 = new StringBuffer();
        for (int i = str.length() - 1; i >= 0; i--) {
            str2.append(str.charAt(i));
        }
        System.out.println("reverse String is " + str2.toString());
    }
}
