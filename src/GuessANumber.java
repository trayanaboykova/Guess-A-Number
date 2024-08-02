import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    public static void main(String[] args) {
        Random random = new Random();
        int computerNumber = random.nextInt(100) + 1;
        boolean hasGuessed = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Guess A Number game!");
        System.out.println("Guess a number between 1 and 100:");

        while (!hasGuessed) {
            String input = scanner.nextLine();
            boolean isValid = true;

            // Check if input is a valid number
            for (int i = 0; i < input.length(); i++) {
                if (!Character.isDigit(input.charAt(i))) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                int playerNumber = Integer.parseInt(input);

                if (playerNumber == computerNumber) {
                    System.out.println("You guessed it!");
                    hasGuessed = true;
                } else if (playerNumber < computerNumber) {
                    System.out.println("Too low");
                } else {
                    System.out.println("Too high");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number between 1 and 100.");
            }
        }

        scanner.close();
    }
}
