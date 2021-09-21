public class Pontoon {

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
    }//end of getResult
    public static boolean busted(int total)
    {
        if (total>21)
            return(true);
        else
            return(false);
    }//end of busted
    public static int houseTotal(int x)
    {

        int house=0;
        while (house < x)
            house = calcTotal(RandomNumber.getRandomNumber(), RandomNumber.getRandomNumber());
        return(house);
    }//end of houseTotal

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

}//end of Pontoon
