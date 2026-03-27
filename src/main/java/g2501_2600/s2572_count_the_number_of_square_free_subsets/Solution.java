package g2501_2600.s2572_count_the_number_of_square_free_subsets;

// #Medium #Array #Dynamic_Programming #Math #Bit_Manipulation #Bitmask
// #2023_08_21_Time_1_ms_(100.00%)_Space_41.5_MB_(79.12%)

public class Solution {

    private final int[] count = new int[31];
    private final int[] masks = new int[31];
    private final long[][] cache = new long[31][1 << 6];
    private static final long MOD = 1_000_000_007;

    public int squareFreeSubsets(int[] nums) {
        return 0;
    }

    private long dfs(int k, int mask) {
        return 0L;
    }

    private int powof2(int k) {
        return 0;
    }
}
