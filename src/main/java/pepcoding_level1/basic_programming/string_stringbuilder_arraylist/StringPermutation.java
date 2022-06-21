package pepcoding_level1.basic_programming.string_stringbuilder_arraylist;

import java.util.Scanner;

/**
 * https://www.pepcoding.com/resources/online-java-foundation/string,-string-builder-and-arraylist/print-all-permutations-of-a-string-iteratively-official/ojquestion
 * Here we need to find the all the permutation of the given String
 * Example :
 * abc String given
 * Permutation combination of the given abc will be
 * abc
 * bac
 * cab
 * bca
 * acb
 * cba
 * <p>
 * So above we find 6 permutation of the String which is length is 3
 * that gives the idea about that the permutation of the String is hidden between 6 of length i.e. 0,1 ,2 , 3, 4, 5
 */
public class StringPermutation
{
    private static String printPermutation (String name)
    {
        int len = name.length();
        /**
         * here we need to find the permutation
         *1) find the factorial till the String length
         *2) loop through the number from 0 to till the length of the factorial
         *3) for each number we need to divide it by String length i.e. 3 then 2 , 1 to find the index/value of the String to print the
         * combination.
         *
         */

        //find the factorial of "abc" -  3! = 6
        int fact = factorial(name);
        // then we need to loop through the factorial

        for (int i = 0; i < fact; i++) {
            //taking temp value as i as we will be dividing it to get the index of the string , so will not modify the actual String
            int temp = i;
            //taking String builder as we need to delete the char within
            StringBuilder sb = new StringBuilder(name);
            /**
             * will take the loop for division of the number
             * i.e. if String length is 3 then will take the divisor 3 ,2,1 as we require the value/index/reminder within 0 to 3
             * so, will be dividing the i'th number by divisior in loop to get the index
             */
            for (int div = len; div >= 1; div--) {
                //finding the quotient and reminder
                int quo = temp / div;
                int rem = temp % div;

                //will print the reminder
                System.out.print(sb.charAt(rem));
                //will delete the character at given index to not print again
                sb.deleteCharAt(rem);
                //will assign quotient to temp for further index
                temp = quo;
            }
            System.out.println();
        }
        return "";
    }

    static int factorial (String value)
    {
        int length = value.length();
        int val = 1;
        for (int i = 2; i <= length; i++) {
            val *= i;
        }
        return val;
    }

    public static void main (String[] args)
    {
        String val = getString();
        printPermutation(val);

    }

    static String getString ()
    {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();

    }

}
