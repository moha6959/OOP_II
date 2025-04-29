import java.util.Scanner;

public class RandomGame {
    public static void main(String[] args) {
        int secretNumber = 4;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Guess a number between 1 and 5: ");
        int guess = scanner.nextInt();

        if (guess == secretNumber) {
            System.out.println("Correct! You guessed the number.");
        } else {
            System.out.println("Wrong! The correct number was " + secretNumber);
        }

        scanner.close();
    }
}

