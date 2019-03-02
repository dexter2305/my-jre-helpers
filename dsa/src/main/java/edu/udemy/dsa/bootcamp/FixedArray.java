package edu.udemy.dsa.bootcamp;

public class FixedArray<T> {
    private T[] array;
    private int current = -1;

    public FixedArray(int capacity) {
        array = (T[]) new Object[capacity];
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


}
