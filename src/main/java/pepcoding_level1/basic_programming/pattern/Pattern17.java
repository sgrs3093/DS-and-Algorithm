package pepcoding_level1.basic_programming.pattern;

import java.util.Scanner;

/**
 *
 *		*
 *
 * 		*	*
 *
 *  *	*	*	*	*
 *
 * 		*	*
 *
 * 		*
 *
 */
public class Pattern17
{

    public static int getInput ()
    {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void main (String[] args)
    {
        printPattern1();
    }

    /*
    input = 5
     		*
      		*	*
     *  *	*	*	*	*
      		*	*
      		*
     */
    private static void printPattern ()
    {
        int n = getInput();
        int space = n / 2;
        int star = 1;
        //looping for Rows
        for (int i = 1; i <= n; i++) {

            //for space is printing only in rows which is not equal to n/2+1
            if (i != n / 2 + 1) {
                for (int j = 1; j <= space; j++) {
                    System.out.print("\t");
                }
            }
            //star printing
            //full star will print out for n/2+1 rows and remaining rows will be printing
            if (i == n / 2 + 1) {
                for (int st = 1; st <= n; st++) {
                    System.out.print("*\t");
                }
            }
            else {
                if (i <= n / 2) {
                    for (int st = 1; st <= star; st++) {
                        System.out.print("*\t");

                    }
                    star++;
                }
                if (i > n / 2 + 1) {
                    star--;
                    for (int st = 1; st <= star; st++) {
                        System.out.print("*\t");
                    }
                }
            }
            System.out.println();
        }

    }


    private static void printPattern1 ()
    {
        int n = getInput();
        int space = n / 2;
        int star = 1;

        for (int i = 1; i <= n; i++) {

            //for space
            for (int j = 1; j <= space; j++) {

                if (i == n / 2 + 1) {
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }

            }
            //for star
            for (int st = 1; st <= star; st++) {
                System.out.print("*\t");
            }

            if (i <= n / 2) {
                star++;
            }
            else {
                star--;
            }
            System.out.println();
        }
    }
}
