package miscellaneous.Problems;

import java.util.Arrays;

public class RemoveSpecificElementFromArray {
	static void removeSpecificElement(int arr[], int size) {
		System.out.println(Arrays.toString(arr));
		// remove 5th element from the array element i.e index--> 4 and value 31
		int removeIndex = 4;
		for (int i = removeIndex; i < size - 1; i++) {
			arr[i] = arr[i + 1];
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int arr[] = { 32, 435, 34, 23, 31, 21, 4 };
		int size = arr.length;
		removeSpecificElement(arr, size);
	}
}
