package pepcoding_level1.basic_programming.function_arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * First and Last Index
 * Link :
 * https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/first_and_last_index/topic
 * <p>
 * Input Format
 * A number n
 * n1
 * n2
 * .. n number of elements
 * A number d
 * <p>
 * Output Format
 * A number representing first index
 * A number representing last index
 * <p>
 * Sample Input
 * 15
 * 1
 * 5
 * 10
 * 15
 * 22
 * 33
 * 33
 * 33
 * 33
 * 33
 * 40
 * 42
 * 55
 * 66
 * 77
 * 33
 * <p>
 * Sample Output
 * 5
 * 9
 * Explanation : So here we will have sorted array of numbers with duplicate as well
 * above number has around 15 elements in that array
 * and data is given 33 to find out the FIRST and LAST index of 33
 * so 33 starting index i.e first index is
 */
public class FirstAndLastIndex
{
    public static void main (String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //taking input
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        int d = Integer.parseInt(br.readLine());
        firstIndex(a,d);
        lastIndex(a,d);
    }

    public static void firstIndex (int arr[],
                                   int d)
    {

        int low = 0;
        int high = arr.length - 1;
        int firstIndex = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (d < arr[mid]) {
                high = mid - 1;
            }
            else if (d > arr[mid]) {
                low = mid + 1;
            }
            else {
                firstIndex = mid;
                high = mid - 1;
            }
        }
        System.out.println("First Index: " + firstIndex);
    }

    public static void lastIndex (int arr[],
                                  int d)
    {
        int low = 0;
        int high = arr.length - 1;
        int lastIndex = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (d < arr[mid]) {
                high = mid - 1;
            }
            else if (d > arr[mid]) {
                low = mid + 1;
            }
            else {
                lastIndex = mid;
                low = mid + 1;
            }
        }
        System.out.println("Last Index: " + lastIndex);
    }
}
