import java.util.Scanner;

public class RemoveDuplicateCharacters {
    public static String removeDuplicates(String input) {
        // StringBuilder to store the result
        StringBuilder result = new StringBuilder();

        // Loop through the input string
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // Check if the character is already in the result
            if (result.indexOf(String.valueOf(currentChar)) == -1) {
                result.append(currentChar);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Remove duplicates
        String output = removeDuplicates(input);

        // Print the result
        System.out.println("Original String: " + input);
        System.out.println("String after removing duplicates: " + output);

        scanner.close();
    }
}
