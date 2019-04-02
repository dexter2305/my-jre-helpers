package edu.udemy.dsa.bootcamp;


public class DynamicArray<T> {

    private T[] data;

    private int size;

    public DynamicArray() {
        this(5);
    }

    public DynamicArray(final int capacity) {
        data = (T[]) new Object[capacity];
    }

    /**
     * Returns the object in index. Throws Exception when index not in (0-size).
     *
     * @param index
     * @return
     */
    public T get(int index) {
        throwExceptionIfNotInRange(index);
        return data[index];
    }

    /**
     * Adds the element to the end of the list. Enlarges when full.
     *
     * @param item
     */
    public void add(T item) {
        ensureCapacity();
        data[size++] = item;
    }

    /**
     * Doubles the array when full
     */
    protected void ensureCapacity() {
        if (size < data.length) return;
        T[] bloated = (T[]) new Object[2 * data.length];
        for (int i = 0; i < data.length; i++) {
            bloated[i] = data[i];
        }
        data = bloated;
    }

    /**
     * Throws unchecked exception when index out of range or array empty.
     *
     * @param index
     */
    protected void throwExceptionIfNotInRange(final int index) {
        if (index < 0 || index > size || size == 0) {
            throw new IndexOutOfBoundsException("size:'" + size + "' given index:'" + index + "'");
        }
    }

    /**
     * Resets the value referred by 'index' to null. Index referred by index should be within the size.
     *
     * @param index
     * @return item removed
     */
    public T remove(int index) {
        throwExceptionIfNotInRange(index);
        T item = data[index];
        data[index] = null;

        for (int from = index; from < size - 1; from--) {
            data[from] = data[from + 1];
        }
        size--;
        return item;
    }


    /**
     * Returns current size
     *
     * @return
     */
    public int size() {
        return size;
    }


}
