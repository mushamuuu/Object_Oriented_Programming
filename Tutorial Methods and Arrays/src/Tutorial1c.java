import java.util.Scanner;

public class Tutorial1c {
    public static int getRandomNumber()
    {
        return (int)((Math.random() * 10) + 1);
    }
    public static int calcTotal(int card1, int card2)
    {
        return (card1 + card2);
    }
    public static boolean getResult(int total, int house)
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
    //if house is less than the minimum value 16 the method keeps adding 2 random numbers until house is greater than 16
    public static int houseTotal(int x)
    {
        int house=0;
        while (house < x)
            house = calcTotal(getRandomNumber(),getRandomNumber());
        return(house);
    }

    public static void main(String[] args) {
        Scanner kboard = new Scanner(System.in);
        final int houseMin = 16; //defines the minimum value of the house
        String choice;
        int card1;
        int card2;
        int newCard;
        int house;
        int total;

        house = houseTotal(houseMin);
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
        if (getResult(total,house) == true) {
            System.out.println("Total card value: " + total);
            System.out.println("House's total card value: " + house);
            System.out.println("You won!");
        } else {
            System.out.println("Total card value: " + total);
            System.out.println("House's total card value: " + house);
            System.out.println("You lost!");
        }
    }
}
