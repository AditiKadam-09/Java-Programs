/*
 * Implement a method that capitalizes the first letter of each word in a given String.
 * Input: "hello world"
 * Output: "Hello World"
 */

import java.util.Scanner;

public class capitalizes_first_letter_of_each_word {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String :");
        String str = input.nextLine();
        String arr[] = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > 0) {

                arr[i] = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase();
            }
        }

        String result = String.join(" ", arr);

        System.out.println("Output: " + result);
    }
}
