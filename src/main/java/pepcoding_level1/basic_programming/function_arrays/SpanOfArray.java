package pepcoding_level1.basic_programming.function_arrays;

import java.util.Scanner;

/**
 * Span of Array
 *
 * Link : https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/span_of_an_array/topic
 *
 * Input
 * A number n
 * n1
 * n2
 * .. n number of elements
 *
 * Output
 * A number representing max - min
 *
 * Sample Input
 *
 * 6
 * 15
 * 30
 * 40
 * 4
 * 11
 * 9
 * Sample Output
 * 36
 */
public class SpanOfArray
{

    public static int getInput ()
    {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void main (String[] args)
    {
        int n =getInput();
    }


}
