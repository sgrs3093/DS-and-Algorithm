package pepcoding_level1.basic_programming.function_arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Inverse OF array
 * Link : https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/inverse_of_an_array/topic
 */
public class InverseOfArray
{

    public static void main (String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        int[] inv = inverse(a);
        display(inv);

    }

    private static void display (int[] inv)
    {
        StringBuilder sb = new StringBuilder();
        for (int val : inv) {
            sb.append(val + "\n");
        }
        System.out.println(sb);
    }

    /**
     * Input array :
     * arr1[] = 3 2 0 4 1
     * here we have the array size is 5 i.e 0 to 4
     * at 0th index : 3 then inverse of it will , ==> at 3rd index will be 0
     * at 1th index : 2 then inverse of it will , ==> at 2th index will be 1
     * at 2nd index : 0 then inverse of it will , ==> at 0th index will be 2
     * at 3rd index : 4 then inverse of it will , ==> at 4th index will be 3
     * at 4th index : 1 then inverse of it will , ==> at 1th index will be 4
     * so we need to inverse the array so output will be
     * <p>
     * output will be :
     * 0th index: 2
     * 1th index: 4
     * 2nd index: 1
     * 3rd index: 0
     * 4th index: 3
     * final output will be :3 2 0 4 1 of inverse will be ===>  2 4 1 0 3
     *
     * @param a
     * @return
     */
    private static int[] inverse (int[] a)
    {
        //steps
        // will create the new array to store the inverse
        int[] inverse = new int[a.length];
        //will loop through the array and store the value to new array
        for (int i = 0; i < a.length; i++) {
            /*
            // will take the input of each index like at 0th index will get the val
            //then at val index will place the index
            at 0th index val will be 3 then at 3rd index value will be 0
             */
            int val = a[i];
            inverse[val] = i;
        }

        return inverse;
    }
}
