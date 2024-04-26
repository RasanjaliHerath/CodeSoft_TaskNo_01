//CodeSoft
//TASK 1
//1. Generate a random number within a specified range, such as 1 to 100.
//2. Prompt the user to enter their guess for the generated number.
//3. Compare the user's guess with the generated number and provide feedback on whether the guess
//is correct, too high, or too low.
//4. Repeat steps 2 and 3 until the user guesses the correct number.
//Aadditional details as follows:
//5. Limit the number of attempts the user has to guess the number.
//6. Add the option for multiple rounds, allowing the user to play again.
//7. Display the user's score, which can be based on the number of attempts taken or rounds won.

import java.util.Random;
import java.util.Scanner;

public class NumberSleuth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int maxAttempts = 5; // Maximum number of attempts allowed
        int score = 0; // User's score

        boolean playAgain = true;
        while (playAgain) {
            // Generate random number
            int randomNumber = random.nextInt(100) + 1; // Range 1 to 100

            // Game loop for each round
            int attempts = 0;
            boolean guessedCorrectly = false;
            while (attempts < maxAttempts && !guessedCorrectly) {
                attempts++;

                System.out.println("Number Sleuth️‍♀️: Guess a number between 1 and 100 (Attempt " + attempts + " of " + maxAttempts + "):");
                int guess = scanner.nextInt();

                if (guess == randomNumber) {
                    guessedCorrectly = true;
                    score++; // Increase score for correct guess
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                } else if (guess < randomNumber) {
                    System.out.println("Your guess is too low. Try again!");
                } else {
                    System.out.println("Your guess is too high. Try again!");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("You ran out of attempts. The number was: " + randomNumber);
            }

            // Ask user if they want to play again
            System.out.println("Do you want to play another round of Number Sleuth️‍♀️? (yes/no)");
            String playAgainInput = scanner.next();
            playAgain = playAgainInput.equalsIgnoreCase("yes");
        }

        System.out.println("Thanks for playing Number Sleuth️‍♀️! Your final score is: " + score);
        scanner.close();
    }
}
