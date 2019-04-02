package edu.udemy.dsa.bootcamp;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class DynamicArrayIntegrityTest {

    private DynamicArray<String> collection;

    @BeforeMethod
    public void beforeEveryTest(){
        collection = new DynamicArray<>();
    }

    @Test(description = "Size of dynamic increases with every add")
    public void testIncrementInSizeAfterAdd(){
        collection.add("hello");
        collection.add("world");
        Assert.assertEquals(collection.size(), 2);
    }

    @Test(description = "Size of dynamic increases with every add")
    public void testDecrementInSizeAfterRemove(){
        collection.add("hello");
        collection.add("world");
        collection.remove(1);
        collection.remove(0);
        Assert.assertEquals(collection.size(), 0);
    }


    @Test
    public void testGet_AfterAdd(){
        collection.add("hello");
        Assert.assertEquals(collection.get(0), "hello");
    }



    @Test
    public void testForOrderAfterRemove(){
        collection.add("hello");
        collection.add("world");
        collection.remove(0);
        Assert.assertEquals(collection.get(0), "world");
    }


}