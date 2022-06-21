package pepcoding_level1.basic_programming.getting_started;

import java.util.Scanner;

public class IsPrime
{
    public static void main (String[] args)
    {
        System.out.println(sieveOfEratosthenes(10));
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            //rootN(n);
            int count = 0;

            for (int div = 1; div <= n; div++) {
                if (n % div == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println("Prime");
            }
            else {
                System.out.println("Not Prime");
            }

        }
    }

    /**
     * for any number factor we need to check up to root of the N , and on that if any number will get divided
     * then we need not check further , we can stop there and say factor has been happened, and it is not prime
     * number.
     *
     * @param n
     */
    static void rootN (int n)
    {
        int count = 0;
        for (int div = 2; div * div <= n; div++) {
            if (n % div == 0) {
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("Prime");
        }
        else {
            System.out.println("Not Prime");
        }
    }

    /*
          count prime   Sieve of Eratosthenes
          Input n=10 ;
          O/p : 4
          there are 4 prime number less than 10 ;
     */

    static int sieveOfEratosthenes (int n)
    {
        if (n <= 2) { //checking 0 and 1
            return 0;
        }
        //By default, all the composite is false
        boolean[] composite = new boolean[n];

        //as we need to go till root of n then finding the limit
        int limit = (int)Math.sqrt(n);

        //for each number we need to check if it is not prime then will make it true
        //Array of composite --> where true represent not prime and False represent Prime
        for (int i = 2; i <= limit; i++) {
            if (composite[i] == false) {
                //mark all the multiple of i is true
                //the first index to be flipped to be true , is i*i
                for (int j = i * i; j < n; j += i) {
                    composite[j] = true;
                }
            }
        }

        int primeCount = 0;
        for (int i = 2; i < n; i++) {
            if (composite[i] == false) {
                primeCount++;
            }
        }
        return primeCount;
    }
}
