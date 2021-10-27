public class ElectricBassGuitar extends StringedInstrument{
    public ElectricBassGuitar()
    {
        name = "Bass Guitar";
        numberOfStrings = 4;
    }
    public ElectricBassGuitar(int numberOfStrings)//constructor with param
    {
        name = "Bass Guitar";
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public void play() {
        System.out.println("An electric " + numberOfStrings + "-string " + name + " is booming!");
    }
}
