package pepcoding_level1.basic_programming.getting_started;

import java.util.Scanner;

/**
 * Prime Factorization Of A Number
 * 1. You are required to display the prime factorization of a number.
 *     2. Take as input a number n.
 *     3. Print all its prime factors from smallest to largest.
 *
 *     input : 1440
 *     output : 2 2 2 2 2 3 3 5
 */
public class PrimeFactorization
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        loopUptoRootN(n);
        for (int div = 2; div <= n; div++) {
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
