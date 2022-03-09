package pepcoding_level1.basic_programming.function_arrays;

import java.util.Scanner;

/**
 * Sub array of Array
 * Link : https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/sub_arrays_of_an_array/topic
 * <p>
 * Sample Input
 * 3
 * 10
 * 20
 * 30
 * <p>
 * Sample Output
 * 10
 * 10	20
 * 10	20	30
 * 20
 * 20	30
 * 30
 */
public class SubArray
{

    public static int getInput ()
    {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void main (String[] args)
    {
        subArray();
    }

    /**
     * Input and output
     * 3 -> total number
     * 1
     * 2
     * 3
     * output :
     * 1
     * 1	2
     * 1	2	3
     * 2
     * 2	3
     * 3
     */
    static void subArray ()
    {
        //taking input
        int n = getInput();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = getInput();
        }

        //now we need to print the value
        /*
        here we will use two pointer technique
        initially i and j both wiil be at same pointer and second iteration
        j will move to next index and k will print the value till the J
        and once all the value will be printed then i will move to next pointer
        and j again will point to same position with i and j will then go till the last index to print all sub array till then
         */
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + "\t");
                }
                System.out.println();
            }
        }
    }
}
