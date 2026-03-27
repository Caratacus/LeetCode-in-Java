package g3601_3700.s3621_number_of_integers_with_popcount_depth_equal_to_k_i;

// #Hard #Dynamic_Programming #Math #Combinatorics #Biweekly_Contest_161
// #2025_07_22_Time_9_ms_(70.67%)_Space_44.76_MB_(55.42%)

public class Solution {

    private static final int MX_LN = 61;
    private final long[][] slct = new long[MX_LN][MX_LN];
    private final int[] popHeight = new int[MX_LN];

    public Solution() {
        for (int i = 0; i < MX_LN; i++) {
            slct[i][0] = slct[i][i] = 1;
            for (int j = 1; j < i; j++) {
                slct[i][j] = slct[i - 1][j - 1] + slct[i - 1][j];
            }
        }
        popHeight[1] = 0;
        for (int v = 2; v < MX_LN; v++) {
            popHeight[v] = 1 + popHeight[Long.bitCount(v)];
        }
    }

    private long countNumbers(long upperLimit, int setBits) {
        return 0L;
    }

    public long popcountDepth(long tillNumber, int depthQuery) {
        return 0L;
    }
}
