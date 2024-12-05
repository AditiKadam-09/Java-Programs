public class StringBuffer_To_String {

    // Method to convert StringBuffer to String
    public static String convertToString(StringBuffer strBuffer) {
        // Convert StringBuffer to String using the toString() method
        return strBuffer.toString();
    }

    public static void main(String[] args) {
        // Initialize StringBuffer with "Hello World"
        StringBuffer strBuffer = new StringBuffer("Hello World");

        // Convert StringBuffer to String using the method
        String result = convertToString(strBuffer);

        // Print the resulting string
        System.out.println("Converted String: " + result);
    }
}
