import java.util.*;
public class Customer {
    private String customerName;
    private String customerEmail;

    //constructor
    public Customer(){

    }
    //constructor
    public Customer (String cName, String cEmail)
    {
        customerName = cName;
        customerEmail = cEmail;
    }
    public void display()
    {
        System.out.println("Details are " + customerName + " " + customerEmail);
    }
    public void getName()
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        customerName = kb.nextLine();
    }
    public void getEmail(){
        Scanner kb = new Scanner(System.in);
        System.out.print("Please enter your Email: ");
        customerEmail = kb.nextLine();
    }
}
