public class StringBuffer_Capacity {
    public static void main(String[] args) {
        // Create a StringBuffer with an initial capacity of 16 (default)
        StringBuffer str = new StringBuffer();

        // Print the initial capacity
        System.out.println("Initial Capacity: " + str.capacity());

        // Append characters to exceed the initial capacity
        // Append enough characters to exceed the default capacity (16)
        for (int i = 0; i < 20; i++) {
            str.append("a");
        }

        // Print the new capacity after appending characters
        System.out.println("New Capacity after appending characters: " + str.capacity());
    }
}