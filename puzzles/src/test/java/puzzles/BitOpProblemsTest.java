package puzzles;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BitOpProblemsTest {

    @Test(dataProviderClass = BitOpProblemsDataProvider.class, dataProvider = "intWithHammingWeightProvider")
    public void testHammingWeight(final int number, final int hammingWeight) {
        Assert.assertEquals(BitOpProblems.hammingWeight(number), hammingWeight);
    }
}