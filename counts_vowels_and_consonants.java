//Write a program that counts the number of vowels and consonants in a given String.
//Input: "Hello World"
//Output: Vowels: 3, Consonants: 7

import java.util.Scanner;

public class counts_vowels_and_consonants {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string :");
        String str = input.nextLine();
        str = str.toLowerCase();
        char vowels[] = { 'a', 'e', 'i', 'o', 'u' };
        int vowelCount = 0, consonantCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean isVowel = false;
            for (char c : vowels) {
                if (c == ch) {
                    isVowel = true;
                }
            }
            if (isVowel) {
                vowelCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonantCount++;
            }
        }
        System.out.println("Vowels :" + vowelCount + " Consonants :" + consonantCount);
    }
}
