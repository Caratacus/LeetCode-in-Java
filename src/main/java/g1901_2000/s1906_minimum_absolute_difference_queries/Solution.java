package g1901_2000.s1906_minimum_absolute_difference_queries;

// #Medium #Array #Hash_Table #2022_05_11_Time_176_ms_(71.61%)_Space_82.6_MB_(95.48%)

import java.util.Arrays;
import java.util.BitSet;

public class Solution {

    private static class SegmentTree {
        static class Node {
            BitSet bits;
            int minDiff;
        }

        int len;
        int[] nums;
        Node[] tree;
        static final int INF = 200;

        SegmentTree(int[] nums, int len) {
            this.nums = Arrays.copyOf(nums, len);
            this.len = len;
            tree = new Node[4 * len];
            buildTree(0, len - 1, 0);
        }

        private void buildTree(int i, int j, int ti) {}

        private Node combineNodes(Node n1, Node n2) {
            return null;
        }

        private int findMinDiff(BitSet bits) {
            return 0;
        }

        private int findMinAbsDiff(int start, int end, int i, int j, int ti) {
            return 0;
        }

        private Node findMinAbsDiff2(int start, int end, int i, int j, int ti) {
            return null;
        }
    }

    public int[] minDifference(int[] nums, int[][] queries) {
        return null;
    }
}
