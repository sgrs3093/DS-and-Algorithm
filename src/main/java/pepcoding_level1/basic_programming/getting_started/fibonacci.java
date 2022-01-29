package pepcoding_level1.basic_programming.getting_started;

import java.util.Scanner;

/**
 * Print fibonacci till N
 */
public class fibonacci
{
    /*
     *  N=  10
        o/p =    0 1 1 2 3 5 8 13 21 34
     */
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        /*
         * initially a and b will be 0 and 1
         * then will take c and add both a and b then
         * c will be taken by b and
         * b will be taken by a
         * and a will print every time
         */
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");//0 1 1 2 3 5
            int c = a + b;//0+1=1, 1+1=2,1+2=3,2+3=5,3+5=8
            a = b;//1,1,2,3,5
            b = c;//1,2,3,5,8
        }

    }
}
