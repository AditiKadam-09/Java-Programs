import java.util.Scanner;

public class append_StringBuffer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Initialize StringBuffer with "Hello "
        StringBuffer str = new StringBuffer("Hello");
        System.out.println("String in the StringBuffer: " + str);

        // Input from user for appending
        System.out.print("Enter the String to append: ");
        String str2 = input.nextLine();

        // Append the user-provided string to the StringBuffer
        str.append(" ").append(str2);

        // Display the final result
        System.out.println("Appended string is: " + str);

        input.close();
    }
}
