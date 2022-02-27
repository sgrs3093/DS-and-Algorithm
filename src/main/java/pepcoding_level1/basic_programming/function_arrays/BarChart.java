package pepcoding_level1.basic_programming.function_arrays;

import java.util.Scanner;

/**
 * BarChart
 * <link>
 * https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/bar_chart/topic
 * </link>
 * 1. You are given a number n, representing the size of array a.
 * 2. You are given n numbers, representing elements of array a.
 * 3. You are required to print a bar chart representing value of arr a.
 * <p>
 * 5
 * 3
 * 1
 * 0
 * 7
 * 5
 * *
 * *	*
 * *	*
 * *		 *	*
 * *		 *	*
 * *	*	 * 	*
 */
public class BarChart
{

    public static int getInput ()
    {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void main (String[] args)
    {
        barChart();
    }

    static void barChart ()
    {

        int n = getInput();
        //taking input
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = getInput();
        }

    }
}
