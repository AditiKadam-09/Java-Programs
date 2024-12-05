//Create a Java program using a while loop to calculate the sum of integers from 1 to 100.

public class SumOfIntegers {
    public static void main(String[] args) {
        int sum = 0; // Variable to hold the sum of integers
        int i = 1; // Starting point of the loop (1)

        // Use a while loop to calculate the sum of integers from 1 to 100
        while (i <= 100) {
            sum += i; // Add the current value of i to sum
            i++; // Increment i by 1
        }

        // Print the result
        System.out.println("The sum of integers from 1 to 100 is: " + sum);
    }
}
