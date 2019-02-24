package edu.udemy.dsa.bootcamp;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test (suiteName = "integrity")
public class FixedArrayIntegrityTest {



    public void testForSizeAfterAdd(){
        FixedArray<String> collection = new FixedArray<>(5);
        collection.add("a");
        collection.add("b");
        collection.add("c");
        Assert.assertEquals(collection.size(), 3);
    }

    public void testForSizeAfterRemove(){
        FixedArray<String> collection = new FixedArray<>(5);
        collection.add("a");
        collection.add("b");
        collection.add("c");
        collection.remove(1);
        Assert.assertEquals(collection.size(), 2);
    }

    public void testForSizeAfterInternalInsert(){
        FixedArray<String> collection = new FixedArray<>(5);
        collection.add("a");
        collection.add("b");
        collection.add("c");
        collection.insert(1,"a.1");
        Assert.assertEquals(collection.size(), 4);
    }

    public void testForSizeAfterBoundaryInsert(){
        FixedArray<String> collection = new FixedArray<>(5);
        collection.insert(4, "boundary");
        Assert.assertEquals(collection.size(), 1);
    }

    public void testForSizeAfterInsertAndAdd(){
        FixedArray<String> collection = new FixedArray<>(5);
        collection.insert(4, "4");
        Assert.assertEquals(collection.size(), 1);
        collection.add("0");
        Assert.assertEquals(collection.size(), 2);

    }

    public void testForElementsOrderAfterInsertAndAdd(){
        FixedArray<String> collection = new FixedArray<>(3);
        collection.insert(2,"2");
        collection.add("0");
        collection.add("1");
        Assert.assertEquals(collection.get(0), "0");
        Assert.assertEquals(collection.get(1), "1");
        Assert.assertEquals(collection.get(2), "2");
    }
}
