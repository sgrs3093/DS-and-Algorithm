package pepcoding_level1.basic_programming.stackQueues;

import java.util.Scanner;
import java.util.Stack;

/**
 * This project will find if the String has a balanced parenthesis
 * e.g.
 * [(a + b) + {(c + d) * (e / f)}] -> true
 * [(a + b) + {(c + d) * (e / f)]} -> false
 * [(a + b) + {(c + d) * (e / f)} -> false
 * ([(a + b) + {(c + d) * (e / f)}] -> false
 */

public class BalancedBrackets
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String parenthesis = sc.nextLine();
        System.out.println(checkBalancedParenthesis(parenthesis));

    }

    static boolean checkBalancedParenthesis (String word)
    {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i <= word.length()-1; i++) {
            char ch = word.charAt(i);
            if (ch == '[' || ch == '{' || ch == '(') {
                st.push(ch);
            }
            else {
                if (!st.isEmpty() && (ch == ']' || ch == '}' || ch == ')')) {
                    char popVal = st.pop();
                    boolean flag = checkIfCurrentPopElementISSame(ch,
                                                                  popVal);
                    if (!flag) {
                        return false;
                    }
                }
            }
        }
        if (!st.isEmpty()) {
            return false;
        }
        return true;
    }

    static boolean checkIfCurrentPopElementISSame (char a,
                                                   char b)
    {
        if ((a == ')' && b == '(') || (a == '}' && b == '{') || (a == ']' && b == '[')) {
            return true;
        }

        return false;
    }
}
