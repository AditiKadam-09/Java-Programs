public class Replace_Substring_In_StringBuffer {
    public static void main(String[] args) {
        // Initialize StringBuffer with "I love Java programming"
        StringBuffer str = new StringBuffer("I love Java programming");

        System.out.println("Original String: " + str);

        // Replace "Java" with "Python"
        int startIndex = str.indexOf("Java");
        if (startIndex != -1) {
            str.replace(startIndex, startIndex + "Java".length(), "Python");
        }

        // Print the modified string
        System.out.println("Modified String: " + str);
    }
}
