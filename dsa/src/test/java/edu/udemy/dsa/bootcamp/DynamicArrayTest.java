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
    public void testSize() {
        collection = new DynamicArray<>(10);
        Assert.assertEquals(collection.size(), 10);
    }

    @Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
    public void testRemove_BelowRange(){
        collection = new DynamicArray<>(2);
        collection.remove(-100);
    }

    @Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
    public void testRemove_AboveRange(){
        collection = new DynamicArray<>(2);
        collection.remove(100);
    }

    @Test
    public void testRemoveForReturnedItem(){
        collection = new DynamicArray<>(2);
        collection.set(1, "value-1");
        String returnedItem = collection.remove(1);
        Assert.assertEquals(returnedItem, "value-1");
    }

    @Test
    public void testRemoveForValueReset(){
        collection = new DynamicArray<>(2);
        collection.set(1, "value-1");
        collection.remove(1);
        Assert.assertNull(collection.get(1));
    }

    @Test
    public void testInsert(){
        collection = new DynamicArray<>(2);
        collection.insert(5, "value-100");
    }

}
