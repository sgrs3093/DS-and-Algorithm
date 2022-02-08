package pepcoding_level1.basic_programming.pattern;

import java.util.Scanner;

/*
Pattern10
YouTube : https://www.youtube.com/watch?v=8ccsrxrXCmk&t=7s
            *
         *		*
    *				*
         *		*
            *
 */
public class Pattern10
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
         * here we will think about outer space and inner space
         * for input number 5 we will check how many stars we need to print
         *          outer space   inner space
         * 1st row - 2             -1
         * 2st row - 1              1
         * 3st row - 0              3
         * 4st row - 1`             1
         * 5st row - 2`             -1
         */
        int outerSpace = n / 2; //5/2 ==> 2
        int innerSpace = -1;
        for (int i = 1; i <= n; i++) {
           // System.out.print(outerSpace + " , " + innerSpace);
            //for outer space loop
            for (int j = 1; j <= outerSpace; j++) {
                System.out.print("\t");
            }
            //for star
            System.out.print("*\t");

            //for inner space
            for (int j = 1; j <= innerSpace; j++) {
                System.out.print("\t");
            }

            //for 1st and last i.e nth row we have only outer spcae and 1 star no inner space
            //but all the inner loop apart from 1st and last row have star after inner space

            if (i > 1 && i < n) {
                System.out.print("*");
            }

            if (i <= n / 2) {
                outerSpace--;
                innerSpace += 2;
            }
            else {
                outerSpace++;
                innerSpace -= 2;
            }
            System.out.println();
        }

    }
}
