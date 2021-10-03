public class RandomNumber {

    private int number;

    public int generateNumber()
    {
        number = (int) (Math.random() * 3);
        return number;
    }
}
