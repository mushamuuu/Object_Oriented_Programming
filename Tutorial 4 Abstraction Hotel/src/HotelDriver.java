public class HotelDriver {
    public static void main(String[] args) {
        double cost = 100;
        Customer[] occupiers = new Customer[10];
        occupiers[0] = new OrdinaryCustomer();
        occupiers[1] = new GoldCustomer();

        Hotel h1 = new Hotel(101, "The Grand");

        h1.display();
        h1.bookARoom();
        h1.display();
        h1.CancelARoom();
        h1.display();
    }
}