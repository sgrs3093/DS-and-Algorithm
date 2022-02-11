package pepcoding_level1.basic_programming.pattern;

import java.util.Scanner;

/**
 * Pattern 12
 * 0
 * 1	1
 * 2	3	5
 * 8	13	21	34
 * 55	89	144	233	377
 *
 */
public class Pattern12
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

    private static void printPattern ()
    {
        int n = getInput();
        /*
            print a triangle of Fibonacci sequence
     * 1st row -> *         0
     * 2d row - > * * >     1  1
     * 3d row - > * * *>    2  3  5
     * 4d row - > * * * *>  8  13  21  34
     * 5d row - > * * * * *>55 89 144   233  377
         */
        int a =0,b=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a+"\t");
                int c = a + b;
                a = b;
                b = c;
            }
            System.out.println();
        }
    }
}
