package pepcoding_level1.basic_programming.stackQueues;

import java.util.Stack;

/**
 * https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/introduction_to_stack/topic
 * <p>
 * Stack is a linear data structure which follows a FILO (First In Last Out) order (or Last In First Out (LIFO)) for doing various operations.
 *
 * Java Has Stack class as generic we can declare what ever Data type we need to
 * methods:
 * Push();
 * pop()
 * peek()
 * size() etc ..
 */

public class StackIntro {

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(10);
        System.out.println(st + "  " + st.peek() + "   " + st.size());
        st.push(20);
        System.out.println(st + "  " + st.peek() + "   " + st.size());
        st.push(30);
        System.out.println(st + "  " + st.peek() + "   " + st.size());
        st.push(40);
        System.out.println(st + "  " + st.peek() + "   " + st.size());
        st.push(50);
        System.out.println(st + "  " + st.peek() + "   " + st.size());

        st.pop();
        System.out.println(st + "  " + st.peek() + "   " + st.size());
        st.pop();
        System.out.println(st + "  " + st.peek() + "   " + st.size());
        st.pop();
        System.out.println(st + "  " + st.peek() + "   " + st.size());
        st.pop();
        System.out.println(st + "  " + st.peek() + "   " + st.size());
        st.pop();
        //this line give exception as Stack is empty now ,
        // st.peek() will give the Exception Empty stackException
        System.out.println(st + "  "  + st.size());

    }
}
