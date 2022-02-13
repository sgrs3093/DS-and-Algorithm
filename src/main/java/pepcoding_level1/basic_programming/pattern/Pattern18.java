package pepcoding_level1.basic_programming.pattern;

import java.util.Scanner;

/**
 * Pattern18
 * Input : 18
 * *	*	*	*	*	*	*
 * <p>
 * *				*
 * <p>
 * *		*
 * <p>
 * *
 * <p>
 * *   *	*
 * <p>
 * *	*	*	*	*
 * <p>
 * *	*	*	*	*	*	*
 */
public class Pattern18
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
     *
     * First I will print this pattern
     * *	*	*	*	*	*	*
     *   *	*	*	*	*
     * 		*	*	*
     * 			*
     * 		*	*	*
     * 	*	*	*	*	*
     * *	*	*	*	*	*	*
     *
     * Then from above pattern will print out actual pattern
     */
    /**
     * *	*	*	*	*	*	*
     * <p>
     * *				*
     * <p>
     * *		*
     * <p>
     * *
     * <p>
     * *   *	*
     * <p>
     * *	*	*	*	*
     * <p>
     * *	*	*	*	*	*	*
     */
    private static void printPattern ()
    {
        int n = getInput();
        int space = 0;
        int star = n;

        for (int i = 1; i <= n; i++) {
            //for space
            for (int sp = 1; sp <= space; sp++) {
                System.out.print("\t");
            }
            for (int st = 1; st <= star; st++) {
                System.out.print("*\t");
            }
            if (i <= n / 2) {
                space++;
                star -= 2;
            }
            else {
                space--;
                star += 2;
            }
            System.out.println();
        }
        actualPrintPattern();
    }

    private static void actualPrintPattern ()
    {
        System.out.println("Enter the input number : ");
        int n = getInput();
        int space = 0;
        int star = n;

        for (int i = 1; i <= n; i++) {
            //for space
            for (int sp = 1; sp <= space; sp++) {
                System.out.print("\t");
            }
            //only the first and last column starting from second row are present ,rest stars are missing
            for (int st = 1; st <= star; st ++) {
                if (i > 1 && i <= n / 2 && st > 1 && st < star) {
                    System.out.print("\t");
                } else {
                    System.out.print("*\t");
                }
            }
            if (i <= n / 2) {
                space++;
                star -= 2;
            }
            else {
                space--;
                star += 2;
            }
            System.out.println();
        }
    }

}
