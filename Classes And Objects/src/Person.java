import java.util.Scanner;
public class Person{
    private String forename;
    private String surname;
    private String email;
    private String mobile;
    private int age;

    public Person(){
        this.getForename();
        this.getSurname();
        this.getEmail();
        this.getMobile();
        this.getAge();
    }

    public Person(String forename, String surname){
        this.forename = forename;
        this.surname = surname;
    }

    public Person(String forename, String surname,int age){
        this.forename = forename;
        this.surname = surname;
        this.age = age;
    }
    public void displayDetails() {
        System.out.println("Name  : "+forename+" "+surname);
        System.out.println("Email : "+email);
        System.out.println("Mobile: "+mobile);
        System.out.println("Age   : "+age);
    }
    public void getForename(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter forename: ");
        forename = keyboard.nextLine();
    }
    public void getSurname(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter surname: ");
        surname = keyboard.nextLine();
    }
    public void getEmail(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter email address: ");
        email = keyboard.nextLine();
    }
    public void getMobile(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter mobile number: ");
        mobile = keyboard.nextLine();
    }
    public void getAge(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter age: ");
        age = keyboard.nextInt();
        while (checkAge(age)!=true){
            System.out.println("Sorry you must be over 18");
            System.out.print("Please enter age: ");
            age = keyboard.nextInt();
        }
    }
    private boolean checkAge(int age){
        boolean ok=true;
        if (age<18)
            ok = false;

        else
            ok = true;
            return (ok);

    }

}//end of class
