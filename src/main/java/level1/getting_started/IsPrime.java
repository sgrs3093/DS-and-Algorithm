package level1.getting_started;

import java.util.Scanner;

public class IsPrime
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();

            int count = 0;

            for (int div = 1; div <= n; div++) {
                if (n % div == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println("Prime");
            }
            else {
                System.out.println("Not Prime");
            }

        }
    }
}
