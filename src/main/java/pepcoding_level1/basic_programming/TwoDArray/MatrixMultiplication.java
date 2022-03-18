package pepcoding_level1.basic_programming.TwoDArray;

import java.util.Scanner;

/**
 * Link :
 * https://www.pepcoding.com/resources/online-java-foundation/2d-arrays/matrix_multiplication/topic
 * <p>
 * Matrix Multiplication
 * <p>
 * Input Format
 * A number n1
 * A number m1
 * e11
 * e12..
 * e21
 * e22..
 * .. n1 * m1 number of elements of array a1
 * A number n2
 * A number m2
 * e11'
 * e12'..
 * e21'
 * e22'..
 * .. n2 * m2 number of elements of array a2
 * <p>
 * Output Format
 * e11' e12' e13' ..
 * e21' e22' e23' ..
 * .. elements of prd array
 */
public class MatrixMultiplication
{
    public static void main (String[] args)
    {
        //taking input
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();//taking rows
        int m1 = sc.nextInt();//taking columns

        //forming 2d Array
        int[][] arr1 = new int[n1][m1];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        int n2 = sc.nextInt();//taking rows
        int m2 = sc.nextInt();//taking columns

        //forming 2nd matrix for multiplication
        int[][] arr2 = new int[n2][m2];

        //filling the 2nd array
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < m2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        //now we need to do the multiplication
    }
}
