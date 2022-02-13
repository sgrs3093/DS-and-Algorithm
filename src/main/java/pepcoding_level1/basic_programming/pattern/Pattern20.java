package pepcoding_level1.basic_programming.pattern;

import java.util.Scanner;

/**
 * Pattern20
 * we need to print the pattern 20 which is W
 * input : 5
 * *				*
 * *				*
 * *		*		*
 * *	*		*	*
 * *				*
 */
public class Pattern20
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
     * *				*
     * *				*
     * *		*		*
     * *	*		*	*
     * *				*
     *
     */
    private static void printPattern ()
    {
        int n = getInput();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n) {
                    System.out.print("*\t");
                }//to print diagonal in 2nd half
                else if (i > n / 2 && (i == j || i + j == n + 1)) {
                    System.out.print("*\t");
                } else{
                    System.out.print("\t");
                }
            } System.out.println();
        }
    }

}
