package factorial;

public class TrailingZero0InFactorial {
	/*
	 * this program is for counting number of trailing zeros for particular
	 * factorial number . there is a rule that
	 * if the number is multiplied by 10 then there is 1 trailing zeros for particualr number .
	 * 10*1 =10(1 trailing zero)
	 * 10*2=20(1 trailing zero)
	 * 
	 * 10*10=100(2 trailing zero)
	 * if number contain 2 10s means there is 2 trailing zero .
	 * FACTOR OF 2 AND 5 ALSO WILL BE 10 SO THERE WILL BE 1 ZERO BASED ON NUMBER OF 5 
	 * LIKE 5! WILL CONTAIL 5*2=10  THEN THERE WILL BE 1 TRAILING ZERO IN FACTORIAL NUMBER  
	 */
	public static int trailingZeroCount(int num) {
		int count = 0;
		for (int i = 5; num / i > 0; i = i * 5) {
			count = count + num / i;
		}
		return count;
	}

	public static void main(String[] args) {
		int num = 25;
		System.out.println(trailingZeroCount(num));
	}
}
