package edu.udemy.dsa.bootcamp;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FixedArrayIntegrityTest {

    @Test
    public void testForSetGet() {
        FixedArray<String> collection = new FixedArray<>(2);
        collection.set(0, "a");
        collection.set(1, "b");
        Assert.assertEquals(collection.get(0), "a");
        Assert.assertEquals(collection.get(1), "b");
    }

}
