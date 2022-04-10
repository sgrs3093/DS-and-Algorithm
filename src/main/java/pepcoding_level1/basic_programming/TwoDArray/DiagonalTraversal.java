package pepcoding_level1.basic_programming.TwoDArray;

import java.util.Scanner;

/**
 * LINK:
 * https://www.pepcoding.com/resources/online-java-foundation/2d-arrays/the_state_of_wakanda_2/topic
 */
public class DiagonalTraversal
{
    /*
    Remember that the matrix is a square matrix i.e number of rows = number of columns.
     */
    public static void main (String[] args)
    {
        //taking input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //forming 2d array
        int[][] arr = new int[n][n];

        //filling the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

    }

    public static void display (int[][] arr)
    {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }

    static void print2DArrayInDiagonalTraversal (int[][] arr)
    {
        //now we need to print the array in diagonal

        // here we need to print with Gap wise
        //for each diagonal we have Gap of between row and column is 01 then 02 , 03 , 04 like that
        /*
        for 1st diagonal we have gap of 00 -> 00 11 22 33 44
        2nd diagonal we have 01 -> 01 12 23 34
        3nd diagonal we have 02 -> 02 13 24
        for each
         */

        for (int gap = 0; gap < arr.length; gap++) {
            for (int i = 0, j = 0; j <= arr[0].length; i++, j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
