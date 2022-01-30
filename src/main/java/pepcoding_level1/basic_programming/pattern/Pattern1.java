package pepcoding_level1.basic_programming.pattern;

import java.util.Scanner;

/**
 * Pattern 1
 * *
 * *	*
 * *    *   *
 * *	*   *   *
 * *	*   *   *
 */
public class Pattern1
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
     * 5
     * *
     * *	*
     * *	*	*
     * *	*	*	*
     * *	*	*	*	*
     */
    static void printPattern ()
    {
        int n = getInput();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
