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

        int d = Integer.parseInt(bf.readLine());

        findCeilFloorForGivenNumber(arr,
                                    n,
                                    d);
    }

    /**
     * Here one sorted array will be given
     * arr = 10, 20 30 40 50 60 70 80 90 100
     * Example d = 55
     * so we need to find floor and ciel for 55 in given array
     * floor is just smaller than given number so 50 is floor
     * ciel is just bigger then given number so 60 is ciel for 55
     * floor = 50
     * ciel = 60
     * <p>
     * Example d =92
     * floor : 90
     * ciel : 100
     * <p>
     * here 90 is just smaller than 92
     * and 100 is just bigger than 92
     *
     * @param arr
     * @param n
     */
    private static void findCeilFloorForGivenNumber (int[] arr,
                                                     int n,
                                                     int d)
    {
        int floor = 0;
        int ceil = 0;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (d < arr[mid]) {
                high = mid - 1;
                ceil = arr[mid];
            }
            else if (d > arr[mid]) {
                low = mid + 1;
                floor = arr[mid];
            }
            else {
                // if data is equal then floor and ceil both is equal to mid
                floor = arr[mid];
                ceil = arr[mid];
                break;
            }
        }
        System.out.println("for data : " + d + " floor and ceil is given below ");
        System.out.println("floor : " + floor);
        System.out.println("ceil : " + ceil);

    }
}
