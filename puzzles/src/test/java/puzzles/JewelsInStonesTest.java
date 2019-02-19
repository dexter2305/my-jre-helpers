package puzzles;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JewelsInStonesTest {


    @Test(dataProviderClass = JewelsInStonesDataProvider.class, dataProvider = "jewelsInStonesDataProvider")
    public void testNumberOfJewelsInStone(final String jewels, final String stones, final int expectedCount) {
        Assert.assertEquals(JewelsAndStones.nOfJewelsInStones(jewels, stones), expectedCount);
    }

}