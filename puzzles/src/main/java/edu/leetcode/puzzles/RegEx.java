package edu.leetcode.puzzles;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

    public static boolean isValidNumber(String data) {

        final String patternString = "^\\s*[+|-]?\\d*(.\\d)?\\d*([e|E][+|-]?\\d+)?\\s*$";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(data);
        return matcher.find();
    }

}
