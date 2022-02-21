package pepcoding_level1.basic_programming.function_arrays;

import java.util.Scanner;

/**
 * AnyBaseTOAnyBase
 * <p>
 * Problem Link : https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/any_base_to_any_base/topic
 * <p>
 * You are given a number n.
 * You are given a base b1. n is a number on base b.
 * You are given another base b2.
 * You are required to convert the number n of base b1 to a number in base b2.
 * <p>
 * Input Format:
 * A number n
 * A base b1
 * A base b2
 * <p>
 * Output Format:
 * A number of base b2 equal in value to n of base b1
 */
public class AnyBaseTOAnyBase
{

    public static int getInput ()
    {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void main (String[] args)
    {

    }

    /**
     * Here we will convert number to anybase to any base
     * so 1st rule is to convert any number to any base
     * We will convert then number decimal
     * then that decimal number will convert to any base
     */
    public static void anybaseToanybase ()
    {
        int n = getInput();
        int givenBase = getInput();
        int destBase = getInput();
        int dec =getValueInDecimal(n,givenBase);
        getValueInBase(dec,destBase);
    }

    static int getValueInDecimal (int n, int base)
    {
        // we will convert number to decimal
        //to convert the number to decimal we will divide the number by 10 and will take all the reminder

        int rev = 0;
        int pow = 1;
        while(n>0){
            /*
            1234%10
            10|1234
            10|123|4
            10|12 |3
            10|1  |2
            10|0  |1

             4 3 2 1  ==> 1 2 3 4
             */
            int dig = n%10;
            n = n/10;
            rev+=dig * pow;
            pow = pow * 10 ;

        }
        return rev;


    }

    static void getValueInBase (int n, int dest)
    {


    }
}
