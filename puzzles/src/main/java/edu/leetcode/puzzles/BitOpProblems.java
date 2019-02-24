package edu.leetcode.puzzles;

public class BitOpProblems {

    private BitOpProblems(){}

    public static int hammingWeight(int n) {
        int hammingWeight = 0;
        for (int i = 0; i < 32; i++) {
            hammingWeight += n & 1;
            n = n >>> 1;
        }
        return hammingWeight;
    }


}
