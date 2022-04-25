package pepcoding_level1.basic_programming.string_stringbuilder_arraylist;

import java.util.Scanner;

/**
 * Problem Name : String Compression
 * <p>
 * Sample Input
 * wwwwaaadexxxxxx
 * <p>
 * Sample Output
 * 1st Compression : wadex
 * 2nd Compression w4a3dex6
 */
public class StringCompression
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String value = sc.next();
        firstCompression(value);
        secondCompression(value);
    }

    /**
     * Basically we need to print single character for each string , if the next string is same the we
     *
     * @param value =  aabbccdd
     * output : abcd
     */
    static void firstCompression (String value)
    {

        /*
         first I  will take 1st character then loop will be starting from i=1 and
         each time will take the next character and compare with previous character
        if they are same we will not add to answer else we will add
         */
        String ans = String.valueOf(value.charAt(0));

        for (int i = 1; i < value.length(); i++) {
            char presentChar = value.charAt(i);
            char previousChar = value.charAt(i - 1);

            if (presentChar != previousChar) {
                ans += String.valueOf(presentChar);
            }
        }
        System.out.println("First comparison , exp =>  aabbccdd will be abcd, output is : { " + ans
                                           + "}");

    }

    /**
     * Input : aaabbbccdeeee
     * Output : a3b3c2d1e4
     *
     * @param value
     */
    static void secondCompression (String value)
    {
        /*
            Approach :
            suppose we got the input equal to : aaabbbccdd
            then wil start going through the loop and will take the answer variable and will add the first character of the input
            i.e ans = a, and count = 1;
            and will check the current char to previous character if they are same then we will increase the count
         */
        String ans = String.valueOf(value.charAt(0));
        int count = 1;
        for (int i = 1; i < value.length(); i++) {
            char curr = value.charAt(i);
            char prev = value.charAt(i-1);

            if (curr == prev) {
                count += 1;
            }
            else {
                ans += count + String.valueOf(curr);
                count = 1;
            }
        }
        ans += count;
        System.out.println("Second comparison , exp =>  aaabbbccdd will be a3b3c2d2, output is : { "
                                           + ans + "}");
    }
}
