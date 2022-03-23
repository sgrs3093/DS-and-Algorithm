package pepcoding_level1.basic_programming.pattern;

import java.util.Scanner;

/**
 * Pattern3
 * Input: 5
 * <p>
 * Output
 * <p>
 *				*
 * 			*	*
 * 		*	*	*
 * 	 *	*	*	*
  *  *	*	*	*
 */
public class Pattern3
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
        /*
        for number = 5
                space  star
                4       1
                3       2
                2       3
                1       4
                0       5
         */
        int space = n - 1;
        int star = 1;

        for (int i = 1; i <= n; i++) {
            for (int spac = 1; spac <= space; spac++) {
                System.out.print("\t");
            }
            for (int str = 1; str <= star; str++) {
                System.out.print("*\t");
                //System.out.print("\t");
            }
            space--;
            star++;
            System.out.println();
        }
    }

}
