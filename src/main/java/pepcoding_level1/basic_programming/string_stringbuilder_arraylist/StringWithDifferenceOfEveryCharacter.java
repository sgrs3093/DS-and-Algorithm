package pepcoding_level1.basic_programming.string_stringbuilder_arraylist;

import java.util.Scanner;

/**
 * https://www.pepcoding.com/resources/online-java-foundation/string,-string-builder-and-arraylist/string-with-difference-of-every-two-consecutive-characters-official/ojquestion
 */
public class StringWithDifferenceOfEveryCharacter
{
    public static void main (String[] args)
    {
        Scanner scn = new Scanner(System.in);
        String word = scn.next();
        System.out.println(getDifferenceOfCharacter(word));
    }

    /**
     * For "abecd", the answer should be "a1b3e-2c1d", as
     * 'b'-'a' = 1
     * 'e'-'b' = 3
     * 'c'-'e' = -2
     * 'd'-'c' = 1
     */
    static StringBuilder getDifferenceOfCharacter (String word)
    {
        char prev = word.charAt(0);
        //creating String builder as it is better for the performance
        StringBuilder sb = new StringBuilder();
        sb.append(word.charAt(0));

        for (int i = 1; i < word.length(); i++) {

            char prevChar = word.charAt(i - 1);
            char currChar = word.charAt(i);

            int diff = currChar - prevChar;
            if (currChar != prevChar) {
                sb.append(diff).append(currChar);
            }
        }

        return sb;

    }
}
