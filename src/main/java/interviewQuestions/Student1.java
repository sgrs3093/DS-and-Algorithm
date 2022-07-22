package interviewQuestions;

public class Student1
{
    int id;
    String name;

    void insertRecord (int rolno,
                       String name1)
    {

        id = rolno;
        name = name1;
    }

    void displayStudentInformation (Student1 s)
    {
        System.out.println(s.id);
        System.out.println(s.name);
    }

}
