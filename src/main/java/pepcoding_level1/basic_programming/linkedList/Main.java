package pepcoding_level1.basic_programming.linkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
    public static class Node
    {
        int data;
        Node next;
    }

    public static class LinkedList
    {
        Node head;
        Node tail;
        int size;

        /**
         * This method will add the node in last , if list size is empty then it will create the node with the data and , if size is zero then
         * head and tail will point to same node , and size will increase by one , if size is not zero then tail.next will point to that new node
         * and size will increase
         *
         * @param val
         */
        void addLast (int val)
        {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;
            if (size == 0) {
                head = temp;
            }
            else {
                tail.next = temp;
            }
            tail = temp;
            size++;

        }

        public void display ()
        {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        /**
         * @return
         */
        public int size ()
        {

            return size;
        }
    }

    public static void testList (LinkedList list)
    {
        for (Node temp = list.head; temp != null; temp = temp.next) {

            System.out.println(temp.data);
        }
        System.out.println(list.size);

        /*Node temp = list.head;
        while (temp.next != null) {
            System.out.println(temp.data);
        }*/
        if (list.size > 0) {
            System.out.println(list.tail.data);
        }
    }

    public static void main (String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        LinkedList list = new LinkedList();

        String str = br.readLine();
        while (str.equals("quit") == false) {
            if (str.startsWith("addLast")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                list.addLast(val);
            }
            str = br.readLine();
        }
        System.out.println("Printing the Display()");
        list.display();
        System.out.println("Printing the size()" + list.size());

        System.out.println("Testing the list ");
        testList(list);

    }
}
