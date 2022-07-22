package pepcoding_level1.basic_programming.generictree;

import java.util.ArrayList;
import java.util.Stack;

/**
 * https://www.pepcoding.com/resources/online-java-foundation/generic-tree/introduction_to_generic_tree/topic
 */
public class GenericTreeDemo
{
    /*
    Leaf node  : if any of the node does not have any of the child then that node is leaf node
     */
    /*
    Tree contain Node and node contain data and sub children
    as sub children are so many ,so we are taking arraylist to add them
    1st node is called Root node , and other called child node
     */
    private static class Node
    {
        int data;//for storing the data
        ArrayList<Node> children = new ArrayList<>();//for storing the child nodes
    }

    public static void main (String[] args)
    {
        //Root will be ready, and then we can add the children
        Node root;

        //will get the array of the element
        int arr[] = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1,
                        40, 100, -1, -1, -1 };

        /*
        Algorithm
        we will be using stack
        1) will pass the data from array
        1) will create node and set the data what ever we will pass
        2) as this is first node , will check stack, and it is empty then will make this node as root, then will push into stack
         */
        //will make one stack for NODE
        Stack<Node> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {//if array of i is -1
                st.pop();
            }
            else {
                Node temp = new Node();
                temp.data = arr[i];
                if (st.size() > 0) {
                    st.peek().children.add(temp);
                }
                else {
                    root = temp;
                }
                st.push(temp);
            }

        }
    }

}
