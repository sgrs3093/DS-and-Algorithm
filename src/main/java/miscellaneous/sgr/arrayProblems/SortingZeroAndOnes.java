package miscellaneous.sgr.arrayProblems;

public class SortingZeroAndOnes {
	static int count = 0;

	public static void main(String[] args) {

		int arr[] = { 1, 0, 1, 0, 0, 1 };
		int length = arr.length;
		countNumber(arr, length);
	}

	public static void countNumber(int arr[], int length) {

		int ar[] = new int[length];

		for (int i = 0; i < length; i++) {
			if (arr[i] == 0) {
				count++;
			}
		}
		for (int j = length; j > count; j--) {
			ar[j-1] = 1;
		}

		// for printing
		for (int k = 0; k < ar.length; k++) {
			System.out.print(ar[k]+" ");
		}

	}
}