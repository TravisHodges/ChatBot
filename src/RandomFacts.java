import java.util.Random;
import java.util.Scanner;
public class RandomFacts
{
    public static void randfacts() throws InterruptedException
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



        int x = 1;

        if (userInput == 1){
            System.out.println("");
            System.out.println("Your Random Fact: ");
            System.out.println("");

            while (x <= 1) {
                Random rand = new Random();
                int computerChoice = rand.nextInt(20);

                if (computerChoice == 0) {
                    System.out.println(facts[0]);
                } else if (computerChoice == 1) {
                    System.out.println(facts[1]);
                } else if (computerChoice == 2) {
                    System.out.println(facts[2]);
                } else if (computerChoice == 3) {
                    System.out.println(facts[3]);
                } else if (computerChoice == 4) {
                    System.out.println(facts[4]);
                } else if (computerChoice == 5) {
                    System.out.println(facts[5]);
                } else if (computerChoice == 6) {
                    System.out.println(facts[6]);
                } else if (computerChoice == 7) {
                    System.out.println(facts[7]);
                } else if (computerChoice == 8) {
                    System.out.println(facts[8]);
                } else if (computerChoice == 9) {
                    System.out.println(facts[9]);
                } else if (computerChoice == 10) {
                    System.out.println(facts[10]);
                } else if (computerChoice == 11) {
                    System.out.println(facts[11]);
                } else if (computerChoice == 12) {
                    System.out.println(facts[12]);
                } else if (computerChoice == 13) {
                    System.out.println(facts[13]);
                } else if (computerChoice == 14) {
                    System.out.println(facts[14]);
                } else if (computerChoice == 15) {
                    System.out.println(facts[15]);
                } else if (computerChoice == 16) {
                    System.out.println(facts[16]);
                } else if (computerChoice == 17) {
                    System.out.println(facts[17]);
                } else if (computerChoice == 18) {
                    System.out.println(facts[18]);
                } else if (computerChoice == 19) {
                    System.out.println(facts[19]);
                }

                x++;
            }
        }
        else if (userInput != 1)
        {
            System.out.println("");
            System.out.println("Have a good day anyway. ");
        }
    }

}
