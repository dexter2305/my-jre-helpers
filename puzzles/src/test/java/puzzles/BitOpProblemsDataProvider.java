package puzzles;

import org.testng.annotations.DataProvider;

public class BitOpProblemsDataProvider {

    @DataProvider(name = "intWithHammingWeightProvider")
    public static Object[][] getIntegerWithHammingWeightData(){
        return new Object[][]{
                {1,1},
                {3,2},
                {0,0},
                {-7,30}
        };

    }
}
