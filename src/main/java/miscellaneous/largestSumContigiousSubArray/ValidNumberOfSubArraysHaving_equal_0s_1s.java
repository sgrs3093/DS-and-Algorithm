package miscellaneous.largestSumContigiousSubArray;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

class ValidNumberOfSubArraysHaving_equal_0s_1s {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		private static void countValidSubArrays(int[] a, int n) {

		int ans = 0; // this is for max subarray having equals no of 0s and 1s
		int count = 0, nNaturl = 0;
		for (int i = 0; i < n; i++) {

			if (a[i] == 0)
				a[i] = -1;
		}
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(a[0], 1);
		for (int i = 1; i <= n - 1; i++) {

			a[i] += a[i - 1];
			if (map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i]) + 1);

			} else
				map.put(a[i], 1);
		}

		Iterator<Integer> itr = map.keySet().iterator();

		while (itr.hasNext()) {

			nNaturl = map.get(itr.next());
			count += (nNaturl * (nNaturl - 1)) / 2;

		}

		System.out.println(count);

	}

	public static void main(String[] args) {

		try {

			int t = Integer.parseInt(br.readLine());
			int n = 0;
			int idx = 0;
			for (int i = 0; i < t; i++) {
				n = Integer.parseInt(br.readLine());
				int[] a = new int[n];
				StringTokenizer st = new StringTokenizer(br.readLine());
				idx = 0;
				while (st.hasMoreTokens()) {
					a[idx++] = Integer.parseInt(st.nextToken());
				}

				countValidSubArrays(a, n);

			}
		} catch (Exception e) {
			String[] result = "3 4 5".split("\\s");
			for (int x = 0; x < result.length; x++)
				System.out.println(result[x]);

		}

	}

}