package g1701_1800.s1786_number_of_restricted_paths_from_first_to_last_node;

// #Medium #Dynamic_Programming #Heap_Priority_Queue #Graph #Topological_Sort #Shortest_Path
// #2022_04_30_Time_86_ms_(88.56%)_Space_73.5_MB_(85.34%)

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("java:S1210")
public class Solution {

    private static class Pair implements Comparable<Pair> {
        int v;
        int cwt;

        Pair(int v, int cwt) {
            this.v = v;
            this.cwt = cwt;
        }

        public int compareTo(Pair o) {
            return 0;
        }
    }

    private static class Edge {
        int v;
        int wt;

        Edge(int v, int wt) {
            this.v = v;
            this.wt = wt;
        }
    }

    private int[] dtl;
    private int[] dp;
    private static final int M = 1000000007;

    public int countRestrictedPaths(int n, int[][] edges) {
        return 0;
    }

    private int dfs(List<List<Edge>> graph, int vtx, boolean[] vis, int n) {
        return 0;
    }

    private List<List<Edge>> buildGraph(int n, int[][] edges) {
        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];
            graph.get(u).add(new Edge(v, wt));
            graph.get(v).add(new Edge(u, wt));
        }
        return graph;
    }
}
