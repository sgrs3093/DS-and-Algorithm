package pepcoding_level1.basic_programming.pattern;

import java.util.Scanner;

/**
 * Pattern9 : Prinnting
 *
 * *				*
 * 	    *		*
 * 		    *
 * 	    *		*
 * *				*
 *
 */
public class Pattern9
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

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || i + j == n + 1) {
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();

        }
    }
}
