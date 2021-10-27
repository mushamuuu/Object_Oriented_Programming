import java.util.*;

public class Unit {

    private String unitNumber;
    private String unitTitle;
    private Student[] classlist = new Student[10];
    private String[] result = new String[10];

    public Unit(String uNo, String uTitle)
    {
        unitNumber = uNo;
        unitTitle = uTitle;
    }
    public void addStudent(Student temp)
    {
        boolean space = false;
        for (int i = 0; i < classlist.length; i++)
        {
            if (classlist[i] == null)
            {
                classlist[i] = temp;
                space = true;
                break;
            }
        }
        if (space==true)
        {

            System.out.println("Student inserted.");
        }
        else
        {
            System.out.println("No space available.");
        }
    }
}
