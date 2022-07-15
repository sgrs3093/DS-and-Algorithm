package pepcoding_level1.basic_programming.stackQueues;

import java.util.Scanner;
import java.util.Stack;

/**
 * https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/duplicate_brackets/topic
 * <p>
 * e.g.'
 * ((a + b) + (c + d)) -> false
 * (a + b) + ((c + d)) -> true
 */
public class DuplicateBracket
{

    public static void main (String[] args)
    {

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        boolean flag = findDuplicate(word);
        System.out.println("Found duplicate in given %s word is %s" + flag);

       // loop();

    }

    static boolean findDuplicate (String word)
    {
        //((a + b) + (c + d)) -> false
        //(a + b) + ((c + d)) -> true
        //will form a Stack to push and pop the element
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < word.length(); i++) {

            char currentChar = word.charAt(i);

            if (currentChar == ')') {

                if (st.peek() == '(') {
                    return true;
                }
                else {
                    while (st.peek() != '(') {
                        st.pop();
                    }
                    st.pop();
                }
            }
            else {
                st.push(currentChar);
            }
        }
        return false;
    }

   static void loop ()
    {
        for (int i = 1, j = 1; i <= 10 && j <= 10; i++) {
            System.out.println(i);
        }

        int i = 1;
        do {
            System.out.println("do while loop demo " + i);
            i++;
        }
        while (i <= 10);
    }
}
