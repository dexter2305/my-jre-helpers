package edu.udemy.dsa.bootcamp;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

@Test(suiteName = "units-FixedArray")
public class FixedArrayTest {

    private FixedArray<String> array;

    @AfterMethod
    public void afterEveryTest() {
        array = null;
    }

    @Test
    public void testForInitialCapacity() {
        FixedArray<String> strings = new FixedArray<>(5);
        Assert.assertEquals(strings.getCapacity(), 5);
    }


    @Test
    public void testForCurrentSize() {
        array = new FixedArray<>(3);
        array.add("data1");
        Assert.assertEquals(array.size(),1);
    }

    @Test
    public void testAdd_toReturnIndexOfFirst(){
        array = new FixedArray<>(2);
        int position = array.add("data");
        Assert.assertEquals(position, 0, "First add should happen in position '0'");
    }

    @Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
    public void testAdd_forArrayOverflow() {
        array = new FixedArray<>(3);
        array.add("data1");
        array.add("data2");
        array.add("data3");
        array.add("data4");
    }

    @Test
    public void testForGet(){
        array = new FixedArray<>(3);
        array.add("data1");
        Assert.assertEquals(array.get(0), "data1");
    }

    @Test(expectedExceptions = IndexOutOfBoundsException.class)
    public void testForGetAboveRange(){
        array = new FixedArray<>(3);
        array.get(5);
    }

    @Test(expectedExceptions = IndexOutOfBoundsException.class)
    public void testForBelowAboveRange(){
        array = new FixedArray<>(3);
        array.get(-1);
    }


    @Test
    public void testInit_ForDefaultValueAsNull(){
        array = new FixedArray<>(3);
        for (int index = 0; index < array.getCapacity(); index++){
            Assert.assertNull(array.get(index));
        }
    }

    @Test
    public void testForSet(){
        array = new FixedArray<>(3);
        array.add("data1");
        array.set(0,"setData");
        Assert.assertEquals(array.get(0), "setData");
    }

    @Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
    public void testForSetAboveRange(){
        array = new FixedArray<>(3);
        array.add("data1");
        array.set(5,"setData");
    }

    @Test
    public void testInsert(){
        array = new FixedArray<>(3);
        array.add("a");
        array.add("c");
        array.insert(1, "b");
        Assert.assertEquals(array.get(1), "b");
    }

    @Test(expectedExceptions = IndexOutOfBoundsException.class)
    public void testForInsertAboveRange(){
        array = new FixedArray<>(3);
        array.insert(5, "some-data");
    }

    @Test(expectedExceptions = IndexOutOfBoundsException.class)
    public void testForInsertBelowRange(){
        array = new FixedArray<>(3);
        array.insert(-1, "some-data");
    }

    @Test
    public void testRemoveForRemovedItemFromMiddle(){
        array = new FixedArray<>(5);
        array.add("a");
        array.add("b");
        array.add("c");
        String removedItem = array.remove(1);
        Assert.assertEquals(removedItem, "b");
    }

    @Test
    public void testRemoveFromTail(){
        array = new FixedArray<>(5);
        array.add("a");
        array.add("b");
        array.add("c");
        array.add("d");
        array.add("e");
        String removedItem = array.remove(1);
        Assert.assertEquals(removedItem, "b");
    }

}