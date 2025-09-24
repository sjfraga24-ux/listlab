package edu.grinnell.csc207.listlab;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.constraints.IntRange;

public class ArrayListTests {
    @Test
    public void emptyListTest() {
        ArrayList list = new ArrayList();
        assertEquals(0, list.size());
    }

    @Test
    public void listAddSize10() {
        ArrayList list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        assertEquals(10, list.size());
    }

    @Test
    public void listRemoveElement() {
        ArrayList list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        assertEquals(4, list.remove(4));
    }

    @Test
    public void listRemoveFirstElement() {
        ArrayList list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        assertEquals(0, list.remove(0));
    }

    @Test
    public void listRemoveLastElement() {
        ArrayList list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        assertEquals(9, list.remove(9));
    }


    @Property
    public boolean listAddSize(@ForAll @IntRange(min = 0, max = 1000) int sz) {
        ArrayList list = new ArrayList();
        for (int i = 0; i < sz; i++) {
            list.add(i);
        }
        return list.size() == sz;
    }
}
