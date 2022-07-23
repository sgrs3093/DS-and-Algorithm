package interviewQuestions;

public class TestRectangle
{
    public static void main (String[] args)
    {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.insert(10,
                          5);

        Rectangle rectangle2 = new Rectangle();
        rectangle2.insert(15,
                          5);

        rectangle1.calculateArea();

        rectangle2.calculateArea();
    }
}
