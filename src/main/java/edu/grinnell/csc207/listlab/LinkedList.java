package edu.grinnell.csc207.listlab;

/**
 * A linked implementation of the list ADT.
 */
public class LinkedList {
    public class Node {
        public int val;
        public Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }


    }

    public Node first = null;

    /**
     * Adds <code>value</code> to the end of the list
     * 
     * @param value the value to add to the end of the list
     */
    public void add(int value) {
        if(first != null) {
            Node curr_node = first;
            while(curr_node.next != null) {
                curr_node = curr_node.next; 
            }
            curr_node.next = new Node(value);
        }else{
        first = new Node(value);
        }
    }

    /**
     * @return the number of elements in the list
     */
    public int size() {
        int count = 0;
        Node curr_node = first;
        while(curr_node != null){
            curr_node = curr_node.next;
            count++;
        }
        return count;
    }

    /**
     * @param index the index of the element to retrieve, between 0 (inclusive) and the linkedlist's length
     * @return the value at the specified <code>index</code>
     */
    public int get(int index) {
        Node curr_node = first;
        int count = 0; 
        while (curr_node != null) { 
            curr_node = curr_node.next;
            count++;
        }
        return count;
    }

    /**
     * Removes the value at <code>index</code> from the list
     * 
     * @param index the index of the element to remove
     * @return the element at <code>index</code>
     */
    public int remove(int index) {
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }
}
