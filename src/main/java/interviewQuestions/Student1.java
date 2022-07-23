package interviewQuestions;

public class Student1
{
    int id;
    String name;
    float salary;

    void insert (int i,
                 String n,
                 float s)
    {
        id = i;
        name = n;
        salary = s;

    }

    void display ()
    {
        System.out.println(id + "---" + name + "----" + salary);
    }

    void insertRecord (int i,
                       String n)
    {

        id = i;
        name = n;
    }

    void displayStudentInformation ()
    {
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
    }

}
