//Create a Multiplication Quiz: Quiz the user on multiplication facts.

import java.util.Random;
import java.util.Scanner;

public class Multiplication_Quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object for user input
        Random random = new Random(); // Create a Random object to generate random numbers
        int score = 0; // Variable to keep track of the user's score
        int numberOfQuestions = 5; // Number of questions in the quiz

        // Loop through the number of questions
        for (int i = 0; i < numberOfQuestions; i++) {
            // Generate two random numbers between 1 and 10
            int num1 = random.nextInt(10) + 1; // First random number
            int num2 = random.nextInt(10) + 1; // Second random number

            // Calculate the correct answer
            int correctAnswer = num1 * num2;

            // Prompt the user for their answer
            System.out.print("Question " + (i + 1) + ": What is " + num1 + " x " + num2 + "? ");
            int userAnswer = input.nextInt(); // Read the user's answer

            // Check if the user's answer is correct
            if (userAnswer == correctAnswer) {
                System.out.println("Correct!"); // Notify the user of a correct answer
                score++; // Increment the score for a correct answer
            } else {
                System.out.println("Incorrect! The correct answer is " + correctAnswer + "."); // Notify the user of the
                                                                                               // correct answer
            }
        }

        // Display the user's total score
        System.out.println("Quiz Over! Your score is: " + score + " out of " + numberOfQuestions);

        input.close();
    }
}

// Output:
/*
 * Question 1: What is 8 x 9? 72
 * Correct!
 * Question 2: What is 4 x 10? 40
 * Correct!
 * Question 3: What is 4 x 4? 16
 * Correct!
 * Question 4: What is 3 x 9? 27
 * Correct!
 * Question 5: What is 6 x 1? 6
 * Correct!
 * Quiz Over! Your score is: 5 out of 5
 */