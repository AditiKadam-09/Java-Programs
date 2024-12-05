import java.util.Scanner;

public class Merge_StringBuffers {

    // Method to merge two StringBuffer objects and separate them with a space
    public static StringBuffer mergeStringBuffers(StringBuffer strBuffer1, StringBuffer strBuffer2) {
        // Append a space and the second StringBuffer to the first StringBuffer
        strBuffer1.append(" ").append(strBuffer2);
        return strBuffer1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user for both StringBuffer objects
        System.out.print("Enter the first String: ");
        String input1 = scanner.nextLine();
        System.out.print("Enter the second String: ");
        String input2 = scanner.nextLine();

        // Initialize two StringBuffer objects with the user's input
        StringBuffer strBuffer1 = new StringBuffer(input1);
        StringBuffer strBuffer2 = new StringBuffer(input2);

        // Merge the StringBuffer objects
        StringBuffer mergedBuffer = mergeStringBuffers(strBuffer1, strBuffer2);

        // Print the resulting merged StringBuffer
        System.out.println("Merged StringBuffer: " + mergedBuffer);

        scanner.close();
    }
}
