package pepcoding_level1.basic_programming.function_arrays;

import java.util.Scanner;

/**
 * difference_of_two_arrays
 * <p>
 * https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/difference_of_two_arrays/topic
 * <p>
 * Input
 * A number n1
 * n1 number of elements line separated
 * A number n2
 * n2 number of elements line separated
 * <p>
 * Output
 * A number representing difference of two numbers (a2 - a1), represented by two arrays.
 * Example
 * Sample Input
 * 3
 * 2
 * 6
 * 7
 * 4
 * 1
 * 0
 * 0
 * 0
 * Sample Output
 * 7
 * 3
 * 3
 */
public class DifferentOfTwoArray
{
    public static int getInput ()
    {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void main (String[] args)
    {
        differentOFTwoArray();
    }

    /**
     * Here we will take two number
     * and we need to minus from 2nd number to 1st number
     */
    static void differentOFTwoArray ()
    {

        //taking input
        int n1 = getInput();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = getInput();
        }
        int n2 = getInput();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = getInput();
        }
        //now we need to write the logic for substraction
        int[] sub = new int[n2];//n2 will be bigger then n1 as sub=n2-n1;

        //as substraction will start from left most side then will take indexes from length-1 for both the number
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = sub.length - 1;
        int carry = 0;
        while (k >= 0) {
            /*
             1000
             -  1
             ----
              999
              -1
              111
               99
              ---
               12
              123
              - 1
              ----
              122

              111
                1
             -----
              110
             */
            int d = 0;

            int aval = i > 0 ? arr1[i] : 0;
            if (arr2[j] + carry >= aval) {
                d = arr2[j] - aval;
                carry = 0;
            }
            else {
                d = (arr2[j] + 10) - aval;
                carry = -1;
            }
            sub[k] = d;
            k--;
            i--;
            j--;
        }

        int p = 0;
        while (p < sub.length) {
            if (sub[p] == 0) {
                p++;
            }
            else {
                break;
            }
        }

        while (p < sub.length) {
            System.out.println(sub[p]);
        }

    }
}
