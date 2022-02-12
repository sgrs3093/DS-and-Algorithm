package pepcoding_level1.basic_programming.pattern;

import java.util.Scanner;

/**
 *Pattern 15
 * Link for the question : https://www.pepcoding.com/resources/online-java-foundation/patterns/pattern_15/topic
 * 		    1
 * 	    2	3	2
 * 3	4	5	4	3
 *      2	3	2
 * 		    1
 */
public class Pattern15
{
    public static int getInput ()
    {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void main (String[] args)
    {
        printPattern();
    }

    private static void printPattern ()
    {
        int n = getInput();
        /*
        this pattern is similar to patter 5 where we were printing the Diamond * pattern
        here also this pattern is similar to same ..
        we will check and do the same pattern first then will print out the real pattern logic
        /**
         * Pattern5
         * 	    	*
         *       *	*	*
             *   *  *	*	*
         *       *	*	*
         *  		*
         *
         *
         */

        /*
        steps :
        logic :
        row   column   space  star
        1              2      1
        2              1      3
        3              0      5
        4              1      3
        5              2      1
        -------------------------
        we  are seing here the patter logic for star and spaces
        spaces is decrising 1 by 1 and star is increasing by 2 ..and that is happeing till n/2 times
        if  n=5 then n/2 is 2 and in else part pattern is going opposite
        spaces is increasing 1 by 1
        star is decreasing by 2
        so will start the logic to do the same
        1) will take the outer loop for going through through the rows
        2) print the space first
        3) print the star then
        for each row and column and then stop
         */
//here we have print step wise step 1st star, then number in increasing order then actual pattern
        //for more info check the above question link
        int space=2,star =1;
        int val = 1;
        // taking out loop of rows
        for(int i= 1;i<=n;i++) {

            //for space
            for (int sp = 1; sp <= space; sp++) {
                System.out.print("\t");
            }
            int cval =val;
            //for star
            for (int str = 1; str <= star; str++) {
                System.out.print(cval + "\t");
                if (str <= star / 2) {
                    cval++;
                }
                else {
                    cval--;
                }
            }
            if (i <= n/2) {
                star+=2;
                space--;
                val++;
            } else {
                star-=2;
                space++;
                val--;
            }
            System.out.println();
        }

    }
}
