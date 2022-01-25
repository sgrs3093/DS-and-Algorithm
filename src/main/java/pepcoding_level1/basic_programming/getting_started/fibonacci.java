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

        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }

    }
}
