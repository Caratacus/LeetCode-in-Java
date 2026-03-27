package g2001_2100.s2065_maximum_path_quality_of_a_graph;

// #Hard #Array #Graph #Backtracking #2022_05_29_Time_94_ms_(95.34%)_Space_67.9_MB_(59.84%)

import java.util.List;

public class Solution {

    private int maxQuality;

    static class Node {
        int i;
        int time;

        public Node(int i, int time) {
            this.i = i;
            this.time = time;
        }
    }

    public int maximalPathQuality(int[] values, int[][] edges, int maxTime) {
        return 0;
    }

    private void dfs(
            List<List<Node>> graph,
            int start,
            int curTime,
            int maxTime,
            int curValue,
            int[] values) {}
}
