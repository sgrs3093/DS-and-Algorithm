package pepcoding_level1.basic_programming.getting_started;

import java.util.Scanner;

public class GCMandLCM
{
    public static void main (String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int n1=scanner.nextInt();
        int n2=scanner.nextInt();

        int on1=n1;
        int on2=n2;
        while (n1%n2!=0) {

            int rem =n1%n2;
            n1=n2;n2=rem;
        }
        int gcd=n2;
        int lcm=(on1*on2)/gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
}
