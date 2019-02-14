package Problems;

public class FindingRepeatedNumberInArray {
	public static void main(String[] args) {
		int arr[] = { 3, 5, 6, 7, 8, 9, 2, 1, 9, 3 };
		int size = arr.length;
		printRepeatingNumber(arr, size);
		printRepeatingNumber(size, arr);
		printRepeatingNum();
	}

	/*
	 * Method 1(BAsic) Basic method to find repeated number using 2 loops 1 is
	 * for iterating and 1 loop for comparing it . TC O(n*n) SC O(1)
	 */
	private static void printRepeatingNumber(int[] arr, int size) {
		int i, j = 0;
		System.out.print("Repeated number in arr is :");
		for (i = 0; i < arr.length; i++) {
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[i] + " ");
				}
			}
		}
	}

	/*
	 * mehtod 2 :USe count Array Traverse the array while traversing the array
	 * keep track of count of all elements in the array count[] size n, when you
	 * see an element whose count is already set print it as duplicate
	 * 
	 * TC: O(n) SP O(n)
	 */
	private static void printRepeatingNumber(int size, int[] arr) {
		int i = 0;
		int count[] = new int[size];
		System.out.println();
		System.out.print("Repeated number in arr is :");
		for (i = 0; i < arr.length; i++) {
			if (count[arr[i]] == 1) {
				System.out.print(arr[i] + " ");
			} else {
				count[arr[i]]++;
			}
		}
	}

	/*
	 * MEthod 3: this method is to find the duplicate in array with Time
	 * complexity O(n) and Space complexity O(1)
	 * 
	 */
	private static void printRepeatingNum() {
		int arr[] = { 1, 2, 3, 1, 3, 6, 6 };
		int size = arr.length;
		int i = 0;
		System.out.println("Repeating elements are : ");
		for (i = 0; i < size; i++) {
			if (arr[Math.abs(arr[i])] >= 0) {
				arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
			} else
				System.out.print(Math.abs(arr[i]) + " ");
		}
	}

}
