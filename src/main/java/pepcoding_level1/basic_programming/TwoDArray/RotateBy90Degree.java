package pepcoding_level1.basic_programming.TwoDArray;

import java.util.Scanner;

/**
 * Rotate By 90 degree
 * Link : https://www.pepcoding.com/resources/online-java-foundation/2d-arrays/rotate_by_90_degrees/topic
 */
public class RotateBy90Degree
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //row and column will be same
        int arr[][] = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        //step will take transpose of the matrix
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        //once the transpose is been formed then we need to reverse row by row
        for (int i = 0; i < arr.length; i++) {
            int li = 0;
            int ri = arr[i].length - 1;

            while (li < ri) {
                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;
                li++;
                ri--;
            }
        }

        display(arr);
    }

    private static void display (int[][] arr)
    {
        //now we need to display the matrix
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
