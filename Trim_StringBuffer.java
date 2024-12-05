public class Trim_StringBuffer {

    // Method to trim whitespace from both ends of a StringBuffer
    public static StringBuffer trimStringBuffer(StringBuffer strBuffer) {
        // Use the StringBuffer's toString() method to convert to String and trim it
        String trimmedString = strBuffer.toString().trim();

        // Return a new StringBuffer with the trimmed string
        return new StringBuffer(trimmedString);
    }

    public static void main(String[] args) {
        // Initialize StringBuffer with extra spaces
        StringBuffer strBuffer = new StringBuffer(" Hello World ");

        // Trim the whitespace from both ends
        StringBuffer trimmedBuffer = trimStringBuffer(strBuffer);

        // Print the trimmed StringBuffer
        System.out.println("Trimmed String: \"" + trimmedBuffer + "\"");
    }
}
