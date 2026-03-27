package g2901_3000.s2926_maximum_balanced_subsequence_sum;

// #Hard #Array #Dynamic_Programming #Binary_Search #Segment_Tree #Binary_Indexed_Tree
// #2023_12_29_Time_37_ms_(99.23%)_Space_68.2_MB_(17.41%)

public class Solution {

    public long maxBalancedSubsequenceSum(int[] nums) {
        return 0L;
    }

    private static class BIT {
        long[] tree;
        int n;

        public BIT(int n) {
            this.n = n;
            tree = new long[n + 1];
        }

        public int lowbit(int index) {
            return 0;
        }

        public void update(int index, long v) {}

        public long query(int index) {
            return 0L;
        }
    }
}
