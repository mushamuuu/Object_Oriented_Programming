import java.util.Scanner;

public class Tutorial1a {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String choice;
        int card1;
        int card2;
        int newCard;
        int total;

        card1 = (int)((Math.random()* 11)+1);
        card2 = (int)((Math.random()* 11)+1);

        System.out.println("First Card = " + card1);
        System.out.println("Second Card = " + card2);
        total = card1 + card2;

        System.out.println("Total card = " + total);

        System.out.print("Draw another card?: ");
        choice = keyboard.next();

        System.out.println("You entered " + choice);

        while (choice.equalsIgnoreCase("y"))
        {
            newCard = (int)((Math.random()* 11)+1);
            System.out.println("New Card = " + newCard);

            total = total + newCard;
            System.out.println("Total card = " + total);

            System.out.print("Draw another card?: ");
            choice = keyboard.next();

            System.out.println("You entered " + choice);
        }
        if (total >19 & total <=21)
        {
            System.out.println("you won!");
        }
        else
        {
            System.out.println("you lost!");
        }
    }
}
