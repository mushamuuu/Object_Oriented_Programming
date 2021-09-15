import java.util.Scanner;
public class Tutorial1d {
    public static int getRandomNumber()
    {
        //generate a random number
        return (int)(Math.random()*10 + 1);
    }
    public static int calcTotal(int card1,int card2)
    {
        return(card1+card2);
    }
    public static boolean getResult(int total,int house)
    {
        if (total>house && total<=21)
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
    public static int houseTotal(int x)
    {
        int house=0;
        while (house < x)
            house = calcTotal(getRandomNumber(),getRandomNumber());
        return(house);
    }
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
    }
    public static void main(String[] args)
    {
        Scanner kboard = new Scanner(System.in);
        final int houseMin = 16; //defines the minimum value of the house
        String choice;
        int cardsDrawn[] = new int[10];//maximum number of cards which can be drawn will be 7
        int cardvalue;
        int cardCount = 3; //counts number of cards
        int card1, card2;
        int house;
        int total;
        house = houseTotal(houseMin);
        cardsDrawn[0] = house;
        card1 = getRandomNumber();
        cardsDrawn[1] = card1;
        card2 = getRandomNumber();
        cardsDrawn[2] = card2;
        total = calcTotal(card1,card2);
        System.out.println("Your have drawn "+card1+" and "+card2);
        System.out.println("Do you wish to draw another card y/n");
        choice=kboard.nextLine();
        while (choice.equalsIgnoreCase("y"))
        {
            cardvalue=getRandomNumber();
            cardsDrawn[cardCount++] = cardvalue;
            System.out.println("You have drawn a "+cardvalue);
            total=calcTotal(total,cardvalue);
            if (busted(total)==true)
            {
                System.out.println("Busted your cards total "+total+" which is over 21");
                // display cards drawn
                displayCards(cardsDrawn);
                break;
            }
            else
                System.out.println("Do you wish to draw another card y/n");
            choice=kboard.nextLine();
        }
        if (getResult(total,house)==true)
        {
            System.out.println("You have won with a total of "+total+" house had "+house);
            displayCards(cardsDrawn);
        }
        else
        {
            System.out.println("You have lost with "+total+" the house has "+house);
            displayCards(cardsDrawn);
        }
    }
}
