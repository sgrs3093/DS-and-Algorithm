package pepcoding_level1.basic_programming.pattern;

import java.util.Scanner;

/**
 * Pattern5
 * 	    	*
 *       *	*	*
     *   *  *	*	*
 *       *	*	*
 *  		*
 *
 *
 */
public class Pattern5
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
       for number = 5
               space  star
               2       1
               1       3
               0       5
               1       3
               2       1
        */
    private static void printPattern ()
    {
        int n = getInput();
        int space = n / 2;
        int star = 1;
        for (int i = 1; i <= n; i++) {
            // System.out.println(space + "," + star);

            for (int sp = 1; sp <= space; sp++) {
                System.out.print("\t");
            }

            for (int str = 1; str <= star; str++) {
                System.out.print("*\t");
            }
            if (i <= n / 2) {
                space--;
                star += 2;
            }
            else {
                space++;
                star -= 2;
            }

            System.out.println();
        }
    }

}
