package pepcoding_level1.basic_programming.function_arrays;

import java.util.Scanner;

/**
 * Digit Frequency
 * Given a number n, and a digit d, you are required to calculate the frequency of digit d in number n.
 */
public class DigitFrequency
{

    public static int getInput ()
    {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void main (String[] args)
    {
        printPattern();
        System.out.println("Second approach :");

        int n = getInput();
        int d = getInput();
        int frqDigit = 0;
        while (n > 0) {
            int dig = n % 10;//Extract digit
            if (dig == d) {//check if the digit and matching digit is same then increase the count
                frqDigit++;
            }
            //number chota kar do
            n = n / 10;//Devide n by 10 ..(for number chota karne k liye)
        }
        System.out.println("Total digit : " + frqDigit);
    }

    static void printPattern ()
    {
        //number
        int n = getInput();
        //digit
        int d = getInput();
        // n= 1234

        // Step 1 : first count the digit
        int temp = n;
        int count = 0;
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }
        System.out.println("Total number count in given number is : " + count);
        //print the digit one by one

        int pow = (int)Math.pow(10,
                                count - 1);
        //printing the number 1 by 1 from right side
        /*
        Step 2
        suppose number is 12345 then
        will print
        1
        2
        3
        4

        Step 3 :
        and will check if the given digit is present in the number then will calculate the count
        of the digit

         */
        int digitFrequency = 0;
        System.out.println("Printing digit of the number 1 by 1 ");
        while (pow > 0) {

            int dig = n / pow;
            if (dig == d) {
                digitFrequency++;
            }

            System.out.println(dig);
            n = n % pow;
            pow = pow / 10;
        }

        System.out.println("Total Digit frequency of the given digit is : " + digitFrequency);
    }

}
