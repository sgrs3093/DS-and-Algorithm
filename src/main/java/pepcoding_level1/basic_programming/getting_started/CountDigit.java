package pepcoding_level1.basic_programming.getting_started;

import java.util.Scanner;

/**
 * Count the total digit in Given number
 * Input : 123456789
 * O/p : total digit is : 9
 */
public class CountDigit
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int digit = 0;

        while (n != 0) {
            //number to chota karte hai ..i.e 123/10 will become 12 then =>1 =>0 like that
            // 123 ko 10 se devide karne pe quotient 12 aayega and 3 reminder aayega
            n = n / 10;
            digit++;
        }
        System.out.println("Total digit in given number is : " + digit);
    }
}
