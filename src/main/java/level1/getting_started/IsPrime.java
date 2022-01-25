package level1.getting_started;

import java.util.Scanner;

public class IsPrime
{
    public static void main (String[] args)
    {
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
     * for any no factor we need to check up to root of the N , and on that if any number will get devided
     * then we need  not to check further , we can stop there and say factor has been happend and it is not prime
     * number
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
}
