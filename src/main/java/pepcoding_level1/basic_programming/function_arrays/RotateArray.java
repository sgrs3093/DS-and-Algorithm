package pepcoding_level1.basic_programming.function_arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Rotate an Array
 * Link : https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/rotate_an_array/topic
 */
public class RotateArray
{
    public static void main (String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());

        rotate(a,
               k);
        display(a);
    }

    private static void reverse (int a[],
                                 int i,
                                 int j)
    {
        int li = i;
        int ri = j;
        while (li < ri) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            li++;
            ri--;
        }

    }

    private static void display (int a[])
    {

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    private static void rotate (int a[],int k)
    {
        //part 1

        reverse(a,0,a.length-k-1);

        //part 2

        reverse(a,a.length-k,a.length-1);
        //all

        reverse(a,0,a.length-1);

    }
}
