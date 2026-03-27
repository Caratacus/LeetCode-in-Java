package g1601_1700.s1627_graph_connectivity_with_threshold;

// #Hard #Array #Math #Union_Find #2022_04_18_Time_7_ms_(98.45%)_Space_75.7_MB_(97.93%)

import java.util.List;

public class Solution {

    public List<Boolean> areConnected(int n, int threshold, int[][] queries) {
        return null;
    }

    private static class DisjointSetUnion {
        private final int[] rank;
        private final int[] parent;

        public DisjointSetUnion(int n) {
            rank = new int[n];
            parent = new int[n];
            for (int i = 0; i < n; i++) {
                this.rank[i] = 1;
                this.parent[i] = i;
            }
        }

        public int find(int u) {
            return 0;
        }

        public void union(int u, int v) {}
    }
}
