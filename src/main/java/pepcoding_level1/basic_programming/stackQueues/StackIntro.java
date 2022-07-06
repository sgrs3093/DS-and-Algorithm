package pepcoding_level1.basic_programming.stackQueues;

import java.util.Stack;

/**
 * https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/introduction_to_stack/topic
 *
 * Stack is a linear data structure which follows a FILO (First In Last Out) order (or Last In First Out (LIFO)) for doing various operations.
 *
 */

public class StackIntro {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);st.push(30);st.push(40);st.push(50);
        System.out.println(st);
        System.out.println(st.peek()+"   "+st.size());
    }
}
