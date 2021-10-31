
/**
 * @author Lowell Perez
 * @version 2.0
 * */

public class Game {
    PlayerOne p1 = new PlayerOne();
    House house = new House();

    /**
     * method used to call other methods
     * @return nothing
     * @param args unused
     * */
    Game()
    {
        p1.drawInitialCards();
        p1.displayInitialCards();
        house.drawCards();
        p1.hitOrStick();
        displayResult();
    }

    /**
     * method used to display all cards at the end
     * @return nothing
     * @param args unused
     * */
    public static void displayCards(int cardsDrawn[])
    {
        System.out.print("Cards drawn: ");
        for (int x = 1;x<10;x++)
        {
            if (cardsDrawn[x]!=0)
                if (x==1)
                    System.out.print(cardsDrawn[x]);
                else
                    System.out.print(","+cardsDrawn[x]);
        }
        System.out.println();
    }//end of displayCards

    /**
     * method used check if player is busted
     * @return boolean true
     * @return boolean false
     * @param total first parameter to busted method
     * */
    public static boolean busted(int total)
    {
        if (total>21)
            return(true);
        else
            return(false);
    }//end of busted

    /**
     * method used to compare player total and house total
     * @return boolean true
     * @return boolean false
     * @param total first parameter to busted method
     * @param house second parameter to busted method
     * */
    public static boolean getResult(int total,int house)
    {
        if (total>house && total<=21)
            return(true);
        else
            return(false);
    }//end of getResult

    /**
     * method used to display game result
     * @return nothing
     * @param args unused
     * */
    public void displayResult()
    {

        if (getResult(p1.total,house.houseTotal)==true)
        {
            System.out.println("You have won with a total of "+p1.total+" house had "+house.houseTotal);
            displayCards(p1.cardsDrawn);
        }
        else
        {
            System.out.println("You have lost with "+p1.total+" the house has "+house.houseTotal);
            displayCards(p1.cardsDrawn);
        }
    }


}
