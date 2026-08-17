import java.util.Scanner;
import java.util.Random;
public class NumberGuessing {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random r = new Random();

        int randomNum = r.nextInt(10) + 1;
        int attempts = 0;

        while (true) {
            System.out.print("Guess a number between 1 to 10: ");
            int guess = Integer.valueOf(scan.nextLine());
            attempts++;

            if (guess - 1 == randomNum || guess + 1 == randomNum) {
                System.out.println("You are very close!");
            } else if (guess < randomNum) {
                System.out.println("Too low!");
            } else if (guess > randomNum) {
                System.out.println("Too high!");
            } else {
                System.out.println("You guessed it right!");
                break;
            }
        }
        if (attempts == 1) {
            System.out.println("It only took you one guess to get it right!");
        } else {
            System.out.println("Your attempts: " + attempts);
        }
    }
}