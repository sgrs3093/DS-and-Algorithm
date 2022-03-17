package pepcoding_level1.basic_programming.TwoDArray;

import java.util.Scanner;

/**
 * Link :
 * https://www.pepcoding.com/resources/online-java-foundation/2d-arrays/2d_arrays_demo/topic
 * <p>
 * 2 D Array Demo
 */
public class TwoDArrayDemo
{
    public static void main (String[] args)
    {
        //taking input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//taking rows
        int m = sc.nextInt();//taking columns

        //forming 2d Array
        int[][] arr = new int[n][m];

        //filling the array by taking the inputs
        for (int i = 0; i < n; i++) {
            /*
            forming the 2D array with 3 rows and 4 columns
            // 00 , 01 , 02 , 03
            // 10 , 11 , 12 , 13
            // 20 , 21 , 22 , 23
             */
            for (int j = 0; j < m; j++) { // 00 , 01 , 02 , 03
                arr[i][j] = sc.nextInt();
            }
        }

        //Printing the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                int val = arr[i][j];
                System.out.print(val + "\t");
            }
            System.out.println();
        }

    }
}
