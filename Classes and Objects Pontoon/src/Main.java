import java.util.Scanner;

public class Main {

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
        house = Pontoon.houseTotal(houseMin);
        cardsDrawn[0] = house;
        card1 = RandomNumber.getRandomNumber();
        cardsDrawn[1] = card1;
        card2 = RandomNumber.getRandomNumber();
        cardsDrawn[2] = card2;
        total = Pontoon.calcTotal(card1,card2);
        System.out.println("Your have drawn "+card1+" and "+card2);
        System.out.println("Do you wish to draw another card y/n");
        choice=kboard.nextLine();
        while (choice.equalsIgnoreCase("y"))
        {
            cardvalue= RandomNumber.getRandomNumber();
            cardsDrawn[cardCount++] = cardvalue;
            System.out.println("You have drawn a "+cardvalue);
            total= Pontoon.calcTotal(total,cardvalue);
            if (Pontoon.busted(total)==true)
            {
                System.out.println("Busted your cards total "+total+" which is over 21");
                // display cards drawn
                Pontoon.displayCards(cardsDrawn);
                break;
            }
            else
                System.out.println("Do you wish to draw another card y/n");
            choice=kboard.nextLine();
        }
        if (Pontoon.getResult(total,house)==true)
        {
            System.out.println("You have won with a total of "+total+" house had "+house);
            Pontoon.displayCards(cardsDrawn);
        }
        else
        {
            System.out.println("You have lost with "+total+" the house has "+house);
            Pontoon.displayCards(cardsDrawn);
        }
    }
}//end of main
