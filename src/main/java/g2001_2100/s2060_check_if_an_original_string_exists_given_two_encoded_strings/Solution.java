package g2001_2100.s2060_check_if_an_original_string_exists_given_two_encoded_strings;

// #Hard #String #Dynamic_Programming #2022_05_29_Time_354_ms_(69.39%)_Space_209.4_MB_(51.21%)

import java.util.List;

public class Solution {

    private boolean stringMatched = false;
    private String s1;
    private String s2;

    static class Key {
        int i1;
        int i2;

        Key(int i1, int i2) {
            this.i1 = i1;
            this.i2 = i2;
        }
    }

    private Boolean[][][] memo;

    public boolean possiblyEquals(String s1, String s2) {
        return false;
    }

    private void dfs(int i1, int i2, int diff) {}

    private boolean extracted(
            int i1, int i2, int diff, List<int[]> indexNums1, List<int[]> indexNums2) {
        return false;
    }
}
