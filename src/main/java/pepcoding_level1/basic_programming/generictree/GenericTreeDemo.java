package pepcoding_level1.basic_programming.generictree;

import java.util.ArrayList;

/**
 * https://www.pepcoding.com/resources/online-java-foundation/generic-tree/introduction_to_generic_tree/topic
 *
 */
public class GenericTreeDemo
{
    /*
    Tree contain Node and node contain data and sub children
    as sub children are so many ,so we are taking arraylist to add them
    1st node is called Root node , and other called child node
     */
    private class Node
    {
        int data;//for storing the data
        ArrayList<Node> children = new ArrayList<>();//for storing the child nodes
    }

    public static void main (String[] args)
    {
        //Root will be ready, and then we can add the children
        Node root;

    }

}
