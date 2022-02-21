package pepcoding_level1.basic_programming.getting_started;

import java.util.Scanner;

public class RotateNumber
{

    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number that you want to rotate :");
        int n = scanner.nextInt();//jisko rotate karna hai
        System.out.println("Enter the number of times that you want to rotate ::");
        int k = scanner.nextInt();//jitne se rotate karna hai
        System.out.println("rotation of given number :" + n);
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
        /*
        here number is 1234
        rotate karna hai 2 se then answer is 3412
        n= 1234
        k =2
         */
        int div = 1;
        int multiplier = 1;
        for (int i = 1; i <= digit; i++) {
            if (i <= k) {
                div = div * 10;//100
            }
            else {
                multiplier = multiplier * 10;//10*10 =100
            }
        }
        /*
           1234/100 = > 1234 is actual number , 100 is divider
           quotient = 12
           reminder =34
           rotateN= (34*100)+12 ==> 3400+12 ==> 3412 (final answer)
         */
        int quotient = n / div;// 1234/100 =>12
        int reminder = n % div;// 1234%100 =>34

        int rotateN = reminder * multiplier + quotient; // 34 * 100 =>3400 + 12 => 3412 final answer

        System.out.println("After rotation number is : " + rotateN);

    }
}
