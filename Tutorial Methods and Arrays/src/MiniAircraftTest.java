import java.util.Scanner;

public class MiniAircraftTest {
    //display all seats
    public static void displaySeats(int noseats, String[] pname)
    {
        for (int x=0;x<noseats;x++)
            System.out.println("Seat number "+x+" passenger "+pname[x]);
    }
    //book a seat
    public static void bookseat(String[] pname, int bookedseat, String name)
    {
        pname[bookedseat] = name;
        System.out.println("seat booked");
    }
    //cancel a seat
    public static void cancel(String[] pname, int cancelledseat)
    {
        pname[cancelledseat] = null;
        System.out.println("seat cancelled");
    }
    //get user's desired seat number
    public static int getSeatNumber()
    {
        Scanner kboard = new Scanner(System.in);
        int seat;
        System.out.println("please enter seat number");
        seat=kboard.nextInt();
        return(seat);
    }
    //get user's name
    public static String getName()
    {
        Scanner kboard = new Scanner(System.in);
        String name;
        System.out.println("please enter passenger name");
        name=kboard.nextLine();
        return(name);
    }
    //main
    public static void main(String[] args)
    {
        Scanner kboard = new Scanner(System.in);
        final int nosseats=14;
        String[] pname = new String[nosseats];
        //int[] type = new int[nosseats];
        int choice;
        System.out.println("Booking Menu");
        System.out.println("1. Book a seat, 2. Display all, 3. Cancel a seat, 4. Takings");
        System.out.println("Please enter choice (press 8 to continue)");
        choice = kboard.nextInt();
        do
        {
            switch(choice)
            {
                case 1:
                    displaySeats(nosseats,pname);
                    bookseat(pname,getSeatNumber(),getName());
                    break;
                case 2:
                    displaySeats(nosseats,pname);
                    break;
                case 3:
                    displaySeats(nosseats,pname);
                    cancel(pname,getSeatNumber());
                    break;
                case 4: System.out.println("takings");break;
                default: System.out.println("no idea what you want");break;
            }
            System.out.println("1. Book a seat, 2. Display all, 3. Cancel a seat, 4. Takings, 8. exit");
            System.out.println("Please enter choice (press 8 to continue)");
            choice = kboard.nextInt();
        }
        while (choice !=8);
    }
}
