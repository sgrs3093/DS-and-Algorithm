package pepcoding_level1.basic_programming.function_arrays;

import java.util.Scanner;

/**
 * SubSet Of Array
 * Link :
 * https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/subsets_of_array/topic
 *
 * Example
 *
 * For Array = {10, 20, 30}, there will be 2n (= 23) Subsets/Subsequences:
 *
 * - - -
 *
 * - - 30
 *
 * - 20 -
 *
 * - 20 30
 *
 * 10 - -
 *
 * 10 - 30
 *
 * 10 20 -
 *
 * 10 20 30
 */
public class SubSetArray
{

    public static void main (String[] args)
    {
        //taking input

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int limit = (int)Math.pow(2,
                                  arr.length);

        for (int i = 0; i < limit; i++) {
            //convert i to binary and use 0's and 1's to know if to print the element or not

            String subset = "";
            int temp = i;
            for (int j = arr.length - 1; j >= 0; j--) {


                int rem = temp % 2;
                temp = temp / 2;

                //then we dont need to print the element else we need to print the element
                if (rem == 0) {
                    subset =    "-\t" +subset;
                }
                else {
                    subset =  arr[j]+  "-\t" +subset;
                }
            }
            System.out.println(subset);
        }

    }
}
