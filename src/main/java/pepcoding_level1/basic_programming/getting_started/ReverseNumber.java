package pepcoding_level1.basic_programming.getting_started;

import java.util.Scanner;

/**
 * Reverse A Number
 * 1. You've to display the digits of a number in reverse.
 * 2. Take as input "n", the number for which digits have to be display in reverse.
 * 3. Print the digits of the number line-wise, but in reverse order.
 * <p>
 * 123
 * 3
 * 2
 * 1
 *
 * youtube : https://www.youtube.com/watch?v=D_yKIOnhMRc
 */
public class ReverseNumber
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        reverseNumber(n);
    }

    static void reverseNumber (int n)
    {

        while (n != 0) {
            /*
                example : 1234
                1234 = > 1234%10 => reminder 4 and quotient 123 , 123%10= reminder =3
                and quotient = 12 , 12%10 => reminder 2 and quotient 1
                1%10 = reminder 1 and quotient will be 0 and loop will stop
             */
            int rem = n % 10;
            n = n / 10;
            System.out.println(rem);
        }

    }
}
