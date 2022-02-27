package pepcoding_level1.basic_programming.function_arrays;

import java.util.Scanner;

/**
 * FindElement in Array
 * <p>
 * Input
 * A number n
 * n1
 * n2
 * .. n number of elements
 * A number d
 * <p>
 * Output
 * A number representing index at which d is found in array a and -1 if not found
 * Example
 * Sample Input
 * <p>
 * 6
 * <p>
 * 15
 * 30
 * 40
 * 4
 * 11
 * 9
 * <p>
 * 40
 * <p>
 * Sample Output
 * 2 ( we need to find the 40 , at which index it is present ) so out put index 2
 */
public class FindElementInArray
{

    public static int getInput ()
    {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void main (String[] args)
    {
        findElement();
    }

    static void findElement ()
    {

        /*
        getting input

         */
        int n = getInput();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = getInput();
        }
        int ele = getInput();

        // now we need to find the element
        for (int i = 0; i < n; i++) {
            if (arr[i] == ele) {
                //printing the index for corresponding element
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
        return;
    }
}
