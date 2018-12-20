package array.largestSumContigiousSubArray;

/*
 * Kadanes algo for finding largest contiguous sub array
 * // Java program to print largest contiguous array sum
 * Kadane’s Algorithm:

Initialize:
    max_so_far = 0
    max_ending_here = 0

Loop for each element of the array
  (a) max_ending_here = max_ending_here + a[i]
  (b) if(max_ending_here < 0)
            max_ending_here = 0
  (c) if(max_so_far < max_ending_here)
            max_so_far = max_ending_here
return max_so_far 
 */
public class KadaneAlgo {
	public static void main(String[] args) {
		int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
		System.out.println("Maximum contiguous sum is " + findLargestContiguousSubArray(a));
	}

	static int findLargestContiguousSubArray(int[] arr) {
		int length = arr.length;
		int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
		for (int i = 0; i < length; i++) {
			max_ending_here = max_ending_here + arr[i];
			if (max_ending_here < 0) {
				max_ending_here = 0;// 1/2/7/4
			}
			if (max_ending_here > max_so_far) {
				max_so_far = max_ending_here;// 4/7
			}
		}
		return max_so_far;
	}
}
