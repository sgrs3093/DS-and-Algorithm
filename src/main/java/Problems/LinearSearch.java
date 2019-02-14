package Problems;

/*
 * Problem: Given an array arr[] of n elements, write a function to search a given element x in arr[].
 */
public class LinearSearch {

	public static void main(String[] args) {
		int arr[] = { 3, 5, 2, 6, 8, 9, 4, 7 };
		int length = arr.length;
		int searchElement = 11;
		int ele = linearSearch(arr, length, searchElement);
		if(ele==-1)
		System.out.println(searchElement + " not present in given array :" );
		else{
			System.out.println(searchElement + " present in given index :" + ele);
		}
	}

	private static int linearSearch(int[] arr, int length, int searchElement) {
		for (int i = 0; i < length; i++) {
			if (searchElement == arr[i]) {
				return i;
			}
		}
		return -1;
	}
}
