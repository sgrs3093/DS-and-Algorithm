package pepcoding_level1.basic_programming.getting_started;

import java.util.Scanner;

/**
 * Inverse Of A Number
 * <p>
 * 1. You are given a number following certain constraints.
 * 2. The key constraint is if the number is 5 digits long, it'll contain all the digits from 1 to 5 without missing any and without repeating any. e.g. 23415 is a 5 digit long number containing all digits from 1 to 5 without missing and repeating any digit from 1 to 5.Take a look at few other valid numbers - 624135, 81456273 etc.Here are a few invalid numbers - 139, 7421357 etc.
 * 3. The inverse of a number is defined as the number created by interchanging the face value and index of digits of number.e.g. for 426135 (reading from right to left, 5 is in place 1, 3 is in place 2, 1 is in place 3, 6 is in place 4, 2 is in place 5 and 4 is in place 6), the inverse will be 416253 (reading from right to left, 3 is in place 1, 5 is in place 2,2 is in place 3, 6 is in place 4, 1 is in place 5 and 4 is in place 6) More examples - inverse of 2134 is 1243 and inverse of 24153 is 24153
 * 4. Take as input number "n", assume that the number will follow constraints.
 * 5. Print it's inverse.
 * <p>
 * Ex:
 * 28346751 => op: 73425681
 * i/p : 21453 => 23154
 *
 * YouTube : https://www.youtube.com/watch?v=O7PlWc9lOzg
 */
public class InverseNumber
{

    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(inverseNumber(n));

    }

    static int inverseNumber (int n)
    {

        int inv = 0;
        int op = 1;

        while (n != 0) {

            int od = n % 10;
            /*
             21453
             here 1 pe 3 hai toh => 3 pe 1 hoga inverse me
             2 pe 5 hai toh => 5 pe 2 hoga
             3 pe 4 hai to => 4 pe 3 hoga
             4 pe 1 hai toh=> 1 pe 4 hoga
             5 pe 2 hai toh=> 2 pe 5 hoga
             */
            int id = op; // 1 pe 3 => 3 pe 1 i.e id = 1 id is inverted digit
            int ip = od;// ip is inverted position . 1 pe 3

            inv = inv + id * (int)Math.pow(10,
                                           ip - 1);
            n = n / 10;
            op++;

        }
        return inv;
    }
}
