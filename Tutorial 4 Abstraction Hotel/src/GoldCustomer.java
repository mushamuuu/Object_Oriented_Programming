import java.util.Scanner;

public class GoldCustomer extends Customer{

    private final double discount = 20;

    public GoldCustomer()
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
