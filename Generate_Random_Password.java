//Generate Random Password: Generate a random password with letters and digits.

import java.util.Random;

public class Generate_Random_Password {
    public static void main(String[] args) {
        Random random = new Random();

        // Define the set of characters to use for the password
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";

        // Specify the length of the password
        int passwordLength = 8;

        // Initialize a StringBuffer to store the generated password
        StringBuffer password = new StringBuffer();

        // Loop to generate each character of the password
        for (int i = 0; i < passwordLength; i++) {
            // Generate a random index to pick a character from 'characters'
            int index = random.nextInt(characters.length());

            // Append the character at the random index to the password
            password.append(characters.charAt(index));
        }

        // Print the generated password
        System.out.println("Generated password: " + password);
    }
}

// Output:
// Generated password: vgERf9TI