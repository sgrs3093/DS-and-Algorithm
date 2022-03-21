package pepcoding_level1.basic_programming.TwoDArray;

import java.util.Scanner;

public class SpiralDisplay
{
    public static void main (String[] args)
    {
        //taking the input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

    }
}
