import java.util.Scanner;
import java.util.ArrayList;
public class Main
{

    public static void main(String[] args) throws InterruptedException {
        boolean running = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! I am Morgan, and I'm a ChatBot! I'll talk to you whenever you boot up this program, and I have " +
                "a bunch of stuff to say!");
        System.out.println("Because of the 'restrictions' there are keywords to engage in a conversation with me. These keywords are:");
        System.out.println("Hi, Tell me something, What do you want to talk about? (What do you want to talk about is a question for me, not you).");
        String userChoice;
        while (running == true) {
            userChoice = input.nextLine();

            if (userChoice.equalsIgnoreCase("Hi")) {
                Greetings Greetings = new Greetings();
                Greetings.greetings();
            } else if (userChoice.equalsIgnoreCase("Tell me something")) {
                System.out.println("I have 3 topics to share, choose one!");
                int userChoiceint;
                userChoiceint = input.nextInt();
                if (userChoiceint == 1) {
                    Compliments.compliments();
                } else if (userChoiceint == 2) {
                    Jokes.jokes();
                } else if (userChoiceint == 3) {
                    RandomFacts.randfacts();
                }
            } else if (userChoice.equalsIgnoreCase("What do you want to talk about?") ||
                    userChoice.equalsIgnoreCase("What do you want to talk about")) {
                rttta.rttta();
            }
            if (userChoice.equalsIgnoreCase("Goodbye") || userChoice.equalsIgnoreCase("goodbye!"))
                {
                System.out.println("Until next time!");
                break;
                }
        }
    }
}

