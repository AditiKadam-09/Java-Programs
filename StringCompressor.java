import java.util.Scanner;

public class StringCompressor {
    // Method to compress the string
    public static String compressString(String input) {
        StringBuilder compressed = new StringBuilder();

        // Initialize a counter for repeated characters
        int count = 1;

        for (int i = 0; i < input.length(); i++) {
            // Check if the next character is the same
            if (i + 1 < input.length() && input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                // Append the current character and its count
                compressed.append(input.charAt(i)).append(count);
                count = 1; // Reset the count
            }
        }

        // Return the compressed string only if it's shorter than the original
        return compressed.length() < input.length() ? compressed.toString() : input;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a string to compress: ");
        String input = scanner.nextLine();

        // Compress the string
        String output = compressString(input);

        // Output the result
        System.out.println("Compressed string: " + output);

        scanner.close();
    }
}
