package interviewQuestions;

public class TestStudent
{
    public static void main (String[] args)
    {
        Student1 student1 = new Student1();

        student1.insertRecord(10,
                              "Avyaan");

        Student1 student2 = new Student1();

        student2.insertRecord(20,
                              "Shikha");

        student1.displayStudentInformation();

        student2.displayStudentInformation();

        //
        Student1 s1 = new Student1();
        s1.insert(101,
                  "XYZ",
                  100.00f);

        Student1 s2 = new Student1();
        s2.insert(102,
                  "ZYK",
                  1000.00f);

        Student1 s3 = new Student1();
        s3.insert(103,
                  "EWR",
                  2000.00f);

        System.out.println("displaying the student record....");
        s1.display();
        s2.display();
        s3.display();

    }
}
