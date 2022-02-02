package pepcoding_level1.basic_programming.pattern;

import java.util.Scanner;

/**
 * You tube : https://www.youtube.com/watch?v=_xlkKJyNmuc
 ** Pattern4
 *  * Input: 5
 *  * <p>
 *  * Output
 *  * <p>
 * *	*	*	*	*
 * 	    *	*	*	*
 * 	    	*	*	*
 * 	    		*	*
 * 	    			*
 */
public class Pattern4
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

    /*
     /*
        for number = 5
                space  star
                0       5
                1       4
                2       3
                3       2
                4       1
         */
    static void printPattern ()
    {

        int n = getInput();
        int star = n;
        int space = 0;

        for (int i = 1; i <= n; i++) {
            for (int sp = 1; sp <= space; sp++) {
                System.out.print("\t");
            }
            for (int str = star; str > 0; str--) {
                System.out.print("*\t");
            }
            space++;
            star--;
            System.out.println();
        }

    }
}
