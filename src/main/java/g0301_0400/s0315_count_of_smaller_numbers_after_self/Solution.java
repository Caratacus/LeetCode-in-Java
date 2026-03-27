package g0301_0400.s0315_count_of_smaller_numbers_after_self;

// #Hard #Array #Binary_Search #Ordered_Set #Divide_and_Conquer #Segment_Tree #Binary_Indexed_Tree
// #Merge_Sort #2022_07_08_Time_36_ms_(98.63%)_Space_119_MB_(77.48%)

import java.util.List;

public class Solution {

    public List<Integer> countSmaller(int[] nums) {
        return null;
    }

    private static class FenwickTree {
        // binary index tree, index 0 is not used
        int[] bit;
        int n;

        public FenwickTree(int n) {
            this.n = n + 1;
            this.bit = new int[this.n];
        }

        public void update(int i, int v) {}

        // prefix sum query
        private int ps(int j) {
            return 0;
        }
    }
}
