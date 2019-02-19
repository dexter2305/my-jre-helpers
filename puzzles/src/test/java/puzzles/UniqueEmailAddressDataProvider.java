package puzzles;

import org.testng.annotations.DataProvider;

public class UniqueEmailAddressDataProvider {

    @DataProvider(name = "emailAddressProvider")
    public static Object[][] emailAddresses() {
        return new Object[][]{
                {new String[]{"test@leetcode.com"}, 1},
                {new String[]{"test.email@lc.com", "testemail@lc.com"}, 1},
                {new String[]{"test+whatever@lc.com", "test@lc.com"}, 1},
                {new String[]{"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"}, 2},
                {new String[]{"+whatever@lc.com"}, 0},
                {new String[]{".@lc.com"}, 0},
                {new String[]{"ab..c@lc.com", "abc@lc.com"}, 1},
                {new String[]{"ab...@lc.com", "abc@lc.com"}, 2},
                {new String[]{"abc.+.c@lc.com", "abc@lc.com"}, 1},
                {new String[]{"abc+++c@lc.com", "abc@lc.com"}, 1},
                {new String[]{"+++@lc.com"}, 0},
                {new String[]{"...@lc.com"}, 0},
        };
    }

}
