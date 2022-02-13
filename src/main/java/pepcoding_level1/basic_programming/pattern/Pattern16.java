package pepcoding_level1.basic_programming.pattern;

import java.util.Scanner;

/**
 *
 * Patter 16
 *
 * input : 7
 * 1												1
 *
 * 1	2										2	1
 *
 * 1	2	3								3	2	1
 *
 * 1	2	3	4						4	3	2	1
 *
 * 1	2	3	4	5				5	4	3	2	1
 *
 * 1	2	3	4	5	6		6	5	4	3	2	1
 *
 * 1	2	3	4	5	6	7	6	5	4	3	2	1
 *
 * input : 4
 *  1					    1
 *
 *  1	2			    2 	1
 *
 *  1	2	3		3	2	1
 *
 *  1	2	3	4	3	2	1
 *
 */
public class Pattern16
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

        /*
        this is similar to triangle pattern
        and then opposite of triangle patter will be print on other side
        we need to print mirror image of triangle pattern
         */

        int space = n + 1;
        //first will print the triangle pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "\t");
            }
            for (int sp = 1; sp <= space; sp++) {
                System.out.print("\t");
            }
            for (int j = i; j >= 1; j--) {
                if (j == n) {
                    System.out.print(--j + "\t");
                }
                else {
                    System.out.print(j + "\t");
                }
            }
            space -= 2;
            System.out.println();
        }

    }

}
