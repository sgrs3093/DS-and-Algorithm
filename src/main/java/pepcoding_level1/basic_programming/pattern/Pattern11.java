package pepcoding_level1.basic_programming.pattern;

import java.util.Scanner;

/**
 * Pattern 11
 * input ; 5
 * output
 * 1
 * 2	3
 * 4	5	6
 * 7	8	9	10
 * 11	12	13	14	15
 */
public class Pattern11
{

    public static int getInput ()
    {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void main (String[] args)
    {
        printPattern();
    }

    /**
     * here in every row will be printing value based on row count
     * 1st row -> *         1
     * 2d row - > * * >     2  3
     * 3d row - > * * *>    4  5  6
     * 4d row - > * * * *>  7  8  9  10
     * 5d row - > * * * * *>11 12 13 14  15
     *
     */
    private static void printPattern ()
    {
        int n = getInput();
        int val = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(val+++"\t");
            }
            System.out.println();
        }
    }

}
