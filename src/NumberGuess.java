import java.util.Random;
import java.util.Scanner;

public class NumberGuess
{
    public static void numGuess(String[] args)
    {
        System.out.println("Welcome to number guess, Morgan will choose a number 0-1000. How many tries will it take you to guess it? ");

        Scanner input = new Scanner(System.in);

        int userInput = 0;

        Random rand = new Random();
        int computerChoice = rand.nextInt(1000);

        int guessCount = 1;

        while (userInput != computerChoice) {

            System.out.println("Choose a number 1-1000. (Morgan's number is already chosen) ");
            userInput = input.nextInt();

            if (userInput == computerChoice)
            {
                System.out.println("You Win !!! ");
                System.out.println("Final Guess Count: " + guessCount+"\n" );
            }

            else if (userInput > computerChoice)
            {
                System.out.println("Your guess is too high, guess lower. ");
                System.out.println("Guess Count: " + guessCount +"\n");
            }

            else if (userInput < computerChoice)
            {
                System.out.println("Your guess is too low, guess higher. ");
                System.out.println("Guess Count: " + guessCount+"\n");
            }

            else if ((userInput > 1000) || (userInput < 1))
            {
                System.out.println("STOP, THAT'S ILLEGAL!!! ");
            }

            guessCount ++;
        }
    }
}
