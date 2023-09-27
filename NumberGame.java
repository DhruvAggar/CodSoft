import java.util.Scanner;
import java.util.Random;

public class NumberGame {

    public static void main(String[] args) {
        number();

    }

    public static void number() {

        Scanner sc = new Scanner(System.in);
        Random rc = new Random();
        int a = rc.nextInt(101);
        boolean choice;
        boolean guessednumber = false;
        int totalGuesses = 0;
        while (totalGuesses <= 6) {
            System.out.println("Enter the Guessed Number");
            int guess = sc.nextInt();

            if (guess == a) {
                System.out.println("Congrats! you guessed the correct number");
                System.out.println("You would like to play another round");
                System.out.println("If you want to play another round type true to yes or false to no");
                guessednumber = true;
                choice = sc.nextBoolean();
                if (choice) {
                    number();
                } else
                    break;
            } else if (guess < a) {
                System.out.println("You've guesses smaller number than the Guessed Number, Try again");
            } else {
                System.out.println("You've guesses Higher number than the Guessed Number, Try again");
            }
        }
        if (guessednumber) {
            System.out.println("OOPS!! You've used all attempts");
            System.out.println("The correct number is " + a);

        }
    }
}
