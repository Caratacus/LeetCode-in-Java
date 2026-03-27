package g3501_3600.s3575_maximum_good_subtree_score;

// #Hard #Array #Dynamic_Programming #Depth_First_Search #Tree #Bit_Manipulation #Bitmask
// #2025_06_10_Time_92_ms_(98.73%)_Space_55.23_MB_(11.71%)

import java.util.List;

@SuppressWarnings("unchecked")
public class Solution {

    private static final int DIGITS = 10;
    private static final int FULL = 1 << DIGITS;
    private static final long NEG = Long.MIN_VALUE / 4;
    private static final long MOD = (long) 1e9 + 7;
    private List<Integer>[] tree;
    private int[] val;
    private int[] mask;
    private boolean[] isOk;
    private long res = 0;

    public int goodSubtreeSum(int[] vals, int[] par) {
        return 0;
    }

    private long[] dfs(int u) {
        return null;
    }
}
