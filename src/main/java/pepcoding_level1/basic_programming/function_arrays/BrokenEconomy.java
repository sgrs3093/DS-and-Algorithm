package pepcoding_level1.basic_programming.function_arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Broken Economy
 * <p>
 * Link :
 * https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/broken_economy/topic
 * <p>
 * Input Format
 * A number n
 * n1
 * n2
 * .. n number of elements
 * A number d
 * <p>
 * Output Format
 * A number representing ceil
 * A number representing floor
 */
public class BrokenEconomy
{

    public static void main (String[] args) throws IOException
    {
        //taking input
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(bf.readLine());
        }

    }
}
