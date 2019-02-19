package puzzles;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringProblemsTest {

    @Test(dataProvider = "stringProvider", dataProviderClass = StringProblemsDataProvider.class)
    public void testReverseStringUsingSB(final String givenString, final String expectedString) {
        Assert.assertEquals(StringProblems.reverseUsingSB(givenString), expectedString);
    }


    @Test(dataProvider = "lineProvider", dataProviderClass = StringProblemsDataProvider.class)
    public void testReverseWordsInALine(final String givenLine, final String expectedLine) {
        Assert.assertEquals(StringProblems.reverseWordsInALine(givenLine), expectedLine);
    }

    @Test(dataProviderClass = StringProblemsDataProvider.class, dataProvider = "lowerCaseDataProvider")
    public void testForLowerCase(String data, String expectation){
        Assert.assertEquals(StringProblems.toLower(data), expectation);
    }

}