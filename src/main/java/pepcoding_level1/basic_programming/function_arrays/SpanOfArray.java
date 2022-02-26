package pepcoding_level1.basic_programming.function_arrays;

import java.util.Scanner;

/**
 * Span of Array
 *
 * Link : https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/span_of_an_array/topic
 *
 * Input
 * A number n
 * n1
 * n2
 * .. n number of elements
 *
 * Output
 * A number representing max - min
 *
 * Sample Input
 *
 * 6
 * 15
 * 30
 * 40
 * 4
 * 11
 * 9
 * Sample Output
 * 36
 *
 * Here we will get the number and we need to find max and min of then
 * then after finding min and max we need to find the difference between them
 * so in above input max is 40 and min is 6
 * Max=40
 * Min=4
 * then difference between them means max-min => 40-6= 36
 */
public class SpanOfArray
{

    public static int getInput ()
    {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void main (String[] args)
    {
        //Input statement
        //getting the size of array
        int n =getInput();
        int[] arr=new int[n];

        //taking the numbers to fill the array
        for(int i=0;i<n;i++) {
            arr[i] =getInput();
        }

    }


}
