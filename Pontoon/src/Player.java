/**
 * @author Lowell Perez
 * @version 2.0
 * */
import java.util.*;

public class Player {

    private int card1, card2;
    int[] cardsDrawn = new int[10];//maximum number of cards which can be drawn will be 7
    private int cardCount = 3;
    private String choice;
    private int cardValue;
    int total;

    /**
     *method used to initialise first 2 cards and add together
     * @return nothing
     * @param args unused
     * */
    public void drawInitialCards()
    {
        card1 = RandomNumber.getRandomNumber();
        cardsDrawn[1] = card1;
        card2 = RandomNumber.getRandomNumber();
        cardsDrawn[2] = card2;
        total = calcTotal(card1, card2);
    }
    /**
     * method used to display initialised cards
     * @return nothing
     * @param args unused
     * */
    public void displayInitialCards()
    {
        System.out.println("Your have drawn "+card1+" and "+card2);
        System.out.println("Your total card value is " + total);

    }

    /**
     * method used to sum initialised cards
     * @return int return sums of card1 and 2
     * @param1 card1 first parameter to calTotal method
     * @param2 card2 second parameter to calTotal method
     * */

    public static int calcTotal(int card1,int card2)
    {
        return(card1+card2);
    }

    /**
     * method used to ask user to hit or stick
     * @return nothing
     * @param args unused
     * */

    public void hitOrStick()
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Do you wish to draw another card y/n: ");
        choice = kb.nextLine();
        hit();
    }

    /**
     * method used to add a card to player and check if player is busted or not
     * @return nothing
     * @param args unused
     * */

    public void hit() {

        while (choice.equalsIgnoreCase("y")) {
            cardValue = RandomNumber.getRandomNumber();
            cardsDrawn[cardCount++] = cardValue;
            System.out.println("You have drawn a " + cardValue);

            System.out.println("Your total card value is " + (total = calcTotal(total, cardValue)));

            if (Game.busted(total) == true) {

                System.out.println("Busted! Your cards total " + total + " which is over 21.");
                // display cards drawn
                Game.displayCards(cardsDrawn);
                break;
            } else
                hitOrStick();
        }
    }
}
