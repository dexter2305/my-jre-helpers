package puzzles;

import java.util.StringTokenizer;

/**
 * leetcode-problems
 */
public class StringProblems {

    private StringProblems(){}

    /**
     * leetcode-problems/344
     * @param string
     * @return
     */
    static String reverseUsingSB(final String string) {
        if (null == string) return string;
        return new StringBuffer(string).reverse().toString();
    }

    /**
     * leetcodeproblems/557
     * @param line
     * @return
     */
    static String reverseWordsInALine(final String line){
        if (null == line) return line;
        final StringTokenizer tokenizer  = new StringTokenizer(line);
        StringBuffer inverted = new StringBuffer();
        while(tokenizer.hasMoreTokens()){
            inverted.append(new StringBuffer(tokenizer.nextToken()).reverse().toString())
                    .append(" ");
        }
        return inverted.toString().trim();
    }

    /**
     * leetcode/problems/709
     */
    static String toLower(String string){
        return string ==null ? null : string.toLowerCase();
    }
}
