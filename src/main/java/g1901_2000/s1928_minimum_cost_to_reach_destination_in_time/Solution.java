package g1901_2000.s1928_minimum_cost_to_reach_destination_in_time;

// #Hard #Dynamic_Programming #Graph #2022_05_15_Time_52_ms_(87.97%)_Space_43.1_MB_(82.82%)

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public int minCost(int maxTime, int[][] edges, int[] passingFees) {
        return 0;
    }

    private static class Graph {
        private final Map<Integer, List<Edge>> edges = new HashMap<>();

        private void addEdge(final int src, final int dst, final int weight) {}

        private List<Edge> getEdges(final int node) {
            return null;
        }
    }

    private static final class Edge {
        private final int dst;
        private final int weight;

        private Edge(final int dst, final int weight) {
            this.dst = dst;
            this.weight = weight;
        }
    }

    private static class Tuple {
        private final int node;
        private final int cost;
        private final int time;

        private Tuple(final int node, final int cost, final int time) {
            this.node = node;
            this.cost = cost;
            this.time = time;
        }
    }
}
