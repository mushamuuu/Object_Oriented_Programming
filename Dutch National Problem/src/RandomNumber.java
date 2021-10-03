/**
 * This class's sole purpose is to generate a random number from 1-3
 * @author  Lowell Perez
 * @version 1.0
 * @since   3-10-21
 */
public class RandomNumber {

    private int number;

    public int generateNumber()
    {
        number = (int) (Math.random() * 3);
        return number;
    }
}
