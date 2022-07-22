package interviewQuestions;

public class Student
{
    //data member,fields
    int id;
    String name;
    String classSection;

    private void getStudentAge ()
    {
        int age = 20;//1
        System.out.println(age);//20
    }

    String getStudentCollege (String name)
    {
        return name;
    }

    public static void main (String[] args)
    {
        Student student = new Student();
        System.out.println(student.id);//default value get printed i.e 0
        System.out.println(student.name);//default value get printed i.e null
        System.out.println(student.classSection);//default value get printed i.e null
        student.getStudentAge();
        String value = student.getStudentCollege("NIT");
        System.out.println(value);

    }

}
