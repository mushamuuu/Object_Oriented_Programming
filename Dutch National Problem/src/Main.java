/**
 This program generates a random number from 1-3 and append to an array 10 times and display the unsorted and sorted results.
 @author  Lowell Perez
  * @version 1.0
 * @since   3-10-21
 */
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
