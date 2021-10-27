import java.util.*;

public class Student {
    private String studentName;

    public Student(String name)
    {
        setStudentName(name);
    }


    public void setStudentName(String name)
    {
        this.studentName = name;
    }
    public String getStudentName()
    {
        return studentName;
    }
}
