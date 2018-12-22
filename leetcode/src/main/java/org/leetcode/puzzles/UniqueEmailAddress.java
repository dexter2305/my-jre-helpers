package org.leetcode.puzzles;

import java.util.Arrays;

public class UniqueEmailAddress {

    private UniqueEmailAddress() {
    }

    /**
     * leetcode/problems/929
     * @param emailAddresses
     * @return
     */
    static long countOfUniqueEmailAddresses(final String[] emailAddresses) {
        long counter;

        counter = Arrays.stream(emailAddresses)
                .map(s -> {
                    //remove + from localName
                    final String[] parts = s.split("@");
                    String local = parts[0];
                    local = local.indexOf('+') > -1 ? local.substring(0, local.indexOf('+')) : local;
                    return local.isEmpty() ? "" : local + "@" + parts[1];
                })
                .filter(s -> !s.isEmpty())
                .map(s -> {
                    //ignore . from localName
                    final String[] parts = s.split("@");
                    String local = parts[0];
                    local = local.replaceAll("\\.", "");
                    return local.isEmpty() ? "" : local + "@" + parts[1];
                })
                .filter(s -> !s.isEmpty())
                .distinct()
                .count();

        return counter;
    }
}