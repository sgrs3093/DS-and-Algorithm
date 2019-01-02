package interviewBit.String;

public class StringCharCount {
	static void countNoOfOccurence(String s) {
		char[] c = s.toCharArray();
		int count[] = new int[26];
		int length = s.length();
		for (int i = 0; i < length; i++) {
			count[c[i] - 'a']++;
		}

		for (int i = 0; i < count.length; i++) {
			System.out.print( "- " + count[i]);
		}
		// return count;
	}

	public static void main(String[] args) {
		String s = "sagar";
		countNoOfOccurence(s);
	}
}
