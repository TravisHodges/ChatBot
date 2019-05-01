import java.util.Scanner;
import java.util.Random;
public class rttta
{
    public static void rttta() throws InterruptedException
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Well, I have a couple different ideas in mind:");
        System.out.println("The weather" +
                            "\nCurrent events" +
                            "\nFood" +
                            "\nLet's play a game");
        String userChoice;
        userChoice = input.nextLine();
        if (userChoice.equalsIgnoreCase("The weather"))
        {
            System.out.println("How is the weather looking today? The weather is:" +
                    "\nrainy" +
                    "\nsunny");
            userChoice = input.nextLine();
            if (userChoice.equalsIgnoreCase("The weather is rainy"))
            {
                System.out.println("Oh dear, that's always a 50/50. Rain is cool and all, but I cannot stand in it " +
                        "because I am a computer.");
            }
            else if (userChoice.equalsIgnoreCase("The weather is sunny"))
            {
                System.out.println("Sunny is always nice! It's nicer though that you're inside on such a beautiful day " +
                        "talking to me!");
            }
            else if (userChoice.equalsIgnoreCase("The weather is cloudy"))
            {
                System.out.println("I sure hope it doesn't rain! My circuits would get wet!");
            }
            else if (userChoice.equalsIgnoreCase("The weather is foggy"))
            {
                System.out.println("Don't get lost out there! Maybe Akira Yamaoka can be your guide, he he.");
            }
        }
        else if (userChoice.equalsIgnoreCase("Let's play a game"))
        {
            playGame();
        }
    }

    private static void playGame()
    {
        games.games();
    }
}
