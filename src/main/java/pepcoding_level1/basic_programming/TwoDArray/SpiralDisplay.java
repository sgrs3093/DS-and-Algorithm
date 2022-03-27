package pepcoding_level1.basic_programming.TwoDArray;

import java.util.Scanner;

/**
 * Spiral display of matrix
 * <p>
 * https://www.pepcoding.com/resources/online-java-foundation/2d-arrays/spiral_display/topic
 */
public class SpiralDisplay
{
    public static void main (String[] args)
    {
        //taking the input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        //filling the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // will take min row , max row , min col , max col
        int minr = 0;
        int maxr = arr.length - 1;

        int minc = 0;
        int maxc = arr[0].length - 1;

        int totalElements = n * m;
        int count = 0;
        while (count < totalElements) {
            // this matrix we will print rectange wise until all the number get printed
            // we will have four wall
            //1 left wall
            //here row is getting incremented while going to down side
            for (int i = minr, j = minc; i <= maxr && count < totalElements; i++) {
                System.out.println(arr[i][j]);
                count++;
            }
            minc++;

            //2 bottom wall, here column wil get incremented and row will be same
            for (int j = minc, i = maxr; j <= maxc && count < totalElements; j++) {
                System.out.println(arr[i][j]);
                count++;
            }
            maxr--;

            //3 right wall, in this wall will be printing right most column , from down to up
            //here column will be same and row will get change
            for (int i = maxr, j = maxc; i >= minr && count < totalElements; i--) {
                System.out.println(arr[i][j]);
                count++;
            }
            maxc--;

            //4 upper wall
            //here row will be same and line will be comming from right most column to left column
            for (int j = maxc, i = minr; j >= minc && count < totalElements; j--) {
                System.out.println(arr[i][j]);
                count++;
            }
            minr++;
        }

    }
}
