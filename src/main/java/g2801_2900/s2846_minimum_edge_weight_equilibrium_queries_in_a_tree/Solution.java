package g2801_2900.s2846_minimum_edge_weight_equilibrium_queries_in_a_tree;

// #Hard #Array #Tree #Graph #Strongly_Connected_Component
// #2023_12_13_Time_74_ms_(66.04%)_Space_57_MB_(50.94%)

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("java:S107")
public class Solution {

    private static class Node {
        int v;
        int w;

        Node(int v, int w) {
            this.v = v;
            this.w = w;
        }
    }

    public int[] minOperationsQueries(int n, int[][] edges, int[][] queries) {
        return null;
    }

    private int lca(int src, int dest, int[][] up, int height, int[] level) {
        return 0;
    }

    private int getKthAncestor(int node, int k, int[][] up, int height) {
        return 0;
    }

    private int processResult(int[] freqSrc, int[] freqDest, int[] freqLCA) {
        return 0;
    }

    private void dfs(
            List<List<Node>> graph,
            int src,
            int currlevel,
            int p,
            int[] parent,
            int[] level,
            int[][] weightFreq,
            int[] freq) {}

    private List<List<Node>> createGraph(int[][] edges, int n) {
        List<List<Node>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            graph.get(u).add(new Node(v, w));
            graph.get(v).add(new Node(u, w));
        }
        return graph;
    }
}
