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

        for(int i = 0;i <arr.length;i++) {
            for(int j=0;j<arr[0].length;j++) {

            }
        }
    }
}
