package pepcoding_level1.basic_programming.TwoDArray;

import java.util.Scanner;

/**
 * Saddle Point
 * Link : https://www.pepcoding.com/resources/online-java-foundation/2d-arrays/saddle_price/topic
 *
 *
 3. The saddle price is defined as the least price in the row but the maximum price in the column of the matrix.
 In ROW minimum and
 In Column Maximum

 */
public class SaddlePoint
{
    public static void main (String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();

        int [][]arr =new int[n][n];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j]=scanner.nextInt();
            }
        }

    }
}
