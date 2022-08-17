package pepcoding_level1.basic_programming.stackQueues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/next-greater-element-official/ojquestion
 *
 * <p>
 * Here we need to find the next grater element towards right of the given value in array' and we need to return the array with the value
 * <p>
 * e.g.
 * e.g.
 * for the array [2 5 9 3 1 12 6 8 7]
 * Next greater for 2 is 5
 * Next greater for 5 is 9
 * Next greater for 9 is 12
 * Next greater for 3 is 12
 * Next greater for 1 is 12
 * Next greater for 12 is -1
 * Next greater for 6 is 8
 * Next greater for 8 is -1
 * Next greater for 7 is -1
 * <p>
 * o.p.
 * [5, 9 , 12 , 12, 12 , -1 , 8, -1, -1, -1 ]
 */
public class NextGraterElementToTheRight
{

    public static void display (int[] a)
    {
        StringBuilder sb = new StringBuilder();

        for (int val : a) {
            sb.append(val + "\n");
        }
        System.out.println(sb);
    }

    public static void main (String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        int[] nge = solve(a);
        display(nge);
    }

    public static int[] solve (int[] arr)
    {
        // solve

        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] nge = new int[n];//next grater element
        //placing the -1 at the last index and for the last index next grater element will be -1
        nge[arr.length - 1] = -1;
        st.push(arr[arr.length - 1]);//pushing the last element of the array in the stack because for the last index their is no element at right side
        /*
        [2 5 9 3 1 12 6 8 7]
        //here we will take stack and start the loop from back side i.e from array.length-1 to towards beginning and put the
        grater element in Stack and while traversing the loop we will get element and check in Stack if the peek elemnet is grater then current element
        or not , if it is grater then  we will add in array and update the stack with current grater value
         */
        for (int i = n - 2; i
                        >= 0; i--) {//loop will start from index -2 as for last element we have already placed the value as -1

            /*
            - a + ( first pop then answer then push )
            Tub tuk pop karayega tub tuk stack k top pe usse bada element nhi aajata
             */
            // now we will pop the element from the stack till we find the grater then current element .
            while (st.size() > 0 && arr[i] >= st.peek()) {
                st.pop();
            }

            /*
            then once smaller element is poped out from the stack then we will top most element is next grater element of the current value of the array
            and it will become the answer
             */
            if (st.size() == 0) {
                nge[i] = -1;//if stack size become 0 then we will insert next grater element as -1
            }
            else {
                nge[i] = st.peek(); //else next grater element is peek of the stack
            }

            st.push(arr[i]);// finally will push the current element i.e grater element compare to all other element

        }
        return nge;
    }
}
