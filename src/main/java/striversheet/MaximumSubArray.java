package striversheet;

import java.util.ArrayList;

/**
 * https://takeuforward.org/data-structure/kadanes-algorithm-maximum-subarray-sum-in-an-array/
 */
public class MaximumSubArray
{
    public static int maxSubArray (int[] nums,
                                   ArrayList<Integer> subarray)
    {
        int max_sum = Integer.MIN_VALUE;
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }
        for (int i = 0; i <= n - 1; i++) {
            for (int j = i; j <= n - 1; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + nums[k];
                }
                if (sum > max_sum) {
                    subarray.clear();
                    max_sum = sum;
                    subarray.add(i);
                    subarray.add(j);
                }
            }
        }
        return max_sum;
    }

    /**
     * O3 time complexity
     *
     * @param nums
     * @param subarray
     * @return
     */
    static int findMaxSubArray (int[] nums,
                                ArrayList<Integer> subarray)
    {

        int max = Integer.MIN_VALUE;
        int n = nums.length;

        //will take 3 loop and iterate it to take sub array and will add the sum

        for (int i = 0; i <= n - 1; i++) {
            for (int j = i; j <= n - 1; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + nums[k];
                    if (sum > max) {
                        max = sum;
                        subarray.clear();
                        subarray.add(i);
                        subarray.add(j);
                    }
                }
            }
        }
        return max;
    }

    /**
     * 2nd approach O(N)2
     * @param nums
     * @param subarray
     * @return
     */
    static int findMax (int[] nums,
                        ArrayList<Integer> subarray)
    {
        int n = nums.length;
        int max_Sum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int curr_sum = 0;
            for (int j = i; j < n; j++) {
                curr_sum += nums[j];
                if (curr_sum > max_Sum) {
                    max_Sum = curr_sum;
                    subarray.clear();
                    subarray.add(i);
                    subarray.add(j);
                }
            }
        }
        return max_Sum;
    }

    static int findMaxKadane(int[] nums ,ArrayList<Integer> subArray) {

        int maxSum = Integer.MIN_VALUE;

        return maxSum;
    }

    public static void main (String args[])
    {
        int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        ArrayList<Integer> subarray = new ArrayList<>();
        //int lon = findMaxSubArray(arr, subarray);
        int lon = findMax(arr,subarray);
        System.out.println("The longest subarray with maximum sum is " + lon);
        System.out.println("The subarray is ");
        for (int i = subarray.get(0); i <= subarray.get(1); i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
