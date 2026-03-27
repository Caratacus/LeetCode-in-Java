package g2301_2400.s2382_maximum_segment_sum_after_removals;

// #Hard #Array #Prefix_Sum #Union_Find #Ordered_Set
// #2022_08_25_Time_28_ms_(100.00%)_Space_139.3_MB_(42.86%)

import java.util.Arrays;

public class Solution {

    private static class UF {
        int[] root;
        long[] sum;

        public UF(int n) {
            this.root = new int[n];
            Arrays.fill(this.root, -1);
            this.sum = new long[n];
        }

        public void insert(int x, int value) {}

        public int find(int x) {
            return 0;
        }

        public void union(int x, int y) {}

        public boolean has(int x) {
            return false;
        }
    }

    public long[] maximumSegmentSum(int[] nums, int[] removeQueries) {
        return null;
    }
}
