package g1101_1200.s1192_critical_connections_in_a_network;

// #Hard #Depth_First_Search #Graph #Biconnected_Component
// #2022_03_03_Time_127_ms_(89.39%)_Space_262.1_MB_(59.13%)

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        // build graph
        for (List<Integer> conn : connections) {
            int x = conn.get(0);
            int y = conn.get(1);
            graph.get(x).add(y);
            graph.get(y).add(x);
        }
        // record rank
        int[] rank = new int[n];
        // store result
        List<List<Integer>> res = new ArrayList<>();
        dfs(graph, 0, 1, -1, rank, res);
        return res;
    }

    // rank[] records the each node's smallest rank(min (it's natural rank, neighbors's smallest
    // rank))
    private int dfs(
            List<List<Integer>> graph,
            int node,
            int time,
            int parent,
            int[] rank,
            List<List<Integer>> res) {
        return 0;
    }
}
