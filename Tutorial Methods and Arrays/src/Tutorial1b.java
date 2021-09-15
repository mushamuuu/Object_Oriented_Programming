import java.util.Scanner;

public class Tutorial1b {
    public static int getRandomNumber()
    {
        return (int)((Math.random() * 10) + 1);
    }
    public static int calcTotal(int card1, int card2)
    {
        return (card1 + card2);
    }
    public static boolean getResult(int total)
    {
        if (total>18 && total<=21)
            return(true);
        else
            return(false);
    }
    public static boolean busted(int total)
    {
        if (total>21)
            return(true);
        else
            return(false);
    }
    public static void main(String[] args) {
        Scanner kboard = new Scanner(System.in);
        String choice;
        int card1;
        int card2;
        int newCard;
        int total;

        card1 = getRandomNumber();
        card2 = getRandomNumber();
        total = calcTotal(card1, card2);
        System.out.println("First card: " + card1);
        System.out.println("Second card: " + card2);
        System.out.println("Total card value: " + total);
        System.out.print("Draw another card? (y/n): ");
        choice = kboard.nextLine();
        while (choice.equalsIgnoreCase("y")) {
            newCard = getRandomNumber();
            System.out.println("new Card: " + newCard);
            total = calcTotal(total, newCard);
            System.out.println("Total card value: " + total);
            if (busted(total) == true) {
                System.out.println("Busted!");
                System.out.println("Your cards' total value is over 21.");
                break;
            } else {
                System.out.println("Draw another card? (y/n): ");
                choice = kboard.nextLine();
            }
        }
        if (getResult(total) == true) {
            System.out.println("Total card value: " + total);
            System.out.println("You won!");
        } else {
            System.out.println("Total card value: " + total);
            System.out.println("You lost!");
        }
    }
}
