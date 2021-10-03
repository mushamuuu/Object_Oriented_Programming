import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        NameGenerator nameGenerator = new NameGenerator();
        String fName;
        String lName;
        String mName;
        String pOB;


        System.out.println("Star Wars Name Generator");

        System.out.print("Please enter your first name: ");
        fName = kb.nextLine();
        nameGenerator.setFirstName(fName);

        System.out.print("Please enter your last name: ");
        lName = kb.nextLine();
        nameGenerator.setLastName(lName);

        System.out.print("Please enter your mother's maiden name: ");
        mName = kb.nextLine();
        nameGenerator.setMothersMaidenName(mName);

        System.out.print("Please enter your place of birth: ");
        pOB = kb.nextLine();
        nameGenerator.setPlaceOfBirth(pOB);

        nameGenerator.generateStarWarsName(fName,lName,mName,pOB);
    }
}
