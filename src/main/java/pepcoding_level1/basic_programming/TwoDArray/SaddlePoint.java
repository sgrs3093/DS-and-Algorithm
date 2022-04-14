package pepcoding_level1.basic_programming.TwoDArray;

import java.util.Scanner;

/**
 * Saddle Point
 * Link : https://www.pepcoding.com/resources/online-java-foundation/2d-arrays/saddle_price/topic
 * <p>
 * <p>
 * 3. The saddle price is defined as the least price in the row but the maximum price in the column of the matrix.
 * In ROW minimum and
 * In Column Maximum
 */
public class SaddlePoint
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            //1st we need to find least value for per row
            int svj = 0;// we take 00 as a least value/saddle value in the row
            for (int j = 1; j < arr[0].length; j++) {
                if (arr[i][j] < arr[i][svj]) {
                    svj = j;
                }
            }

            //now we need to travel in that whole column where we found the least value
            boolean flag = false;
            for (int k = 0; k < arr.length; k++) {//here rows getting change i.e k
                if (arr[k][svj]
                                > arr[i][svj]) {// and all row and same column value is comparing with least value of that column
                    flag = false;//if any of them got bigger then and flag will make as false
                    break;
                }
            }
            // if flag is true then that value is least in that row and in that column
            if (flag == true) {
                System.out.println(arr[i][svj]);
                return;
            }
            System.out.println("Invalid input");
        }

    }
}
