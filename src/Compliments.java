import java.util.Scanner;
public class Compliments
{
    public static void compliments() throws InterruptedException
    {
        Scanner input = new Scanner(System.in);

        String name;

        System.out.println("What is your name? >>");
        name = input.nextLine();

        System.out.println("What a beautiful name " + name + ".");
        System.out.println("");
        System.out.println("Press 1 to get complimented !!! ");
        int next = input.nextInt();

        if (next == 1)
        {
            System.out.println(name + ", you are fabulous.");
            System.out.println(name + ", you are one of the most talented people I know.");
            System.out.println(name + ", lots of people love you.");
            System.out.println("You are smart, intelligent and beautiful " + name + ".");
            System.out.println(name + ",I enjoy working with you.");
        }

        else if (next != 1)
        {
            System.out.println("");
            System.out.println("Have a good day anyway. ");
        }

    }

}
