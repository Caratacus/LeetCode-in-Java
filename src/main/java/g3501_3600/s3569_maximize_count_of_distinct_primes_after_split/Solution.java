package g3501_3600.s3569_maximize_count_of_distinct_primes_after_split;

// #Hard #Array #Math #Segment_Tree #Number_Theory
// #2025_06_03_Time_280_ms_(97.30%)_Space_76.62_MB_(52.25%)

import java.util.Arrays;

@SuppressWarnings("java:S6541")
public class Solution {

    private static final int MAX_VAL = 100005;
    private static boolean[] isPrime = new boolean[MAX_VAL];

    static {
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i < MAX_VAL; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < MAX_VAL; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }

    private static class Node {
        int maxVal;
        int lazyDelta;
    }

    private static class SegmentTree {
        Node[] tree;
        int n;

        public SegmentTree(int n) {
            this.n = n;
            tree = new Node[4 * this.n];
            for (int i = 0; i < 4 * this.n; i++) {
                tree[i] = new Node();
            }
        }

        private void push(int nodeIdx) {}

        private void update(int queryStart, int queryEnd, int delta) {}

        private void update(
                int nodeIdx, int start, int end, int queryStart, int queryEnd, int delta) {}

        public int queryMax() {
            return 0;
        }
    }

    public int[] maximumCount(int[] nums, int[][] queries) {
        return null;
    }
}
