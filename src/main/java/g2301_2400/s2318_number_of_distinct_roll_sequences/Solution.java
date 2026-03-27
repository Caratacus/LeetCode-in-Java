package g2301_2400.s2318_number_of_distinct_roll_sequences;

// #Hard #Dynamic_Programming #Memoization #2022_06_26_Time_254_ms_(91.67%)_Space_51.6_MB_(58.33%)

public class Solution {

    private static final int MOD = 1000000007;
    private static final int[][] M = {
        {1, 2, 3, 4, 5, 6},
        {2, 3, 4, 5, 6},
        {1, 3, 5},
        {1, 2, 4, 5},
        {1, 3, 5},
        {1, 2, 3, 4, 6},
        {1, 5}
    };
    private final int[][][] memo = new int[10001][7][7];

    public int distinctSequences(int n) {
        return 0;
    }

    private int dp(int n, int prev, int pprev) {
        return 0;
    }
}
