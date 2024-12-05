public class VowelCountInStringBuffer {

    // Method to count the number of vowels in a StringBuffer
    public static int countVowels(StringBuffer strBuffer) {
        int vowelCount = 0;

        // Convert the StringBuffer to a String to easily iterate over the characters
        String str = strBuffer.toString();

        // Convert the string to lowercase for easier comparison
        str = str.toLowerCase();

        // Iterate through the string and check for vowels
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        return vowelCount;
    }

    public static void main(String[] args) {
        // Initialize StringBuffer with "Hello World"
        StringBuffer strBuffer = new StringBuffer("Hello World");

        // Count the number of vowels in the StringBuffer
        int vowels = countVowels(strBuffer);

        // Print the number of vowels
        System.out.println("Number of vowels: " + vowels);
    }
}
