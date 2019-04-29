import java.util.Scanner;
import java.util.Random;
public class rttta
{
    public static void rttta()
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
            System.out.println("How is the weather looking today?");
            userChoice = input.nextLine();
            if (userChoice.equalsIgnoreCase("The weather is rainy"))
            {
                System.out.println("Oh dear, that's always a 50/50. Rain is cool and all, but I cannot stand in it " +
                        "because I am a computer.");
            }
            else if (userChoice.equalsIgnoreCase("Current events"))
            {
                System.out.println("What are the current events? Anything new with computers?");

            }
        } else if (userChoice.equalsIgnoreCase("Let's play a game")) {
            playGame();
        }
    }

    private static void playGame() {

    }
}
