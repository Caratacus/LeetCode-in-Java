package g1101_1200.s1129_shortest_path_with_alternating_colors;

// #Medium #Breadth_First_Search #Graph #Graph_Theory_I_Day_10_Standard_Traversal
// #2023_06_01_Time_4_ms_(96.63%)_Space_44.3_MB_(10.59%)

import java.util.List;
import java.util.Queue;

public class Solution {

    private static class Pair {
        int color;
        int node;

        Pair(int node, int color) {
            this.node = node;
            this.color = color;
        }
    }

    private void bfs(
            Queue<Integer> q,
            boolean[][] vis,
            List<List<Pair>> graph,
            boolean blue,
            int[] shortestPaths) {}

    public int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {
        return null;
    }
}
