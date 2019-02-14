package Problems;

/*
 * Write an efficient program to find the sum of contiguous subarray within a one-dimensional array of numbers
 *  which has the largest sum.
 *  Kadane’s Algorithm:
 *  
 *  Initialize :
 *  	max_so_far=0;
 *  	max_ending_here=0;
 *  
 *  Loop for each element of the array 
 *  (a) max_ending_here=max_ending_here+a[i];
 *  (b) if(max_ending_here<0)
 *  		max_ending_here=0;
 *  (c) if(max_so_far < max_ending_here) 
 *   		max_so_far=max_ending_here;
 *   
 *   return max_so_far;
 */
public class LargestSumContiguousSubarray {

	static void findMaxSumContiguousSubArray(int arr[]) {
		int max_ending_here = 0;
		int max_so_far = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			max_ending_here = max_ending_here + arr[i];
			if (max_ending_here < 0) {
				max_ending_here = 0;
			}
			/*if (max_so_far < max_ending_here) {
				max_so_far = max_ending_here;
			}*/
			//more optimization 
			else if (max_so_far < max_ending_here) {
				max_so_far = max_ending_here;
			}
		}
		System.out.println(max_so_far);
	}

	public static void main(String[] args) {
		int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
		findMaxSumContiguousSubArray(arr);
	}
}
