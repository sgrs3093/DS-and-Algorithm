package pepcoding_level1.basic_programming.pattern;

import java.util.Scanner;

/**
 * Pattern 7
 *YouTube : https://www.youtube.com/watch?v=ewBilX1an5A
 * Input : 5
 *
 * output :
 * *
 * 	 *
 * 		*
 * 			*
 * 				*
 *
 */
public class Pattern7
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
     * Need to Print diagonal for input 5
     * *
     *
     *
     */

    /*
       for number = 5
           star    row  column
            1     1      1
            1     2      2
            1     3      3
            1     4     4
            1     5     5
        */


    private static void printPattern ()
    {
        int n = getInput();

        //when i and j are equal then we need to print * else we need to print space
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                //if i is equal to j then we will print *
                if (i == j) {
                    System.out.print("*\t");
                }
                //else will only print space ( \t is to print tab in between star and space
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
