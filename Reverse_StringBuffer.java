public class Reverse_StringBuffer {
    public static void main(String[] args) {
        // Initialize StringBuffer with "Java Programming"
        StringBuffer str = new StringBuffer("Java Programming");

        System.out.println("Original String: " + str);

        // Reverse the contents of the StringBuffer
        str.reverse();

        // Print the reversed string
        System.out.println("Reversed String: " + str);
    }
}
