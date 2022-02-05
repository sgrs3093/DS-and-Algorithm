package miscellaneous.largestSumContigiousSubArray;

/*
 * Kadanes algo for finding largest contiguous sub array
 * // Java program to print largest contiguous array sum
 * Kadane�s Algorithm:

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

		int a1[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
		System.out.println("Maximum contiguous sum is " + largestSUBSumArray(a1));
	}

	static int findLargestContiguousSubArray(int[] arr) {
		int length = arr.length;
		int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
		for (int i = 0; i < length; i++) {
			max_ending_here = max_ending_here + arr[i];
			if (max_ending_here < 0) {
				max_ending_here = 0;// 1/2/7/4
			}
			/*
			 * if (max_ending_here > max_so_far) { max_so_far =
			 * max_ending_here;// 4/7 }
			 */

			/*
			 * Do not compare for all elements. Compare only when
			 * max_ending_here > 0
			 */
			else if (max_so_far < max_ending_here)
				max_so_far = max_ending_here;
		}
		return max_so_far;
	}

	// above program will not work for all negative numbers as its simply
	// returns 0 if all no will negative
	// here is the method to find if array value will be negative number

	static int largestSUBSumArray(int[] arr) {
		int max_so_far = arr[0];
		int curr_max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			// comparing values which is max
			curr_max = Math.max(arr[i], curr_max + arr[i]);
			max_so_far = Math.max(max_so_far, curr_max);
		}
		return max_so_far;

	}
}
