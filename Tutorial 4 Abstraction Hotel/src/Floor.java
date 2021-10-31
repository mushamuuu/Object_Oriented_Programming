import java.util.*;
public class Floor {
    private int floorNumber;
    Room[] rooms = new Room[4];

    public Floor(int nos){
        floorNumber = nos;
        Room r1 = new Room(1);
        Room r2 = new Room(2);
        Room r3 = new Room(3);
        Room r4 = new Room(4);

        rooms[0] = r1;
        rooms[1] = r2;
        rooms[2] = r3;
        rooms[3] = r4;
    }

    public void displayFloor(){
        for(int counter = 0; counter < rooms.length; counter++)
        {
            int floorNumber = 0;
            if (counter == 0)
            {
                floorNumber++;
                System.out.println("Floor " + floorNumber);
            }
            rooms[counter].display();
        }

    }

    public void findARoomToBook()
    {
        Scanner kb = new Scanner(System.in);
        int nos;
        int counter;
        boolean found = false;
        System.out.println("Booking a room");
        System.out.print("Please enter a room number: ");
        nos = kb.nextInt();
        for (counter = 0; counter < rooms.length; counter++)
        {
            if (nos == rooms[counter].returnRoomNos())
            {
                found = true;
                rooms[counter].bookRoom();
                break;
            }
        }
        if (found == false)
        {
            System.out.println("No such room number.");
        }
    }
    public void findARoomToCancel()
    {
        Scanner kb = new Scanner(System.in);
        int nos;
        int counter;
        boolean found = false;
        System.out.println("Cancel a booking");
        System.out.print("Please enter a room number: ");
        nos = kb.nextInt();
        for (counter = 0; counter < rooms.length; counter++)
        {
            if (nos == rooms[counter].returnRoomNos())
            {
                found = true;
                rooms[counter].cancelRoom();
                break;
            }
        }
        if (found == false)
        {
            System.out.println("No such room number.");
        }
    }
}