package g2601_2700.s2685_count_the_number_of_complete_components;

// #Medium #Array #Dynamic_Programming #Depth_First_Search #Breadth_First_Search #Matrix #Graph
// #2023_09_12_Time_5_ms_(98.65%)_Space_43.8_MB_(65.96%)

public class Solution {

    private static class DSU {
        int[] roots;
        int[] sizes;

        DSU(int n) {
            roots = new int[n];
            sizes = new int[n];
            for (int i = 0; i < n; i++) {
                sizes[i] = 1;
                roots[i] = i;
            }
        }

        public int find(int v) {
            return 0;
        }

        public void union(int a, int b) {}
    }

    public int countCompleteComponents(int n, int[][] edges) {
        return 0;
    }
}
