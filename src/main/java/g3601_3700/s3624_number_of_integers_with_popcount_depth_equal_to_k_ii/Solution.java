package g3601_3700.s3624_number_of_integers_with_popcount_depth_equal_to_k_ii;

// #Hard #Array #Segment_Tree #Weekly_Contest_459
// #2025_07_22_Time_27_ms_(96.44%)_Space_125.92_MB_(24.76%)

public class Solution {

    private static final int[] DEPTH_TABLE = new int[65];

    static {
        DEPTH_TABLE[1] = 0;
        for (int i = 2; i <= 64; ++i) {
            DEPTH_TABLE[i] = 1 + DEPTH_TABLE[Integer.bitCount(i)];
        }
    }

    private int computeDepth(long number) {
        return 0;
    }

    public int[] popcountDepth(long[] nums, long[][] queries) {
        return null;
    }

    private static class FenwickTree {
        private int[] tree;
        private int size;

        public FenwickTree() {
            this.size = 0;
        }

        public void build(int n) {}

        public void update(int index, int value) {}

        public int query(int index) {
            return 0;
        }

        public int queryRange(int left, int right) {
            return 0;
        }
    }
}
