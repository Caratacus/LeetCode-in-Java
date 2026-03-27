package g0801_0900.s0886_possible_bipartition;

// #Medium #Depth_First_Search #Breadth_First_Search #Graph #Union_Find
// #Graph_Theory_I_Day_14_Graph_Theory #2022_03_28_Time_20_ms_(80.12%)_Space_75.6_MB_(32.57%)

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class Solution {

    public boolean possibleBipartition(int n, int[][] dislikes) {
        return false;
    }

    private boolean checkBipartiteDFS(Graph g, boolean[] marked, boolean[] colors, int v) {
        return false;
    }

    private static class Graph {
        private ArrayList<Integer>[] adj;

        public Graph(int v) {
            adj = new ArrayList[v];
            for (int i = 0; i < v; i++) {
                adj[i] = new ArrayList<>();
            }
        }

        private void addEdge(int v, int w) {}

        private List<Integer> adj(int v) {
            return null;
        }
    }
}
