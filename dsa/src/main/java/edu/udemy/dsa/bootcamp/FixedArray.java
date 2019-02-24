package edu.udemy.dsa.bootcamp;

import java.lang.reflect.Array;

public class FixedArray<T> {
    private T[] array;
    private int current = -1;

    public FixedArray(int capacity) {
        array = (T[]) new Object[capacity];
    }

    /**
     * Checks feasibility of required capacity.
     * @param expectedSize
     * @throws ArrayIndexOutOfBoundsException when expectedSize greater than capacity
     */
    protected void ensureCapacity(final int expectedSize){
        if (expectedSize > getCapacity()) throw new ArrayIndexOutOfBoundsException("ArrayOverFlow");
    }

    /**
     * Checks if given 'index' falls in range of array.
     * @param index
     * @throws IndexOutOfBoundsException when index out of range
     */
    protected void rangeCheck(final int index){
        if (index < 0 || index > array.length) throw new IndexOutOfBoundsException("OutOfRange");
    }

    /**
     * Appends the item and returns the index
     *
     * @param item
     * @return
     */
    public int add(T item) {
        ensureCapacity(current + 1);
        current++;
        array[current] = item;
        return current;
    }

    /**
     * Removes and returns from given index
     *
     * @param index
     * @return
     */
    public T remove(int index) {
        rangeCheck(index);
        T removedItem = array[index];
        for (int curPos = index; curPos <= current; curPos++){
            if ((curPos +1) == array.length) {
                array[curPos] = null;
            } else {
                array[curPos] = array[curPos + 1];
            }
        }
        current--;
        return removedItem;
    }

    /**
     * Inserts at given index
     *
     * @param index
     * @param item
     */
    public FixedArray<T> insert(int index, T item) {
        rangeCheck(index);
        ensureCapacity(current + 1);
        for (int curPos = current; curPos >= index; curPos--) {
            array[curPos + 1] = array[curPos];
        }
        array[index] = item;
        current++;
        return this;
    }

    /**
     * Sets at the given array index
     *
     * @param index
     * @param item
     */
    public FixedArray<T> set(int index, T item) {
        array[index] = item;
        return this;
    }

    /**
     * Returns object from the given index
     *
     * @param index
     * @return
     */
    public T get(int index) {
        return array[index];
    }

    /**
     * Returns fixed capacity of the array.
     *
     * @return
     */
    public int getCapacity() {
        return array.length;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("{");
        for (int i = 0; i <= current; i++) {
            builder.append("\n\t").append("-").append("@" + (i+1) + ":").append(array[i]);
        }
        builder.append("\n").append("}");
        return builder.toString();
    }

    public int size() {
        return current + 1;
    }

    public static void main(String[] args) {
        FixedArray<String> strings = new FixedArray<>(3);
        strings.add("a");
        strings.add("c");
        strings.insert(1,"b");
        System.out.println(strings.toString());
    }

}
