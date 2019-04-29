import java.util.ArrayList;
import java.util.Random;
public class Greetings
{
public static void greetings()
{

    for (int j = 0; j < 1; j++)
    {
//       ArrayList<String> Greetings = new ArrayList<String>();
       Random rand = new Random();
       int n = rand.nextInt(6);
       if (n == 1)
       {
        System.out.println("Hello!");
       }
       else if (n == 2)
       {
        System.out.println("Heyyyyy ;) (Is that how humans attract mates? Weird!)");
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
               System.out.println("Good Morning, Evening, Afternoon, or whatever your current time is!");
           }
    }

}
    public static void displayGreetings(ArrayList<String> Greetings)
    {
    System.out.println(Greetings);
    }
}
