package interviewQuestions;

/**
 * Here we are breaking the loop with label
 * we will give then label and based on the label we will break the corresponding loop
 */
public class BreakWithLabel
{
    public static void main (String[] args)
    {
        c:
        for (int i = 1; i <= 3; i++) {
            bb:
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    //using break statement with label
                    break c;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}
