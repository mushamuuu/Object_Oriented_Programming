public class SinkADotCom {
    int[] locationCells;
    int numOfHits = 0;

    public void setLocationCells(int[] location) {
        locationCells = location;
    }

    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);//parsing the user input from string to int
        String result = "miss";
        // out of the loop
        for (int cell : locationCells) {//for each cell in locationCells array
            if (guess == cell) {//if user guess is equal to a cell in locationCells array
                result = "hit";
                numOfHits++;
                break;
            }
        }
        if (numOfHits ==
                locationCells.length) {
            result = "kill";
        }
        System.out.println(result);
        return result;
    } // close method
}
