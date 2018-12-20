package interviewBit.String;
public class Palindrom {
	public static int isPalindrome(String A) {
		int size = A.length();
		String lcs = A.toLowerCase();
		int left = 0;
		int right = size - 1;
		while (right >= left) {
			boolean isDigitComp = (Character.isDigit(lcs.charAt(right)) && Character.isDigit(lcs.charAt(left)))
					&& (Integer.parseInt(String.valueOf(lcs.charAt(right))) == Integer
							.parseInt(String.valueOf(lcs.charAt(left))));

			if (isDigitComp || lcs.charAt(right) == lcs.charAt(left)) {
				right--;
				left++;
			} else if (!Character.isDigit(lcs.charAt(right)) && !Character.isLetter(lcs.charAt(right))) {
				right--;
			} else if (!Character.isDigit(lcs.charAt(left)) && !Character.isLetter(lcs.charAt(left))) {
				left++;
			} else {
				return 0;
			}
		}

		return 1;
	}
	public static void main(String[] args) {
		isPalindrome("race a car");
	}
}
