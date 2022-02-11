package pepcoding_level1.basic_programming.pattern;

import java.util.Scanner;

/**
 * Pattern 14
 * Print table
 * input 3
 * 3 * 1 = 3
 * 3 * 2 = 6
 * 3 * 3 = 9
 * 3 * 4 = 12
 * 3 * 5 = 15
 * 3 * 6 = 18
 * 3 * 7 = 21
 * 3 * 8 = 24
 * 3 * 9 = 27
 * 3 * 10 = 30
 *
 */
public class Pattern14
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
         * 3 * 1 = 3
         * 3 * 2 = 6
         * 3 * 3 = 9
         * 3 * 4 = 12
         * 3 * 5 = 15
         * 3 * 6 = 18
         * 3 * 7 = 21
         * 3 * 8 = 24
         * 3 * 9 = 27
         * 3 * 10 = 30
         */
        for (int i = 1; i <= 10; i++) {
            // will take simple loop 1 to 10 and will multiply with the number
            //suppose got 2 then 2*1 , 2*2  , 2*3 ----so on . will go upto loop 10 and also hold the value and print .
            int mul = n * i;
            System.out.println(n + " * " + i + " = " + mul);
        }
    }
}
