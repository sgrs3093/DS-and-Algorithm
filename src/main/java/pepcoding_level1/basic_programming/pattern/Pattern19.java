package pepcoding_level1.basic_programming.pattern;

import java.util.Scanner;

/**
 * Pattern 19
 * Swastik pattern
 *
 * 7
 * *	*	*	*			*
 * 			    *			*
 * 		     	*			*
 * *	*	*	*	*	*	*
 * *	    	*
 * *		    *
 * *		    *	*	*	*
 */
public class Pattern19
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
     * In this method will print the swastik
     * will divide the pattern in  5 part
     * if( i==1 )
     * // 1st row and first column first half star then space and last star
     *  j<=n/2+1 || j==n
     * else if(i<=n/2)
     *  j==n/2+1 || j==n
     * else if(i=n/2+1)
     *  total row star
     * else if(i<n)
     *  j==1 || j== n/2+1
     * else ->i==n
     *  j==1 || j>=n/2+1
     *  above steps will make the swastik symbol
     */
    private static void printPattern ()
    {
        int n = getInput();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                if (i == 1) {
                    if (j == n || j <= n / 2 + 1) {
                        System.out.print("*\t");
                    }
                    else {
                        System.out.print("\t");
                    }
                }
                else if (i != 1 && i <= n / 2) {
                    if (j == n / 2 + 1 || j == n) {
                        System.out.print("*\t");
                    }
                    else {
                        System.out.print("\t");
                    }
                }
                else if (i == n / 2 + 1) {
                    System.out.print("*\t");
                }
                else if (i < n ) {
                    if (j == 1 || j == n / 2 + 1) {
                        System.out.print("*\t");
                    }
                    else {
                        System.out.print("\t");
                    }
                }
                else  {
                    if (j == 1 || j >= n / 2 + 1) {
                        System.out.print("*\t");
                    }
                    else {
                        System.out.print("\t");
                    }
                }
            }
            System.out.println();
        }
    }
}
