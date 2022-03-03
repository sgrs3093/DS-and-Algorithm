package pepcoding_level1.basic_programming.function_arrays;

import java.util.Scanner;

/**
 * difference_of_two_arrays
 * <p>
 * https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/difference_of_two_arrays/topic
 * <p>
 * Input
 * A number n1
 * n1 number of elements line separated
 * A number n2
 * n2 number of elements line separated
 * <p>
 * Output
 * A number representing difference of two numbers (a2 - a1), represented by two arrays.
 * Example
 * Sample Input
 * 3
 * 2
 * 6
 * 7
 * 4
 * 1
 * 0
 * 0
 * 0
 * Sample Output
 * 7
 * 3
 * 3
 */
public class DifferentOfTwoArray
{
    public static int getInput ()
    {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void main (String[] args)
    {
        differentOFTwoArray();
    }

    /**
     * Here we will take two number
     * and we need to minus from 2nd number to 1st number
     */
    static void differentOFTwoArray ()
    {

    }
}
