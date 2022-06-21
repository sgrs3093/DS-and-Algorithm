package pepcoding_level1.basic_programming.string_stringbuilder_arraylist;

import java.util.Scanner;

/**
 * String Introduction
 *
 * Link : https://www.pepcoding.com/resources/online-java-foundation/string,-string-builder-and-arraylist/string_interning_immutability/topic
 */
public class StringIntro
{
    /*
    Declaration
    memory
    i/p
    o/p
    CA charAt() ; to find the character at given point
    length
    Substring
     */
    /*
    <p></p>
    Interning : what is interning in String class
    String s1="hello";
    String s2="hello";
    String s3=new String("hello");
    what :s1 and s2 will point to same instance of hello..
    why:  why we are doing , to save the space
    Implication: in case of new String address will not be same
    s1==s2//true
    s1==s3//false
    always use .equals() method for content checking
    == dont use for content checking it will check the address
    what is Immutability : we can't change the instance ,
    reference we can change but instance we cant change
    i.e char c = string.charAt(0)//here we will get the char of the staring index,
    but we can't change the char in string i.e string.setCharAt(0) = 'd'// we can assign d at 0th place
    Reference is Mutable but Instance is not
    Why they have made the immutability , to not give surprise to developer
    I am explaining here , interning is allowed in String i.e s1 and s2 is pointing to same instance
    to save the space in memory for same content
    and immutability they have given to not change the instance, why, because suppose s1 change the content of hello to helloji
    the s2 will automatically change with surprise to developer !!
    so they have made the String as immutability.

    what is impact of Immutability :
    --------------
    Because of String Immutability String performance got question , performance got slow .

   We will see one example of that

   String s= "";//blank String
   for(int i=0;i<100;i++){//by looking this time complexity is look like O(n) but its not O(n) its O(n2) n square
   s+=i;
   }
    In Loop every time we are adding the i'th value
    S= s+0;//"0"
    s= s+1//"01"
    s= s+2//"03" so forth and so on
    so every time in memory for every concatenation new string instance will be created like with, 0 , 01, 02 , 03 so on
    and s will be pointing every time to new concatenated string instance with new address and existing one will collect by garbage
    collector
    every time at new spot new string will create by copying earlier string
    s="hello"
    s+='a';
    here s is adding "a" in hello
    then first hello will be created then at next place hello will be copied first then "a" will be added
    hello will be new instance address will be created and s will point to new instance

    Because of above issue we will be using String Builder for better performance
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
        printAllSubstringOfABCD();
    }

    //we will print all the substring of abcd
    static void printAllSubstringOfABCD ()
    {
        String sub = "abcd";

        //this will print all the substring
        for (int i = 0; i < sub.length(); i++) {
            for (int j = i + 1; j <= sub.length(); j++) {
                System.out.println(sub.substring(i,
                                                 j));
            }
        }
    }
}
