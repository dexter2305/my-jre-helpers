package edu.leetcode.puzzles;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RegExTest {

    @Test(dataProviderClass = RegExDataProvider.class, dataProvider = "validTestDataForNumbers")
    public void testIsValidNumber(String data, boolean expectation) {
        Assert.assertEquals(RegEx.isValidNumber(data), expectation);
    }
}