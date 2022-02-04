package pepcoding_level1.basic_programming.pattern;

import java.util.Scanner;

/**
 * Pattern 6
 * input : 5
 * output : below pattern
 * *	*	*		*	*	*
 * *	*				*	*
 * *						*
 * *	*				*	*
 * *	*	*		*	*	*
 *
 *
 */
public class Pattern6
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
           star    space  star
            3     1      3
            2     3      2
            1     5      1
            2     3      2
            3     1      3
        */

    /*

     *	*	*		*	*	*
     *	*				*	*
     *						*
     *	*				*	*
     *	*	*		*	*	*


     */
    private static void printPattern ()
    {

        int n = getInput();

        int star = n / 2 + 1;
        int space = 1;

        for (int i = 1; i <= n; i++) {
           // System.out.println(star + "," + space + "," + star);//3 1 3

            for (int str1 = 1; str1 <= star; str1++) {
                System.out.print("*\t");
            }
            for (int spc = 1; spc <= space; spc++) {
                System.out.print("\t");
            }
            for (int str2 = 1; str2 <= star; str2++) {
                System.out.print("*\t");
            }

            if (i <= n / 2) {
                star--;
                space += 2;
            }
            else {
                star++;
                space -= 2;
            }
            System.out.println();

        }

    }
}
