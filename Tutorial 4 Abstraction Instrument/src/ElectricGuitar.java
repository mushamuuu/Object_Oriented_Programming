public class ElectricGuitar extends StringedInstrument{
    public ElectricGuitar()//constructor
    {
        name = "Guitar";
        numberOfStrings = 6;
    }
    public ElectricGuitar(int gNumberOfStrings)//constructor with param
    {
        name = "Guitar";
        numberOfStrings = gNumberOfStrings;
    }

    @Override
    public void play() {
        System.out.println("An electric " + numberOfStrings + "-string " + name + " is rocking!");
    }
}
