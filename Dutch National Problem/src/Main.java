import java.util.*;

public class Main {
    public static void main(String[] args) {
        RandomNumber r = new RandomNumber();

        ArrayList<Integer> numbersArray = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            numbersArray.add(r.generateNumber());
        }
        System.out.println("Generated numbers: " + numbersArray);
        Collections.sort(numbersArray);
        System.out.println("Generated numbers (sorted): " + numbersArray);

    }
}
