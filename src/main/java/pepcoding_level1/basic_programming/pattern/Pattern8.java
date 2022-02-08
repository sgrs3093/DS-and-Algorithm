package pepcoding_level1.basic_programming.pattern;

import java.util.Scanner;

/**
 * Pattern8
 * YouTube : https://www.youtube.com/watch?v=D5a13WBbee0
 *
 * 				*   (1,5)
 * 			*       (2,4)
 * 	    *           (3,3)
 * 	  *             (4,2)
 * *                (5,1)
 *
 */
public class Pattern8
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

        /**
         * 1 row -> 4 space, 1 start
         * 2 row -> 3 space,1 star
         * 3 row -> 2 space, 1 star
         * 4 row -> 1 space, 1 star
         * 5 row -> 0 space , 1 star
         */
        //
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                //when i and j combination is equal to n+1 then will print * else space
                /**
                 *  i+j = n+1
                 *  -------
                 *  1+5=6
                 *  2+4=6
                 *  3+3=6
                 *  4+2=6
                 *  5+1=6
                 */
                if (i + j == n + 1) {
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
