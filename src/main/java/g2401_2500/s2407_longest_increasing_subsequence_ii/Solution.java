package g2401_2500.s2407_longest_increasing_subsequence_ii;

// #Hard #Array #Dynamic_Programming #Divide_and_Conquer #Queue #Segment_Tree #Binary_Indexed_Tree
// #Monotonic_Queue #2022_10_24_Time_24_ms_(99.21%)_Space_50.3_MB_(98.08%)

public class Solution {

    private static class SegTree {
        private int[] arr;
        private int n;

        public SegTree(int n) {
            this.n = n;
            arr = new int[2 * n];
        }

        public int query(int l, int r) {
            return 0;
        }

        public void update(int i, int val) {}
    }

    public int lengthOfLIS(int[] nums, int k) {
        return 0;
    }
}
