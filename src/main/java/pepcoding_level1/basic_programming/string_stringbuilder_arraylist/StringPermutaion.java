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
public class StringPermutaion
{
    private String printPermutation (String name)
    {
        /**
         * here we need to find the permutation
         *
         */

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

    }

    static void getString ()
    {
        Scanner scanner = new Scanner(System.in);
        scanner.next();

    }

}
