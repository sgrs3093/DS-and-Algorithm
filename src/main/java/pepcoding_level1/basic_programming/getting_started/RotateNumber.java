package pepcoding_level1.basic_programming.getting_started;

import java.util.Scanner;

public class RotateNumber
{

    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//jisko rotate karna hai
        int k = scanner.nextInt();//jitne se rotate karna hai

        //number of digit nikalna hai

        int temp = n;
        int digit = 0;
        while (temp != 0) {
            temp = temp / 10;
            digit++;
        }
        //for maximum number like 550 time rotation
        k = k % digit;
        //for negative number
        if (k < 0) {
            k = k + digit;
        }
        int div = 1;
        int multiplier = 1;
        for (int i = 1; i <= digit; i++) {
            if (i <=k) {
                div = div * 10;
            }
            else {
                multiplier = multiplier * 10;
            }
        }
        int quotient = n / div;
        int reminder = n % div;

        int rotateN = reminder * multiplier + quotient;
        System.out.println(rotateN);
    }
}
