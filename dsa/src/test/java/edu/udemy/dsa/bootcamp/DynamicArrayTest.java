package edu.udemy.dsa.bootcamp;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DynamicArrayTest {

    private DynamicArray<String> collection;

    @AfterMethod
    public void setup(){
        collection = null;
    }

    @Test
    public void testSize_OnInit() {
        collection = new DynamicArray<>();
        Assert.assertEquals(collection.size(), 0);
    }

    @Test
    public void testSize_OnVarInit(){
        collection = new DynamicArray<>(10);
        Assert.assertEquals(collection.size(), 0);
    }

    @Test
    public void testAdd() {
        collection = new DynamicArray<>();
        collection.add("hello");
        collection.add("world");
    }

    @Test (expectedExceptions = IndexOutOfBoundsException.class, description = "Get on empty array should throw an exception irrespective of the initial capacity")
    public void testGet_OnEmptyArray(){
        collection = new DynamicArray<>(10);
        collection.get(0);
    }

    @Test (expectedExceptions = IndexOutOfBoundsException.class, description = "Get with a negative index should throw an exception irrespective of the initial capacity")
    public void testGet_WithNegativeValue(){
        collection = new DynamicArray<>(10);
        collection.get(-1);
    }

    @Test (expectedExceptions = IndexOutOfBoundsException.class)
    public void testGet_WithGreaterThanCapacity(){
        collection = new DynamicArray<>(10);
        collection.get(100);
    }

    @Test(expectedExceptions = IndexOutOfBoundsException.class)
    public void testRemove_OnEmptyArray(){
        collection = new DynamicArray<>(5);
        collection.remove(0);
    }

    @Test(expectedExceptions = IndexOutOfBoundsException.class)
    public void testRemove_WithNegativeIndex(){
        collection = new DynamicArray<>(5);
        collection.remove(-4);
    }

    @Test(expectedExceptions = IndexOutOfBoundsException.class)
    public void testRemove_WithIndexGreaterThanSize(){
        collection = new DynamicArray<>(5);
        collection.remove(50);
    }


}
