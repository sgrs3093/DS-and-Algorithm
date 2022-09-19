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
        anyBaseToDecimal();
    }

    private static void anyBaseToDecimal ()
    {

        System.out.println("Enter the number you want to convert");
        int num = getInput();
        System.out.println("Enter the base in which you want to convert");
        int base = getInput();
        //In this problem, we get a number 'n' and it's base 'b', and we are required to convert the number "n" into a decimal number.

        /*
        here we need to convert
        here in this problem , we will get the number and number base  ,and that number we need to convert into a decimal number
        suppose number is given 1172 of base 8 and we need to convert to its decimal equvalent i.e 634
        what ? how ? code ? we will check
        the given number 8 ka base and we need to go to 10 ka number that 10 ka base pe
        so its simple
        10 se divide karnge and reminder nikalte jayenge
        jub tuk number 0 na ho jaye
        10|1172
        10|117|2 reminder => 2*8 of 0
        10|11|7 reminder => 7*8 of 1
        10|1|1 reminder => 1*8 of 2 ( 8 ka power 2 se multiply karenge )
        10|0|1 reminder => 1*8 of 3

       amd will add the number
       2+ 56+ 64+ 512 = 634
       so for 1172 base of 8 ka decimal is 634
        Now will focus on code
         */
        int pow = 1;
        int rev = 0;
        //base is 8 here now for the given number
        while (num > 0) {

            int dig = num % 10;//1172 => 2, 7 , 1 , 1

            num = num / 10;//1172 ==> 117, 11 ,1 , 0

            rev += dig
                            * pow;// 2* 1(8 of 0 is 1 ) = 2 *1 =2+, 7 * 8=56+, 1 * 64=64+, 1 * 512 = 512 => 2+56+64+512= 634
            pow = pow * base;//1 * 8 = 8 , 8 * 8 = 64  , 64 * 8 = 512

        }
        // System.out.println("Given number is : "+ num + "and base is : "+base);
        System.out.println("Any base to Decimal of given number is :" + rev);

    }
}
