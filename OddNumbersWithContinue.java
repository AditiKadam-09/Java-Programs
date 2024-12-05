//Prints all odd numbers from 1 to 20, using continue to skip even numbers.
public class OddNumbersWithContinue {

    public static void main(String[] args) {
        // Loop through numbers from 1 to 20
        for (int i = 1; i <= 20; i++) {
            // Skip the even numbers using continue
            if (i % 2 == 0) {
                continue;
            }
            // Print the odd numbers
            System.out.println(i);
        }
    }
}
