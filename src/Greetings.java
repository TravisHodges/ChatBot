import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Greetings
{
public static void main()
{
    Scanner input = new Scanner(System.in);
    System.out.println();

    ArrayList<String> Greetings = new ArrayList<String>();
    for (int j = 0; j < 6; j++)
    {
       Random rand = new Random();
       int n = rand.nextInt(6);
       n += 1;
       if (n == 1)
       {
        System.out.println("Hello!");
       }
       else if (n == 2)
       {
        System.out.println("Heyyyyy ;) (Is that how humans attract mates? Weird!");
       }
       else if (n == 3)
       {
        System.out.println("Hiya!");
       }
       else if (n == 4)
       {
        System.out.println("Hi.");
       }
       else if (n == 5)
       {
        System.out.println("Hey.");
       }
       else if (n == 6)
       {
        System.out.println("Wassup dawg?");
       }
       else
           {
               System.out.println("That isn't one of the programmed words, but I'll acknowledge that you spoke to me. :)");
           }
    }

}
    public static void displayGreetings(ArrayList<String> Greetings)
    {
    System.out.println(Greetings);
    }
}
