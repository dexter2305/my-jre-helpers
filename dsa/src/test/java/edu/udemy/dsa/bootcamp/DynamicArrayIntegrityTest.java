package edu.udemy.dsa.bootcamp;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test(suiteName = "integrity")
public class DynamicArrayIntegrityTest {

    private DynamicArray<String> collection;

    @BeforeMethod
    public void beforeEveryTest(){
        collection = new DynamicArray<>(2);
    }

    public void testSetGet(){
        collection.set(0, "a");
        collection.set(1, "b");

        Assert.assertEquals(collection.get(0), "a");
        Assert.assertEquals(collection.get(1), "b");
    }

}