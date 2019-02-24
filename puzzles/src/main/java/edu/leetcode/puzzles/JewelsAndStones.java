package edu.leetcode.puzzles;

import java.util.HashMap;
import java.util.Map;

public class JewelsAndStones {

    private JewelsAndStones(){}

    /**
     * leetcode-problems/771
     */
    public static int nOfJewelsInStones(final String jewels, final String stones) {
        if (null == jewels || null == stones) return 0;
        if (jewels.length() == 0 || stones.length() == 0) return 0;
        return getNumberOfJewels(jewels, stoneReport(stones));
    }

    static Map<Character, Integer> stoneReport(final String stones) {
        final Map<Character, Integer> stoneTable = new HashMap<>();
        final int nOfStones = stones.length();
        char thisStone;
        Integer thisStoneCount;
        for (int i = 0; i < nOfStones; i++) {
            thisStone = stones.charAt(i);
            thisStoneCount = stoneTable.get(thisStone);
            thisStoneCount = thisStoneCount == null ? 1 : ++thisStoneCount;
            stoneTable.put(thisStone, thisStoneCount);
        }
        return stoneTable;
    }

    static Integer getNumberOfJewels(final String jewels, final Map<Character, Integer> stoneTable){
        int counter = 0;
        for (int i = 0; i < jewels.length(); i++) {
            final char jewel = jewels.charAt(i);
            if (stoneTable.containsKey(jewel)){
                counter += stoneTable.get(jewel);
            }
        }
        return counter;
    }

}
