package pepcoding_level1.basic_programming.function_arrays;

import java.util.Scanner;

/**
 * Sum of two array
 * <p>
 * https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/sum_of_two_arrays/topic
 * Input
 * A number n1
 * n1 number of elements line separated
 * A number n2
 * n2 number of elements line separated
 * <p>
 * Output
 * A number representing sum of two numbers, represented by two arrays.
 * <p>
 * Sample Input
 * <p>
 * 5
 * ---
 * 3
 * 1
 * 0
 * 7
 * 5
 * ---
 * 6
 * ---
 * 1
 * 1
 * 1
 * 1
 * 1
 * 1
 * Sample Output
 * 1
 * 4
 * 2
 * 1
 * 8
 * 6
 */
public class SumOfTwoArray
{

    public static int getInput ()
    {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void main (String[] args)
    {
        sumOfTwoArray();
    }

    static void sumOfTwoArray ()
    {

        //taking input from user
        int n = getInput();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = getInput();
        }
        int n2 = getInput();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = getInput();
        }
        int[] arr3;
        if (n > n2) {
            arr3 = new int[n];
        }
        else {
             arr3 = new int[n2];
        }
         int len1 = arr1.length - 1;
        int len2 = arr2.length - 1;
        //now we need to add both array
        int carry = 0;
        int k = arr3.length-1;
        int i = len1;
        int j = len2;

        /*
        234
        234
        ---
        468
         */
        while (j >= 0 || i >= 0) {
            int d=carry;
            int a1 = arr1[i];
            int a2 = arr2[j];
            if(i>=0) {
                d=d+a1;
            }
            if(j>=0) {
                d=d+a2;
            }
            carry = d / 10;
            d = d % 10;
            arr3[k] = d;
            k--;
            i--;
            j--;
        }
        if(carry>0){
            System.out.println(carry);
        }
        for (int v: arr3
             ) {
            System.out.println(v);
        }

    }
}
