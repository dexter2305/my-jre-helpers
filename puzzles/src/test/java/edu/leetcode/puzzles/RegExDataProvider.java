package edu.leetcode.puzzles;

import org.testng.annotations.DataProvider;

public class RegExDataProvider {

    @DataProvider(name = "validTestDataForNumbers")
    public static Object [][] getValidTestForNumbers(){

        return new Object[][] {
                {"123", true},
                {" 123", true},
                {" 123 ", true},
                {"1 23", false},

                {"+123", true},
                {"-123", true},
                {"123+", false},
                {"123-", false},
                {"1-23", false},
                {"++890", false},
                {"-+12", false},
                {"+-789", false},

                {"1.0", true},

                {"1.123e10", true},
                {"-1.123e90", true},
                {"1.123e-10", true},
                {" 1.123e-10 ", true},
                {"123E-10", true},
                {"123e", false},
                {"abc", false},

                {".1", true},
                {".", false},
                {"e", false},
                {"E", false}
        };

    }

}
