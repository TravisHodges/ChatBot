import java.util.Random;
import java.util.Scanner;
public class Jokes
{
    public static void jokes() throws InterruptedException
    {
        Scanner input = new Scanner(System.in);

        int userInput = 0;

        System.out.println("Press 1 for a random joke. ");
        userInput = input.nextInt();

        String[] jokes;

        jokes = new String[20];

        jokes[0] = "The rotation of earth really makes my day! ";
        jokes[1] = "Q: What is Jafar when he is next to you? \nA: Ja-near! ";
        jokes[2] = "My friend did not want to hang out because he had a pimple. I think that is a pore excuse! ";
        jokes[3] = "Q: What do you call a belt made out of watches? \nA: A waist of time! ";
        jokes[4] = "Q: What concert costs 45 cents? \nA: 50 Cent featuring Nickelback.";
        jokes[5] = "Q: Did you hear about the red ship and the blue ship that collided? \nA: All of the sailors were marooned! ";
        jokes[6] = "Q: How many kids with ADD does it take to change a lightbulb? \nA: Let's go ride bikes! ";
        jokes[7] = "Q: Why was the broom late for work? \nA: It overswept. ";
        jokes[8] = "My Grandpa had the heart of a lion... And a life time ban from the Zoo. ";
        jokes[9] = "Q: What do you call a nosy pepper? \nA: JALAPENO BUSINESS! ";
        jokes[10] = "Q: Why did the skeleton go to the party alone? \nA: He had no body to go with him! ";
        jokes[11] = "A man didn't like his haircut... but it started to grow on him. ";
        jokes[12] = "A drum and a cymbal fall off a cliff... ";
        jokes[13] = "Q: Why wouldn't the shrimp share his treasure? \nA: Because he was a little shellfish.";
        jokes[14] = "Q: Why do the French never perform “the wave” at a soccer game? \nA: Because, that’s a gesture reserved for use only in time of war. ";
        jokes[15] = "Q: What did the fish say when he ran into the wall? \nA: Dam. ";
        jokes[16] = "Did you hear about the fire at the circus?... It was in tents!";
        jokes[17] = "Q: Who does a pharaoh talk to when he's sad? \nA: His mummy. ";
        jokes[18] = "Q: Why couldn't Dracula's wife get to sleep? \nA: Because of his coffin.";
        jokes[19] = "Chuck Norris always wins Connect Four... with three moves. ";


        if (userInput == 1)
        {
            System.out.println("");
            System.out.println("Your Random Joke: ");
            System.out.println("");

            Random rand = new Random();
            int computerChoice = rand.nextInt(jokes.length);

            System.out.println(jokes[computerChoice]);
        }

        else if (userInput != 1)
        {
            System.out.println("");
            System.out.println("Have a good day anyway. ");

        }


    }
}

