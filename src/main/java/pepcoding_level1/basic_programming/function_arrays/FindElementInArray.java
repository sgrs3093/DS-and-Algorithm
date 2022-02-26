package pepcoding_level1.basic_programming.function_arrays;

import java.util.Scanner;

/**
 * FindElement in Array
 *
 * Input
 * A number n
 * n1
 * n2
 * .. n number of elements
 * A number d
 *
 * Output
 * A number representing index at which d is found in array a and -1 if not found
 * Example
 * Sample Input
 *
 * 6
 *
 * 15
 * 30
 * 40
 * 4
 * 11
 * 9
 *
 * 40
 *
 * Sample Output
 * 2 ( we need to find the 40 , at which index it is present ) so out put index 2
 */
public class FindElementInArray
{

    public static int getInput ()
    {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void main (String[] args)
    {
        findElement();
    }

    static void findElement() {

    }
}
