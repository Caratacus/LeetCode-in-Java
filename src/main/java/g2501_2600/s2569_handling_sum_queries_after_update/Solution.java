package g2501_2600.s2569_handling_sum_queries_after_update;

// #Hard #Array #Segment_Tree #2023_08_21_Time_27_ms_(94.87%)_Space_84.1_MB_(43.59%)

public class Solution {

    public long[] handleQuery(int[] nums1, int[] nums2, int[][] queries) {
        return null;
    }

    private static class Segment {
        long sum;
        int f;
        int lo;
        int hi;
        Segment left;
        Segment right;

        public Segment(int l, int r) {
            lo = l;
            hi = r;
        }

        public void flip(int l, int r) {}
    }

    private Segment build(int[] nums, int l, int r) {
        return null;
    }
}
