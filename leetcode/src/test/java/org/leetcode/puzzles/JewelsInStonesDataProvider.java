package org.leetcode.puzzles;

import org.testng.annotations.DataProvider;

public class JewelsInStonesDataProvider {


    @DataProvider(name = "jewelsInStonesDataProvider")
    public static Object[][] jewelsInStonesDataProvider() {
        return new Object[][]{
                {"", "", 0},
                {null, null, 0},
                {"", null, 0},
                {null, "", 0},
                {"a", "a", 1},
                {"a", "A", 0},
                {"a", "bcd", 0},
                {"a", "baaabaaa", 6},
                {"1", "", 0},
                {"aA", "aAAbbbb", 3},
                {"z", "ZZ", 0}

        };
    }

}
