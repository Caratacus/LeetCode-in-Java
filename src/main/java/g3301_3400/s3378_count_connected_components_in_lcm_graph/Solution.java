package g3301_3400.s3378_count_connected_components_in_lcm_graph;

// #Hard #Array #Hash_Table #Math #Union_Find #Number_Theory
// #2024_12_10_Time_68_ms_(67.83%)_Space_59.8_MB_(62.24%)

public class Solution {

    private static class Unionfind {
        int[] parent;
        int[] rank;
        int totalComponents;

        public Unionfind(int n) {
            parent = new int[n];
            rank = new int[n];
            totalComponents = n;
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        public int find(int u) {
            return 0;
        }

        public void union(int u, int v) {}
    }

    public int countComponents(int[] nums, int threshold) {
        return 0;
    }
}
