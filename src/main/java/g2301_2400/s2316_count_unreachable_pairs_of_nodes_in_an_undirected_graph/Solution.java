package g2301_2400.s2316_count_unreachable_pairs_of_nodes_in_an_undirected_graph;

// #Medium #Depth_First_Search #Breadth_First_Search #Graph #Union_Find
// #2022_06_26_Time_32_ms_(100.00%)_Space_108.9_MB_(100.00%)

public class Solution {

    public long countPairs(int n, int[][] edges) {
        return 0L;
    }

    private static class DSU {
        int[] rank;
        int[] parent;

        DSU(int n) {
            rank = new int[n + 1];
            parent = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                parent[i] = i;
            }
        }

        int findParent(int node) {
            if (parent[node] == node) {
                return node;
            }
            parent[node] = findParent(parent[node]);
            return findParent(parent[node]);
        }

        boolean union(int x, int y) {
            int px = findParent(x);
            int py = findParent(y);
            if (px == py) {
                return false;
            }
            if (rank[px] > rank[py]) {
                parent[py] = px;
            } else {
                parent[px] = py;
                rank[py]++;
            }
            return true;
        }
    }
}
