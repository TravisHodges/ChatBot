import java.util.Scanner;
public class games
{
    public static void games()
    {
        Scanner input = new Scanner(System.in);
        int rock = 1;
        int paper = 2;
        int scissors = 3;
        int pchoice;
        String result;
        int gameGuess;
        String computerSecret;
        System.out.println("Welcome to the Rock Paper Scissors game!");
        System.out.println("We all know how to play this age old game, so no need for rule explanation!");
        System.out.println("Select your means of battle, whether it be Rock (1), Paper (2), or Scissors (3).");
        pchoice = input.nextInt();
        gameGuess = (int) (Math.random() * 3 + 1);

        if(pchoice == rock && gameGuess == paper) {
            result = "You lose! Better luck next time friend.";
        }
        else if(pchoice == rock && gameGuess == scissors) {
            result = "You win! Good job, I want a rematch later.";
        }
        else if(pchoice == rock && gameGuess == rock)
        {
            result = "We tied, nice one. Neither of us win today.";
        }
        else if(pchoice == paper && gameGuess == rock)
        {
            result = "You win! Good job, I want a rematch later.";
        }
        else if(pchoice == paper && gameGuess == paper)
        {
            result = "We tied, nice one. Neither of us win today.";
        }
        else if(pchoice == paper && gameGuess == scissors)
        {
            result = "You lose! Better luck next time friend.";
        }
        else if(pchoice == scissors && gameGuess == rock)
        {
            result = "You lose! Better luck next time friend.";
        }
        else if(pchoice == scissors && gameGuess == paper)
        {
            result = "You win! Good job, I want a rematch later.";
        }
        else if(pchoice == scissors && gameGuess == scissors)
        {
            result = "We tied, nice one. Neither of us win today.";
        }
        else
            result = "That isn't a guess, automatic loss.";
        displayMessage(result);
    }
    public static void displayMessage(String result)
    {
        System.out.println(result);
    }
    }

