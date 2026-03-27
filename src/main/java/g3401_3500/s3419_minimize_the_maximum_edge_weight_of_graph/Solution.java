package g3401_3500.s3419_minimize_the_maximum_edge_weight_of_graph;

// #Medium #Depth_First_Search #Breadth_First_Search #Binary_Search #Graph #Shortest_Path
// #2025_01_15_Time_64_ms_(99.28%)_Space_110.17_MB_(57.63%)

import java.util.ArrayList;

@SuppressWarnings({"unchecked", "unused", "java:S1172"})
public class Solution {

    private ArrayList<ArrayList<Pair>> revadj;

    private static class Pair {
        int node;
        int weight;

        public Pair(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }
    }

    public int minMaxWeight(int n, int[][] edges, int threshold) {
        return 0;
    }

    private boolean check(int n) {
        return false;
    }

    private void dfs(int u, int[] vis, ArrayList<Integer> nodes) {}
}
