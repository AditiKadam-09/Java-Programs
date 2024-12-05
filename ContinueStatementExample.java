//Write a Java program that demonstrates the use of the continue statement in a loop.

public class ContinueStatementExample {
    public static void main(String[] args) {
        // Loop through numbers 1 to 10
        for (int i = 1; i <= 10; i++) {
            // Skip the number 5
            if (i == 5) {
                continue; // Skips the current iteration and continues to the next iteration
            }
            System.out.println(i); // Print the number
        }
    }
}
