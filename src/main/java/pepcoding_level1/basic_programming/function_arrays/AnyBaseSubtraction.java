package pepcoding_level1.basic_programming.function_arrays;

import java.util.Scanner;

/**
 * AnyBaseSubtraction
 * Link : https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/any_base_subtraction/topic
 * <p>
 * In this Problem we will subtract the 2 number
 * n1 and n2 . n2 will be bigger then the n1 of their base
 */
public class AnyBaseSubtraction
{
    public static int getInput ()
    {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void main (String[] args)
    {
        anyBaseSubstraction();
    }

    private static void anyBaseSubstraction ()
    {
        int n1 = getInput();
        int n2 = getInput();
        int base = getInput();
        //here we get 3 number n2 has to be grater then n1 as we need to subtract the number

        /*
        n1=256
        n2=1212
        base 8
         */
        int res = 0;
        int carry = 0;
        int pow = 1;
        while (n2 > 0) {
            int dig1 = n1 % 10;
            n1 = n1 / 10;
            int dig2 = n2 % 10;
            n2 = n2 / 10;

            int d = 0;
            dig2 = carry + dig2;

            if (dig2 >= dig1) {
                carry = 0;
                d = dig2 - dig1;
            }
            else {
                carry = -1;
                d = (dig2 + base) - dig1;
            }
            res = res + d * pow;
            pow = pow * 10;
        }
        System.out.println("Any base to subtraction is : "+res);
    }

}
