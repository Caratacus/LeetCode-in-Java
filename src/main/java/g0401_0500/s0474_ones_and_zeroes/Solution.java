package g0401_0500.s0474_ones_and_zeroes;

// #Medium #Array #String #Dynamic_Programming
// #2022_07_20_Time_41_ms_(60.42%)_Space_42.5_MB_(73.29%)

public class Solution {

    /*
     * The problem can be interpreted as:
     * What's the max number of str can we pick from strs with limitation of m "0"s and n "1"s.
     *
     * Thus we can define dp[i][j] as it stands for max number of str can we pick from strs with limitation
     * of i "0"s and j "1"s.
     *
     * For each str, assume it has a "0"s and b "1"s, we update the dp array iteratively
     * and set dp[i][j] = Math.max(dp[i][j], dp[i - a][j - b] + 1).
     * So at the end, dp[m][n] is the answer.
     */
    public int findMaxForm(String[] strs, int m, int n) {
        return 0;
    }

    private int[] count(String str) {
        return null;
    }
}
