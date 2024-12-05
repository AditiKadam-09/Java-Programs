public class Insert_StringBuffer {
    public static void main(String[] args) {
        // Initialize StringBuffer with "Hello World"
        StringBuffer str = new StringBuffer("Hello World");

        System.out.println("Original String: " + str);

        // Insert "Beautiful " at index 6
        str.insert(6, "Beautiful ");

        // Print the modified string
        System.out.println("Modified String: " + str);
    }
}
