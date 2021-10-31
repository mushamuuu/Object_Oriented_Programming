/**
 * @author Lowell Perez
 * @version 2.0
 * */


public class RandomNumber {
    /**
     * method used to sum initialised cards
     * @return int return sums of card1 and 2
     * @param1 card1 first parameter to calTotal method
     * @param2 card2 second parameter to calTotal method
     * */
    public static int getRandomNumber()
    {
        //generate a random number
        return (int)(Math.random()*10 + 1);
    }//end of getRandomNumber()
}// end of RandomNumber