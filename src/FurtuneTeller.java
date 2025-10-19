import java.util.Random;
import java.util.Scanner;

public class FurtuneTeller {
    public static void main(String[] args){
        System.out.println("Lets play a guessing game.");
        System.out.println("Pick a number between 1 and 10.");

        Random rand = new Random();
        int num = rand.nextInt(10) + 1; //generates a num between 1-10

        boolean game = true;
        int guess;

        while(game) {
            Scanner input = new Scanner (System.in);
            guess = input.nextInt();

            if (guess > num) {
                System.out.println("You guess too high!");
                System.out.print("Guess again: ");
            } else if(guess < num) {
                System.out.println("You guess too low!");
                System.out.print("Guess again: ");
            } else {
                System.out.println("congratulations you won!\nThe number was " + num);
            }
        }

    }
}
