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

    /**
     * For reverse the array
     * @param a
     * @param i
     * @param j
     */
    private static void reverse (int a[],
                                 int i,
                                 int j)
    {
        int li = i;
        int ri = j;
        while (li < ri) {
            int temp = a[li];
            a[li] = a[ri];
            a[ri] = temp;
            li++;
            ri--;
        }

    }

    /**
     * To display
     * @param a
     */
    private static void display (int a[])
    {

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    /*
     Note : here we are solving the questing with below step
     ex:
     1 2 3 4 5 6 7
     length is 7
     if we need to rotate the array by 2 then thee final output will be
     k=-1:2 3 4 5 6 7 1
     k=0: 1 2 3 4 5 6 7
     k=1 :7 1 2 3 4 5 6
     k=2 :6 7 1 2 3 4 5
     k=3: 5 6 7 1 2 3 4
     k=4: 4 5 6 7 1 2 3
     k=5: 3 4 5 6 7 1 2
     k=6: 2 3 4 5 6 7 1
     k=7: 1 2 3 4 5 6 7

if we need to rotate by 7 means is is same as 0
or we say every 7 time the number will be same
    if k = K % a.length
     if we see here k=-1 and k=6  is same
     so if we need to find the -1 then we can say k =6 answer will be same
     if K<0
     k = k + a.length-1 => -1+7 = 6 then for k=6 or k=-1 result is same

     if we need to reverse 1 2 3 4 5
     k =2 then
     1 2 3 | 4 5
     here 3 part will be there
     part 1 is reverse 1 2 3 i.e 3 2 1 ( array , 0, arr.length- k -1 )
     part 2 is reverse 4 5 i.e 5 4 (array , arr.length - k , arr.length -1)
     3 2 1 | 5 4
     then total reverse the array
     4 5 3 2 1

     */
    /**
     * to rotate the array
     * @param a
     * @param k
     */
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
