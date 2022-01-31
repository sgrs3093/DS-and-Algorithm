package pepcoding_level1.basic_programming.pattern;

import java.util.Scanner;

/**
 * Pattern 2
 * input : 5
 * output :
 * *	*	*	*	*
 * *	*	*	*
 * *	*	*
 * *	*
 * *
 */
public class Pattern2
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

    static void printPattern ()
    {
        int n = getInput();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
