package edu.leetcode.puzzles;

import org.testng.annotations.DataProvider;

public class StringProblemsDataProvider {


    @org.testng.annotations.DataProvider(name = "stringProvider")
    public static Object[][] provideWords() {
        return new String[][]{
                {null, null},
                {"", ""},
                {"A man, a plan, a canal: Panama", "amanaP :lanac a ,nalp a ,nam A"},

        };
    }


    @org.testng.annotations.DataProvider(name = "lineProvider")
    public static Object[][] provideLines() {
        return new String[][]{
                {null, null},
                {"", ""},
                {"Let's take LeetCode contest", "s'teL ekat edoCteeL tsetnoc"},

        };
    }

    @DataProvider(name = "lowerCaseDataProvider")
    public static Object[][] provideStrings(){
        return new Object[][]{
                {"lower", "lower"},
                {"MiXED", "mixed"},
                {null, null},
                {"", ""},
                {"123", "123"}
        };
    }

}
