import java.util.*;
public class Room {
    private int roomNos;
    private Customer occupier;
    private boolean status;

    public Room(int rnos){
        roomNos = rnos;
        status = true; //free
    }

    public int returnRoomNos()
    {
        return (roomNos);
    }

    public void display()
    {
        System.out.println("Room Number: " + roomNos);
        if (status==true)
        {
            System.out.println("Room is free.");
        }
        else {
            occupier.display();
        }
    }

    public void bookRoom(Customer newPerson)
    {
        if (status==true){
            status = false;
            occupier = newPerson;
        }
        else
        {
            System.out.println("Sorry room booked.");
        }
    }
    public void bookRoom()
    {
        System.out.println("Room " + roomNos);
        if (status==true)
        {
            Customer newPerson = new Customer();
            newPerson.getName();
            newPerson.getEmail();
            status = false;
            occupier = newPerson;
        }
        else
        {
            System.out.println("Sorry room booked.");
        }
    }
    public void cancelRoom()
    {
        status = true;
        occupier = null;
        System.out.println("Room cancelled.");
    }


}
