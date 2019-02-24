package edu.udemy.dsa.bootcamp;

public class DynamicArray<T> {

    private int capacity;
    private T [] array;

    public DynamicArray(int capacity){
        this.capacity = capacity;
        array = (T[]) new Object[capacity];
    }

    public T get(int index){
        return array[index];
    }

    public void set(int index, T item){
        array[index] = item;
    }

    public void insert(int position, T item){

    }

    public T remove(int position){
        return null;
    }

    public int add(T item){
        return -1;
    }

}
