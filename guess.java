
import java.util.Random;
import java.util.Scanner;

public class guess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minRange = 1;
        int maxRange = 100;
        int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
        int attempts = 0;
        int guess;

        System.out.println("Welcome to Guess the Number Game!");
        System.out.println("I have chosen a number between 1 and 100. Try to guess it.");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number.");
                System.out.println("It took you " + attempts + " attempts to win.");
            }
        } while (guess != randomNumber);

        scanner.close();
    }
}
