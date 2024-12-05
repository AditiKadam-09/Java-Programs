//How would you identify and count the occurrences of each character in a String?

import java.util.Scanner;

public class count_occurrences_of_each_character {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String :");
        String str = input.nextLine();
        str = str.toLowerCase();

        char[] chars = str.toCharArray();
        boolean[] visited = new boolean[chars.length];

        System.out.println("Character occurrences:");

        for (int i = 0; i < chars.length; i++) {
            if (visited[i] || chars[i] == ' ') {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(chars[i] + ": " + count);
        }
    }
}
