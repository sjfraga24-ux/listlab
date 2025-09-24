package edu.grinnell.csc207.listlab;

import java.util.Arrays;

/**
 * An array-based implementation of the list ADT.
 */
public class ArrayList {
    private int[] arr = {};
    private int size = 0;
    /**
     * Adds <code>value</code> to the end of the list
     * 
     * @param value the value to add to the end of the list
     */

    public void add(int value) {
       size++;
       
       arr = Arrays.copyOf(arr, size);
       arr[size-1] = value;
    }

    /**
     * @return the number of elements in the list
     */
    public int size() {
        return size;
    }

    /**
     * @param index the index of the element to retrieve
     * @return the value at the specified <code>index</code>
     */
    public int get(int index) {
        return arr[index];
    }

    /**
     * Removes the value at <code>index</code> from the list
     * 
     * @param index the index of the element to remove
     * @return the element at <code>index</code>
     */
    public int remove(int index) {
        int value = arr[index];
        size--;
        if(index == 0){
            Arrays.copyOfRange(arr, 1, size()-1);
            return value;
        }else if (index == arr.length-1) {
            Arrays.copyOfRange(arr, 0, size()-2);
            return value;
        }
        for(int i = 0; i <= index; i++){
            if (i == index){
                int[] arr1 = Arrays.copyOfRange(arr, 0, i-1);
                int[] arr2 = Arrays.copyOfRange(arr, i+1, size());
                int[] newArr = new int[size()];
                System.arraycopy(arr1, 0, newArr, 0, arr1.length - 1);
                System.arraycopy(arr2, 0, newArr, arr1.length-1, arr2.length -1);
                return value;
            }
        }
        return value;
    }

}
