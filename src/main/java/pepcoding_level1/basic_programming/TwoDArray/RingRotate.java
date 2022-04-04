package pepcoding_level1.basic_programming.TwoDArray;

import java.util.Scanner;

/**
 * Ring Rotate
 * Link :
 * https://www.pepcoding.com/resources/online-java-foundation/2d-arrays/ring_rotate/topic
 */
public class RingRotate
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        //declaring 2 D array
        int[][] arr = new int[n][m];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int rotate = sc.nextInt(); //now of time we need to rotate , anti clock wise if positive ,clock wise if negative
        int shell = sc.nextInt(); //which shell need to be rotated

        rotateShell(arr,
                    rotate,
                    shell);
        display(arr);

    }

    private static void display (int[][] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void rotateShell (int[][] arr,
                                     int rotate,
                                     int shell)
    {
        // step 1: first convert shell to 1 D array
        int[] oneDArray = fillOneDArrayFromShell(arr,
                                                 shell);
        //step 2 : rotate 1 D array
        rotateOneDArray(oneDArray,
                        rotate);
        //fill shell from  1 D array
        fillShellFromOneD(arr,
                          shell,
                          oneDArray);
    }


    private static int[] fillOneDArrayFromShell (int[][] arr,
                                                 int shell)
    {

        int minr = shell - 1;
        int minc = shell - 1;
        int maxr = arr.length - shell;
        int maxc = arr[0].length - shell;
        //int size = lw + bw + rw +tw -4; we are subtracting 4 beacasue each corner will be coming 2 times , so each corner number will become
        //duplicate , then we need to remove 1 duplicate number from each corner , total 4 element we need to remove from the one d array size.
        /*
        left wall = minr to max row

         */
        int size = 2 * (maxr - minr + maxc - minc);
        //now we got the total size then we can declare the one d array
        int[] oneD = new int[size];

        // now we need to go leftwall, bottom wall , right wall , top wall
        //left wall
        int idx = 0;
        for (int i = minr, j = minc; i <= maxr; i++) {
            oneD[idx] = arr[i][j];
            idx++;
        }

        //bottom wall
        for (int i = maxr, j = minc + 1; j <= maxc; j++) {
            oneD[idx] = arr[i][j];
            idx++;
        }
        //right wall
        for (int i = maxr - 1, j = maxc; i >= minr; i--) {
            oneD[idx] = arr[i][j];
            idx++;
        }
        //top wall
        for (int i = maxr, j = maxc - 1; j >= minc + 1; j--) {
            oneD[idx] = arr[i][j];
            idx++;
        }
        return oneD;
    }

    private static void fillShellFromOneD (int[][] arr,
                                           int shell,
                                           int[] oneD)
    {

        int minr = shell - 1;
        int minc = shell - 1;
        int maxr = arr.length - shell;
        int maxc = arr[0].length - shell;

        // now we need to go leftwall, bottom wall , right wall , top wall
        //left wall
        int idx = 0;
        for (int i = minr, j = minc; i <= maxr; i++) {
            arr[i][j] = oneD[idx];
            idx++;
        }

        //bottom wall
        for (int i = maxr, j = minc + 1; j <= maxc; j++) {
            arr[i][j] = oneD[idx];
            idx++;
        }
        //right wall
        for (int i = maxr - 1, j = maxc; i >= minr; i--) {
            arr[i][j] = oneD[idx];
            idx++;
        }
        //top wall
        for (int i = maxr, j = maxc - 1; j >= minc + 1; j--) {
            arr[i][j] = oneD[idx];
            idx++;
        }
    }


    private static void rotateOneDArray (int[] arr,
                                         int rotate)
    {

        //handling edge case and negative case
        rotate = rotate % arr.length;
        if (rotate < 0) {
            rotate = rotate + arr.length;
        }
        // we need to write the code for rotate 1 d array
        // array will be given and number of time we need to rotate will be given
        /*
        example
        1 2 3 4 5 6
        rotate = 2 //rotate by 2
        1 2 3 4 | 5 6
        // reverse 1 2 3 4 and reverse 5 6
        1 2 3 4 => 4 3 2 1
        5 6 = 6 5
        //now reverse entire array
        4 3 2 1 | 6 5 OR 4 3 2 1 6 5
        4 3 2 1 6 5  => reverse will become 5 6 1 2 3 4
         */
        int startIndex = 0;
        int lastIndex = arr.length - 1;
        int firstPart = (arr.length - 1)
                        - rotate; // 0 to till arr.length - rotate => 6 - 2 = 4 //then 0 to 3
        int secondPart = arr.length
                        - rotate;// rotation part , if rotation is 2 then arr.length - rotate => 6 -2 = 4 , then 4 index to till last index of array
        //reverse 1st part till
        reverseArray(arr,
                     startIndex,
                     firstPart);

        //reverse 2nd part
        reverseArray(arr,
                     secondPart,
                     lastIndex);

        //reverse entire array
        reverseArray(arr,
                     startIndex,
                     lastIndex);
    }

    private static void reverseArray (int[] arr,
                                      int i,
                                      int j)
    {
        int li = i; //left index
        int ri = j;//right index
        // we will swap the element to reverse the array till left index is less then right index
        while (li < ri) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
