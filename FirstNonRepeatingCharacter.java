import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    // Method to find the first non-repeating character
    public static char findFirstNonRepeatingChar(String input) {
        // Convert the input to a character array
        char[] charArray = input.toCharArray();

        // Traverse each character
        for (int i = 0; i < charArray.length; i++) {
            char currentChar = charArray[i];
            boolean isRepeating = false;

            // Check if the character repeats
            for (int j = 0; j < charArray.length; j++) {
                if (i != j && currentChar == charArray[j]) {
                    isRepeating = true;
                    break;
                }
            }

            // Return the first non-repeating character
            if (!isRepeating) {
                return currentChar;
            }
        }

        // Return a placeholder if no non-repeating character is found
        return '\0'; // Null character (no valid non-repeating character)
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Find the first non-repeating character
        char result = findFirstNonRepeatingChar(input);

        // Output the result
        if (result != '\0') {
            System.out.println("The first non-repeating character is: '" + result + "'");
        } else {
            System.out.println("No non-repeating character found.");
        }

        scanner.close();
    }
}
