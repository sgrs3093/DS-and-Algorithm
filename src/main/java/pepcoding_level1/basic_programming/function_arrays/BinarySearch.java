package pepcoding_level1.basic_programming.function_arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Binary Search algorithm for data search
 */
public class BinarySearch
{
    public static void main (String[] args) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int arr[] = new int[n];
        //filling the array with element
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(bf.readLine());
        }
        //taking one input so search in given array
        int d = Integer.parseInt(bf.readLine());

        //calling binarySearch
        binarySearch(arr,
                     d);
    }

    /**
     * Here we need to search the element using Binary search algorithm
     * <p>
     * Binary search algo is much faster than traditional linear search algorithm
     *
     * @param arr
     * @param d
     */
    private static void binarySearch (int[] arr,
                                      int d)
    {
        // we need to sort the array as binary search is always working in sorted array
        Arrays.sort(arr);
        //first we need to take two pointer i.e low and high
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            //while low is equal or less than high
            //need to find mid
            int mid = low + high / 2;

            //if finding data is less than mid then we need to discard the all the elements after mid +1
            //10 20 30 40 50 60 70 , d= 20
            if (d < arr[mid]) {
                high = mid - 1;
            }
            /* if finding data is grater than mid then we need to discard the all the elements after mid-1 */
            else if (d > arr[mid]) {
                low = mid + 1;
            }
            else {//if d is equal to mid , d==mid then return and print
                System.out.println("Data is find at index: " + mid);
                return;
            }
        }
        System.out.println("Data is not find in array :" + -1);

    }
}
