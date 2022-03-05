package pepcoding_level1.basic_programming.function_arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Reverse an Array
 * <p>
 * Link : https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/rotate_an_array/topic
 */
public class ReverseArray
{
    public static void main (String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        reverse(a);
        display(a);
    }

    private static void display (int[] a)
    {
    }

    private static void reverse (int[] a)
    {
    }

}
