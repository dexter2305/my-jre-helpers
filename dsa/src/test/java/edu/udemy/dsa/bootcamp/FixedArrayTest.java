package edu.udemy.dsa.bootcamp;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class FixedArrayTest {

    private FixedArray<String> collection;

    @BeforeMethod
    public void afterEveryTest() {
        collection = new FixedArray<>(3);
    }

    @Test
    public void testForCapacity() {
        Assert.assertEquals(collection.getCapacity(), 3);
    }

    @Test
    public void testForSet(){
        FixedArray<String> collection = new FixedArray<>(2);
        collection.set(0, "a");
        collection.set(0, "a-new-value");
        Assert.assertEquals(collection.get(0), "a-new-value");
    }

    @Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
    public void testForSet_AboveRange() {
        collection = new FixedArray<>(2);
        collection.set(3, "value");
    }

    @Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
    public void testForSet_BelowRange() {
        collection = new FixedArray<>(2);
        collection.set(-3, "value");
    }

    @Test
    public void testForGet_AfterInit(){
        collection = new FixedArray<>(1);
        Assert.assertNull(collection.get(0));
    }

    @Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
    public void testForGet_AboveRange(){
        collection = new FixedArray<>(1);
        collection.get(100);
    }

    @Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
    public void testForGet_BelowRange(){
        collection = new FixedArray<>(1);
        collection.get(-1);
    }
}