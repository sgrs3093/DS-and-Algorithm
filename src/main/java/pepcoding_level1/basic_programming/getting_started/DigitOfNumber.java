package pepcoding_level1.basic_programming.getting_started;

import java.util.Scanner;

/**
 * Digits Of A Number
 * <p>
 * 1. You've to display the digits of a number.
 * 2. Take as input "n", the number for which digits have to be displayed.
 * 3. Print the digits of the number line-wise.
 * <p>
 * Input : 65784383
 * <p>
 * output :
 * 6
 * 5
 * 7
 * 8
 * 4
 * 3
 * 8
 * 3
 */
public class DigitOfNumber
{

    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        //finding number of digit first
        int temp = n;

        int countDigit = 0;
        //first get the total digit of the number
        while (temp != 0) {
            /*
            //dividing number by 10 , will give total digit ,
             (every time will decide and the quotient will store in temp itself it will sort the number by 1 every time
             */
            temp = temp / 10;

            countDigit++;
        }

        //now we need to make divisor

        int divisor = (int)Math.pow(10,
                                    countDigit - 1);

        while (divisor != 0) {
            /*
            754 ka quotient nikal lenge aur print kar denge
             754 / 100 => quotient = 7
             will print the 7
             */
            int quotient = n / divisor; // finding quotient and printing it
            System.out.println(quotient);
            //Number ko chota kar denge
            /*
             754 => 754%100 ==> n = 54
             */
            n = n % divisor; // sorting the number by one every time , by taking the reminder (number ko chota kar denge )
            /*
            divisor ko chota kar denge
            100 se 10 ==> 10 => 1
             */
            divisor = divisor / 10; // also divisor get reduce,
        }
    }
}
