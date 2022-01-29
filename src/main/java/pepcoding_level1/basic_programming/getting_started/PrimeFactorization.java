package pepcoding_level1.basic_programming.getting_started;

import java.util.Scanner;

/**
 * YouTube : https://www.youtube.com/watch?v=5gFC-ayyQMk
 * Prime Factorization Of A Number
 * 1. You are required to display the prime factorization of a number.
 * 2. Take as input a number n.
 * 3. Print all its prime factors from smallest to largest.
 * <p>
 * input : 1440
 * output : 2 2 2 2 2 3 3 5
 */
public class PrimeFactorization
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        loopUptoRootN(n);
        for (int div = 2; div <= n; div++) {
            /*
             *we will be dividing the number from 2 and go until number become 0
             * exp:
             * 2|1440
             * 2|720
             * 2|360
             * 2|180
             * 2|90
             * 3|45
             * 3|15
             * 5|5
             *   1
             * o/p: 2 2 2 2 2 3 3 5
             */
            while (n % div == 0) {
                n = n / div;
                System.out.print(div + " ");
            }
        }
    }

    //optimization

    /**
     * any number factorization will not be
     * p*q=n then p and q both will not be grater then q>n && p> n
     * if p and q equal to N then both p and q can not be grater then n
     *
     * @param n
     */
    static void loopUptoRootN (int n)
    {
        for (int div = 2; div * div <= n; div++) {
            while (n % div == 0) {
                n = n / div;
                System.out.print(div + " ");
            }
        }

        if (n != 1) {
            System.out.print(n);
        }
    }
}
