//Simulate a Coin Toss: Write a program that simulates flipping a coin.

public class Simulate_a_Coin_Toss {
    public static void main(String[] args) {
        // Generate a random number between 0 and 1
        int toss = (int) (Math.random() * 2);

        // Display the result of the coin toss based on the random number
        if (toss == 0) {
            System.out.println("Heads"); // If 0, print "Heads"
        } else {
            System.out.println("Tails"); // If 1, print "Tails"
        }
    }
}

// Output:
// Heads