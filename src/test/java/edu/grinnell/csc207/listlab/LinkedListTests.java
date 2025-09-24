package edu.grinnell.csc207.listlab;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.constraints.IntRange;

public class LinkedListTests {
    @Test
    public void emptyListTest() {
        LinkedList list = new LinkedList();
        assertEquals(0, list.size());
    }

    @Test
    public void addListTest(){
        LinkedList list = new LinkedList();
        list.add(1);
        
        assertEquals(1, list.first.val);
    }

    @Test
    public void addMoreListTest(){
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);

        
        assertEquals(2, list.first.next.val);
    }


    @Test
    public void listAddSize10() {
        LinkedList list = new LinkedList();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        assertEquals(10, list.size());
    }

    @Property
    public boolean listAddSize(@ForAll @IntRange(min = 0, max = 1000) int sz) {
        LinkedList list = new LinkedList();
        for (int i = 0; i < sz; i++) {
            list.add(i);
        }
        return list.size() == sz;
    }

    @Test
    public void removeElement() {
        LinkedList list = new LinkedList();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.remove(4);
        assertEquals(9, list.size());
    }

    @Test
    public void removeFirstElement() {
        LinkedList list = new LinkedList();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list.remove(0));
        assertEquals(9, list.size());
    }

    @Test
    public void checkFirstElement() {
        LinkedList list = new LinkedList();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        
        assertEquals(0, list.remove(0));
    }

}
