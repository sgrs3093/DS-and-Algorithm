package pepcoding_level1.basic_programming.TwoDArray;

import java.util.Scanner;

/**
 * Exit point of matrix
 * Link :
 * https://www.pepcoding.com/resources/online-java-foundation/2d-arrays/exit_point_of_a_matrix/topic
 */
public class ExitPointOfMatrix
{
    public static void main (String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];

        //will fill the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int i = 0;
        int j = 0;
        int dir = 0; //East=0, south=1, west=2, north = 3
        //now we need to solve the problem
        while (true) {
            dir = (dir + arr[i][j]) % 4; //To Keep the values between 0 and 3
            if (dir == 0) {
                j++;//Move in the same row (east direction)
            }
            else if (dir == 1) {
                i++;//Move down the column (south direction)
            }
            else if (dir == 2) {
                j--; //Move backwards in the row (west direction)
            }
            else if (dir == 3) {
                i--; //Move up the column (north direction)
            }

            if (i < 0) {
                i++; //exit point is one row ahead so making i++ so inplace of -1 it will be 0
                break;
            }
            if (j < 0) {
                j++;//exit point is one col ahead (in 0th col)
                break;
            }
            if (i > arr.length) {
                i--;//exit point is one row back (in last row)
                break;

            }
            if (j > arr[0].length) {
                j--;//exit point is one col back (in last col)
                break;
            }
        }
        //finally, printing the index of exit point of the matrix

        System.out.println(i);
        System.out.println(j);
    }
}
