package pepcoding_level1.basic_programming.function_arrays;

import java.util.Scanner;

public class DecimalToAnyBase
{

    public static int getInput ()
    {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void main (String[] args)
    {
        decimalToAnyBase();
    }

    /**
     * Here we will be getting two input
     * 1) decimal number
     * 2) number in which we need to convert
     */
    static void decimalToAnyBase ()
    {
        int n = getInput();
        int base=getInput();
        int num = n;

        /*
        we got the number and also base number to convert in which
        so we know the rule that base number will devide the number
        until number become 0
        then each reminder will be will added from right side
        ex-
        number= 634
        base = 8
        8|634
        8|79|2
        8|9|7
        8|1|1
        8|0|1
        here we are dividing the number from base number and 8 is base and 634 is actual number
        so we are dividing the number until quotient/number become 0
        so after dividing the number total reminder we get is 2,7,1,1
        so in decimal to any base conversion we opposite the total number
        2 7 1 1 ===> will become 1 1 7 2  of base 8
        so (634) of 10 (decimal to octal is ) (1172) of base 8
        (634) 10 ====> (1172) 8
         */

        int reverse = 0;
        //will code now
        int power = 1; //10 the power of 0 is 1
        while (num > 0) {
            int dig = num % base;
            //we got the first digit that umber will go to right most corner
            num = num / base;//number ko chota kar dege
            reverse += dig * power;// REVERSE ME ADD KAR DENGE (WILL BE ADDING THE NUMBER IN REVERSE)
            //now next reminder will come to left , so will multiply with power with 10
            power = power * 10;
        }
        System.out.println("Decimal number " + n + " to base final output is : " + reverse);

    }
}
