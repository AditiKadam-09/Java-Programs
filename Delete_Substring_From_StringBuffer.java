import java.util.Scanner;

public class Delete_Substring_From_StringBuffer {

    // Method to delete a substring from StringBuffer
    public static StringBuffer deleteSubstring(StringBuffer str, String substring) {
        // Find the index of the substring
        int startIndex = str.indexOf(substring);

        // If the substring exists, delete it
        if (startIndex != -1) {
            str.delete(startIndex, startIndex + substring.length());
        }

        return str;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user for the string
        System.out.print("Enter the original string: ");
        StringBuffer str = new StringBuffer(scanner.nextLine());

        // Taking input from the user for the substring to delete
        System.out.print("Enter the substring to delete: ");
        String substring = scanner.nextLine();

        System.out.println("Original String: " + str);

        // Remove the user-specified substring
        str = deleteSubstring(str, substring);

        // Print the modified string
        System.out.println("Modified String: " + str);

        scanner.close();
    }
}
