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
        char fc = value.charAt(0);

        for (int i= 1 ;i<value.length(); i++) {
            char presentChar = value.charAt(i);
            char previousChar= value.charAt(i-1);
        }

    }

    static void secondCompression (String value)
    {

    }
}
