import java.util.Scanner;
//start main class
public class Main {
    //rectangle
    public static double getHeight(){
        Scanner keyboard = new Scanner(System.in);
        double height;
        System.out.print("Enter height: ");
        height = keyboard.nextDouble();
        return height;
    }//end of getHeight

    public static double getWidth(){
        Scanner keyboard = new Scanner(System.in);
        double width;
        System.out.print("Enter width: ");
        width = keyboard.nextDouble();
        return width;
    }//end of getWidth

    public static double calculateArea(double width, double height){
        return (width * height);
    }//end of calculateArea - overloading

    //circle
    public static double getRadius(){
        Scanner keyboard = new Scanner(System.in);
        double radius;
        System.out.print("Enter radius: ");
        radius = keyboard.nextDouble();
        return radius;
    }//end of getRadius

    public static double calculateArea(double radius){

        return (2 * 3.14 * radius);
    }//end of calculateArea - overloading

    //display
    public static void displayAll(double area){
        System.out.println("Area = " + area);
        System.out.println();
    }//end of displayAll

    //start main method
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int choice;
        double area;

        System.out.println("Circle and Rectangle");
        System.out.println("1. Circle 2. Rectangle 3. Exit");
        choice = keyboard.nextInt();

        do {
            switch (choice) {
                case 1 -> {
                    area = calculateArea(getRadius());
                    displayAll(area);
                }
                case 2 -> {
                    area = calculateArea(getWidth(), getHeight());
                    displayAll(area);
                }
                default -> System.out.println("Please enter 1-3.");
            }
            System.out.println("Circle and Rectangle");
            System.out.println("1. Circle 2. Rectangle 3. Exit");
            choice = keyboard.nextInt();
        }

        while (choice != 3);

        System.out.println("Program terminated.");
    }//end main method
}// end main class
