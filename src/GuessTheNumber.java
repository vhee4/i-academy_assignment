import java.security.SecureRandom;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        numberGuess();
    }

    public static int numberGuess() {
        SecureRandom random = new SecureRandom();
        int correctNumber =  1 + random.nextInt(1000);
        System.out.println(correctNumber);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the correct integer: ");
        int guessNumber =  scanner.nextInt();

        while (guessNumber != -1) {
            if (guessNumber == correctNumber){
                System.out.println("Congratulations, play again or press -1 to exit");
                correctNumber =  1 + random.nextInt(1000);
                System.out.println(correctNumber);
            }
            else if (guessNumber < correctNumber){
                System.out.println("Too Low Try Again");
            }
            else {
                System.out.println("Too high try again");
            }
            System.out.println("Enter an integer");
            guessNumber = scanner.nextInt();
        }
        return guessNumber;
    }
}
