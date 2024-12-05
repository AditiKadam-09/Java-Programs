//Write a Java program that uses a for loop to print the first 10 numbers of the Fibonacci sequence.

public class FibonacciSequence {
    public static void main(String[] args) {
        int n = 10; // Number of Fibonacci numbers to print
        int first = 0, second = 1; // First two Fibonacci numbers

        System.out.println("First 10 numbers of the Fibonacci sequence:");

        // Print the Fibonacci sequence using a for loop
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");

            // Update the values of first and second for the next Fibonacci number
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
