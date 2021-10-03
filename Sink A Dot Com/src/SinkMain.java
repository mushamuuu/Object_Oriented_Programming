public class SinkMain {
    public static void main (String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        SinkADotCom theDotCom = new SinkADotCom();
        int randomNum = (int) (Math.random() * 5);//generates a random number from 1-5

        int[] locations = {randomNum, randomNum+1, randomNum+2};//stores the values of randomNum, randomNum + 1 and randomNum + 2 to locations array
        theDotCom.setLocationCells(locations);//calls the setLocationCells method while passing the locations variable
        boolean isAlive = true;
        while(isAlive) {
            String guess = helper.getUserInput("enter a number: ");
            String result = theDotCom.checkYourself(guess);//calling the checkYourself method while passing the guess variable
            numOfGuesses++;
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            } // close if
        } // close while
    }
}
