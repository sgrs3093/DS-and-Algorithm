package pepcoding_level1.basic_programming.string_stringbuilder_arraylist;

import java.util.Scanner;

/**
 * https://www.pepcoding.com/resources/online-java-foundation/string,-string-builder-and-arraylist/print_all_palindromic_substrings/topic
 */
public class PrintAllPalindromeSubString
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String val = sc.next();

        printAllPalindromeSubString(val);
    }

    static void printAllPalindromeSubString (String val)
    {
        for (int i = 0; i < val.length(); i++) {
            for (int j = i + 1; j <= val.length(); j++) {
                String subString = val.substring(i,
                                                 j);//we get all substring of the String
                // we will check if the substring is palindrom then we will print else not
                if (isPalindrome(subString)) {

                    System.out.print(subString);
                }
            }
            System.out.println();
        }

    }

    private static boolean isPalindrome (String subString)
    {
        int i = 0;
        int j = subString.length() - 1;

        while (i <= j) {
            char c = subString.charAt(i);
            char c1 = subString.charAt(j);
            if (c != c1) {
                return false;
            }
            else {
                i++;
                j--;
            }

        }
        return true;

    }
}
