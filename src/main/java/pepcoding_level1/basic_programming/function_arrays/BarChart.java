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
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = getInput();
        }
        /*
        here we need to print bar chart
        we have given the number like
        3
        2
        4
        so in each column we need to print that many *
                *
        *       *
        *   *   *
        *   *   *
        */

        //now first we need to find out max height of the building
        int max = arr[0];
        for(int i =0;i<n;i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        //now as we got the highest floor of the building now we need to run the loop for each floor

        /*

        5 -
        input
        3
        1
        5
        0
        4
                *
         		*
         *		*		*
         *		*		*
         *	*	*		*
         */
        for (int floor = max; floor >= 1; floor--) {
            //now for each floor we need to run the array and if the floor is same or grater then then we will print * else air
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= floor) {
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }
}
