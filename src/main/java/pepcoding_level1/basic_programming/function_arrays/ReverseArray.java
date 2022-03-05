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
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    private static void reverse (int[] a)
    {
        int[] b = new int[a.length];
        //here we need to reverse the array
        int length = a.length - 1;// if length is 5 then 5-1 = 4 i.e 0 to 4 index
        int j = 0;
        // one way is to take one more array and reverse the existing array and store in B array
        for (int i = length; i >= 0; i--) {
            System.out.println(a[i]);
            b[j++] = a[i];
        }

        //Printing B array
        for (int i = 0; i < b.length; i++) {
            System.out.println("b array :" + b[i]);
        }

        // second way is to in same array without taking extra space in same array we can reverse it
        int x = 0;
        int y = a.length - 1;
        while (x < y) {
            int temp = a[x];
            a[x] = a[y];
            a[y] = temp;
            x++;
            y--;
        }
    }

}
