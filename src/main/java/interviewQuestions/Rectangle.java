package interviewQuestions;

public class Rectangle
{
    int length;
    int width;

    //
    void insert (int l,
                 int w)
    {

        length = l;
        width = w;
    }

    void calculateArea ()
    {
        System.out.println("area of rectangle : " + length * width);
    }

}
