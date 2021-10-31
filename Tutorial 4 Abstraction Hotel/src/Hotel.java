import java.util.*;
public class Hotel {
    private int hotelNumber;
    private String hotelName;
    private Floor[] floors = new Floor[4];

    public Hotel(int nos, String name)//constructor
    {
        hotelNumber = nos;
        hotelName = name;
        Floor f1 = new Floor(1);
        Floor f2 = new Floor(2);
        Floor f3 = new Floor(3);
        Floor f4 = new Floor(4);
        floors[0] = f1;
        floors[1] = f2;
        floors[2] = f3;
        floors[3] = f4;
    }

    public void display()
    {

        System.out.println("Hotel name: " + hotelName);
        for (int counter = 0; counter < floors.length; counter++)
        {
            floors[counter].displayFloor();
        }
    }

    public void display (int floorNos)
    {
        System.out.println("Hotel name: " + hotelName);
        floors[floorNos].displayFloor();
    }

    public void bookARoom()
    {
        Scanner kb = new Scanner(System.in);
        int floorChoice;
        System.out.print("Which floor would you like to stay on?: ");
        floorChoice = kb.nextInt();
        floors[floorChoice - 1].findARoomToBook();//question – why floorchoice-1? Answer because floor 1 is placed in element 0 of the array, 2 is in element 1 of the array etc
    }

    public void CancelARoom()
    {
        Scanner kb = new Scanner(System.in);
        int floorChoice;
        System.out.print("Which floor are you staying on?: ");
        floorChoice = kb.nextInt();
        floors[floorChoice - 1].findARoomToCancel();
    }
}