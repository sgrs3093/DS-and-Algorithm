package miscellaneous.Stringproblems;

import java.util.HashSet;

/**
 * @author sagar
 *
 *         Find Repeating Character example i/p Sagar here 1st repeated characte
 *         is a
 * 
 */
public class FindFirstRepeatingChar {
	public static void main(String[] args) {
		String name = "sagr";
		char c = findFirstRepeatedCharacter(name);

		if (c == '\0') {
			System.out.println(":" + c);
		} else {
			System.out.println("First Repeated character is :" + c);
		}
		String name1 = "sagars";
		char c1 = findFirstRepeatedCharacter(name1);
		if (c == '\0') {
			System.out.println(":" + c1);
		} else {
			System.out.println("First Repeated character is :" + c1);// output
																		// of
																		// repeating
																		// char
																		// is a
		}
		findFirstRepeatedCharacter();
	}

	/**
	 * @param name
	 * @return char
	 * 
	 *         this method will take O(N) time complexity and space complexity
	 *         is O(1) this method is not for first repeating character this is
	 *         for Not the first repeated character,
	 */
	private static char findFirstRepeatedCharacter(String name) {
		char[] ar = name.toCharArray();
		// creating HastSet
		HashSet<Character> h = new HashSet();
		// traverse the input array from left to right
		for (int i = 0; i <= ar.length - 1; i++) {
			// check in HAshSet if elements is already present in HashSet return
			// that element and break
			if (h.contains(ar[i])) {
				return ar[i];
			} else {// else add the element is HashSet collection
				h.add(ar[i]);
			}
		}
		return '\0';
	}

	/**
	 * find the repeated character present first in the string. time complexity
	 * is O^2 as we took 2 loops and for each loop we are iterating n times
	 */
	static void findFirstRepeatedCharacter() {
		String s = "smartshirt";// here "s" is first repeated character
		char[] c = s.toCharArray();
		int p = -1;
		// iterate the two loop with each char string and compare
		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] == c[j]) {
					p = i;
					break;
				}
			}
			if (p != -1) {
				break;
			}
		}
		if (p == -1) {
			System.out.println("Not found 1st repeated char");
		} else {
			System.out.println("found 1st repeated char " + c[p]);
		}

	}

}
