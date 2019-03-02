package edu.udemy.dsa.bootcamp;


import java.util.Arrays;

public class DynamicArray<T> {

    private int initialCapacity;
    private T [] array;

    public DynamicArray(int initialCapacity){
        this.initialCapacity = initialCapacity;
        array = (T[]) new Object[initialCapacity];
    }

    public T get(int index){
        return array[index];
    }

    public void set(int index, T item){
        array[index] = item;
    }

    /**
     * Inserts given 'item' in the given index position. Insertion alters the position of the other items after the
     * given index value by 1. Impacts size.
     * @param position
     * @param item
     */
    public void insert(int position, T item){
        array[position] = item;


    }

    protected int calculateNewCapacity(int position){
        int newCapacity = array.length;
        while( position < newCapacity){
            newCapacity += newCapacity;
        }
        if (newCapacity == 0){
            newCapacity = array.length * 2;
        }
        return newCapacity;
    }

    /**
     * Resets the value referred by 'position' to null. Index referred by position should be within the size.
     * @param position
     * @return item removed
     */
    public T remove(int position){
        T item = array[position];
        array[position] = null;
        return item;
    }

    public int size(){
        return array.length;
    }


}
