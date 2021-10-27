import java.util.Scanner;

public class OrdinaryCustomer extends Customer{

    private final double discount = 0;

    public OrdinaryCustomer()
    {
        customerName = this.getName();
        customerEmail = this.getEmail();
    }
    public void display()
    {
        System.out.println("Details are " + customerName + " " + customerEmail);
    }
    public String getName()
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        customerName = kb.nextLine();
    }
    public String getEmail()
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Please enter your Email: ");
        customerEmail = kb.nextLine();
    }
    public void calcCost(double cost)
    {

    }
}
