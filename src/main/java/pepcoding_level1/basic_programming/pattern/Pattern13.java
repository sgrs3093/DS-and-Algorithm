package pepcoding_level1.basic_programming.pattern;

import java.util.Scanner;

/**
 * Pattern 13
 * input n = 5
 * <p>
 * 1
 * 1	1
 * 1	2	1
 * 1	3	3	1
 * 1	4	6	4	1
 * 1    5  10   10  5  1
 */
public class Pattern13
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

        //here in this problem also we need to print triangle
        ///under triangle also we need to print the logic
        /**
         * 1) this pattern is lies between math formula i.e nC0 =1
         * 2) here i and j are going through the triangle part
         * 3) for every row that many column we need to print i.e i=2 then 2 column
         * 4) last row i.e 5 will see the example
         *   for i =5  5C0 = 1
         *   i     j    iCj   iCj+1 => iCj * (i-j) / j+1
         *   5    0     5C0   5C0+1 => 5C1 = 5C0 * (5-0)/0+1=> 5/1 = 5
         *   5    1     5C1   5C1+1 => 5C2 = 5C1 * (5-1)/1+1 => 5 * 4 /2 => 20/2 = 10 (here we are substituting the 5C1 value i.e 5
         *   5    2     5C2   5C2+1 => 5C3 = 5C2 * ( 5-2) / 2+1 => 10 * 3 / 3 => 30/2 = 10 ( here we are substituting the 5C2 value that is previous row value)
         *   5    3     5C3   5C3+1 => 5C4 = 5C3 * ( 5-3) / 3+1 => 10* 2/4 =>5  (here we are substituting the 5C3 value i.e 5
         *   5    4     5C4   5C4+1 => 5C5 = 5C4 * ( 5-4) /4+1 => 5*1/5 => 1  (here we are substituting the 5C4 value i.e 5
         *
         */
        for (int i = 0; i < n; i++) {
            int icj = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(icj + "\t");
                int icjplus1 = icj * (i - j) / (j + 1);
                //after finding the value of icjplus1 will take that value and put the value in icj ..
                icj = icjplus1;

            }
            System.out.println();
        }

    }

}
