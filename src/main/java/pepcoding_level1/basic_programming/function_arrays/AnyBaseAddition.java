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

    /**
     * Here in this problem we are getting two number and their base
     * so here we need to add both number in their base
     *
     * step to do so :
     * 1) how are we adding the normal number
     * we start adding the numbers from right side by taking one number from both given number
     * exp :
     *  2 4 5
     *  4 5 2
     *  -------
     *  6 9 7
     *  --------
     *  total addition on above tow number is 697
     *  so like that we need to add the number in the given base
     *  suppose base is given as 8 so we are going to add the number in base 8
     *
     * carry+1 +1 +0
        *    2  4  5
        *    4  5  2
     *  ------------
     *      7    1  7
     *  5+2 = 7 so 7 <=8 then
     *  carry :  7/8 =>0
     *  value :  7%8 ==> 7
     *  then carry is here 0 then no number will push to left side number
     *  and value is 7 then will place 7 as part of 5+2 section
     *
     *  -> carry : 0+ 4 + 5 = 9
     *
     *  5+4 =>9 <= 8 , 9 is greater than 8 base
     *  so we need to find the carry and value
     *  carry :  9/8 =>1
     *  value :  9%8 ==> 1
     *  then carry is here 1 then 1 number will push to left side number as carry
     *  and value is 1 then will place 1 as part of 4+5 section
     *
     *  carry 1 +4+2 = 6 , 7<=8
     *  so here we dont have any carry to go
     *  carry : 7/8 = 0
     *  value : 7%8 = 7
     *
     * total addition of both number is base 8 is 7 1 7
     * we will run now our program with number
     * 2 4 5
     * 4 5 2
     * and base 8
     * and will see what is the output is comming out
     * is it is 717 then perfect else we will look again
     * congratulations ????
     *yeah we got the output correct
     * <b>
     * 245
     * 452
     * 8
     * Total addition of base values is : 717
     * </b>
     */
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
