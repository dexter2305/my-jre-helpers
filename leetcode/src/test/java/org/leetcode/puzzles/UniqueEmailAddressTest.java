package org.leetcode.puzzles;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UniqueEmailAddressTest {

    @Test(dataProviderClass = UniqueEmailAddressDataProvider.class, dataProvider = "emailAddressProvider")
    public void testUniqueEmailAddresses(final String[] emailAddressesAsTestData, final int expectedValidEmailIdCount){
        Assert.assertEquals(UniqueEmailAddress.countOfUniqueEmailAddresses(emailAddressesAsTestData),expectedValidEmailIdCount);
    }

}