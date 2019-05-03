import java.util.Random;
import java.util.Scanner;
public class RandomFacts
{
    public static void randfacts()
    {

        Scanner input = new Scanner(System.in);

        int userInput = 0;

        System.out.println("Press 1 for a random fact. ");
        userInput = input.nextInt();

        String[] facts;

        facts = new String[20];

        facts[0] = "If you were to roll a lung from a human body out flat it would be the size of a tennis court. ";
        facts[1] = "Women have a slightly higher average IQ than men. ";
        facts[2] = "You mostly breathe from only one nostril at a time! ";
        facts[3] = "A pound of potato chips costs 200 times more than a pound of potatoes. ";
        facts[4] = "10 of the tributaries flowing into the Amazon river are as big as the Mississippi river. ";
        facts[5] = "There are no penguins in the North Pole. ";
        facts[6] = "Pittsburgh is the only city where all major sports teams have the same colors: Black and gold. ";
        facts[7] = "Rats can't vomit, that's why rat poison works. ";
        facts[8] = "The venom of the king cobra is so deadly that just one gram of it can kill 150 people. ";
        facts[9] = "The chances of you dying on the way to get your lottery tickets is greater than your chances of winning. ";
        facts[10] = "'Vodka' is Russian for 'little water'. (This one is better if you imagine it in a Russian Accent) ";
        facts[11] = "The most popular first name in the world is Muhammad! ";
        facts[12] = "35,000 people in the U.S. will die from the flu annually. ";
        facts[13] = "Richard Nixon liked ketchup on his cottage cheese. ";
        facts[14] = "In Idaho, You may not fish on a camel's back. ";
        facts[15] = "In Ancient Greece, if a woman watched even one Olympic event, she was executed. (The olympics were a male only event, and athletes performed naked.) ";
        facts[16] = "Your hair grows faster in the morning than at any other time of the day. ";
        facts[17] = "Human teeth are almost as hard as rocks! ";
        facts[18] = "A dragonfly has a lifespan of 24 hours. ";
        facts[19] = "In the original version of Cinderella the slipper was made out of fur, not glass! ";

        if (userInput == 1)
        {
            System.out.println("");
            System.out.println("Your random fact: ");
            System.out.println("");

            Random rand = new Random();
            int computerChoice = rand.nextInt(facts.length);

            System.out.println(facts[computerChoice]);
        }

        else if (userInput != 1)
        {
            System.out.println("");
            System.out.println("Have a good day anyway. ");
        }

    }

}
