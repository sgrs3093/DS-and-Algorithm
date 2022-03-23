package interviewQuestions;

/**
 * String class example
 */
public class Test2
{

    public static void main (String[] args)
    {
        String s1 = "hello";
        String s2 = new String("hello");
        String s3 = s1;
        String s4 = s2;

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s3);
        System.out.println(s4 == s2);
        System.out.println(s4 == s1);
        System.out.println(s4.equals(s1));
    }
}
