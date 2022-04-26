package pepcoding_level1.basic_programming.TwoDArray;

import java.util.Scanner;

/**
 * Wave Traversal
 * Link :
 * https://www.pepcoding.com/resources/online-java-foundation/2d-arrays/the_state_of_wakanda_1/topic
 */
public class WaveTraversal
{
    public static void main (String[] args)
    {
        //taking the input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        //forming 2D array with given row and column input
        int[][] arr = new int[n][m];
        //filling 2D array matrix
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        //printing
        for (int j = 0; j < arr[0].length; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i][j]);
                }
            }
            else {
                for (int i = arr.length-1; i >= 0; i--) {
                    System.out.println(arr[i][j]);
                }
            }
        }

    }
}
