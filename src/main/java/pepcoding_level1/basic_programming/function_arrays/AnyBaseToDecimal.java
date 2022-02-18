package pepcoding_level1.basic_programming.function_arrays;

import java.util.Scanner;

/**
 * Any Base To Decimal
 * <p>
 * 1. You are given a number n.
 * 2. You are given a base b. n is a number on base b.
 * 3. You are required to convert the number n into its corresponding value in decimal number system.
 * <p>
 * Sample Input:
 * 111001
 * 2
 * Sample Output:
 * 57
 */
public class AnyBaseToDecimal
{

    public static int getInput ()
    {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void main (String[] args)
    {
        anybasetoDecimal();
    }

    private static void anybasetoDecimal ()
    {
        System.out.println("Enter the number you want to convert");
        int num = getInput();
        System.out.println("Enter the base in which you want to convert");
        int base = getInput();
        //In this problem, we get a number 'n' and it's base 'b', and we are required to convert the number "n" into a decimal number.

        while(num > 0) {

            int dig = num%10;
            num = num/10;
        }

    }
}
