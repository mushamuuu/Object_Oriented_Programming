/**
 * @author Lowell Perez
 * @version 2.0
 * */

public class House extends Player{

    final int houseMin = 16;
    int houseTotal;

    /**
     * method used to call houseTotal method and store the return value to houseTotal
     * @return nothing
     * @param args unused
     * */
    public void drawCards()
    {
        houseTotal = houseTotal(houseMin);
    }

    /**
     * method used to generate a number greater than 16
     * @return int returns the sum of 2 generated numbers
     * @param houseMin first parameter to method houseTotal
     * */
    public int houseTotal(int houseMin)
    {
        int house=0;
        while (house < houseMin)
            house = calcTotal(RandomNumber.getRandomNumber(),RandomNumber.getRandomNumber());
        return(house);
    }//end of houseTotal

}
