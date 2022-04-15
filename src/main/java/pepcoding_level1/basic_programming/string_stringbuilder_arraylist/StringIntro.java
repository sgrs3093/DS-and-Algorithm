package pepcoding_level1.basic_programming.string_stringbuilder_arraylist;

import java.util.Scanner;

/**
 * String Introduction
 */
public class StringIntro
{
    /*
    Deeclarationn
    memory
    i/p
    o/p
    CA charAt() ; to find thee character at given point
    length
    Substring
     */
    public static void main (String[] args)
    {
        String s = "hello";
        Scanner scanner = new Scanner(System.in);
       /* String s1=scanner.next();
        String s2=scanner.next();*/

        // String s1 = scanner.next();
        //String s2=scanner.next();//reads till first space delimeter i.e sagar sag o/p will be sagar only
        String s3 = scanner.nextLine();//reads the whole line of string including the space

        System.out.println(s3);
        System.out.println(s3.length());//for finding the string length
        //System.out.println(s2);

        s3.charAt(0);//to find the character inn String
        //sub string in String
        String subString = "abcd";//0,1,2,3 total 4 character
    }
}
