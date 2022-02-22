package pepcoding_level1.basic_programming.function_arrays;

import java.util.Scanner;

/**
 * You are given a base b.
 * You are given two numbers n1 and n2 of base b.
 * You are required to add the two numbers and print their value in base b.
 * <p>
 * Input Format:
 * A base b
 * A number n1
 * A number n2
 */
public class AnyBaseAddition
{

    public static int getInput ()
    {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void main (String[] args)
    {
        anyBaseAddition();
    }

    static void anyBaseAddition ()
    {

        int n1 = getInput();
        int n2 = getInput();
        int base = getInput();

        int result = 0;
        int multiplier = 1;
        int carry = 0;

        while (n1 > 0 || n2 > 0 || carry > 0) {

            int dig1 = n1 % 10;
            int dig2 = n2 % 10;

            int totVal = carry + dig1 + dig2;

            carry = totVal / base;
            int value = totVal % base;

            result += value * multiplier;
            multiplier *= 10;

            n1 = n1 / 10;
            n2 = n2 / 10;
        }
        System.out.println("Total addition of base values is : " + result);

    }

}
