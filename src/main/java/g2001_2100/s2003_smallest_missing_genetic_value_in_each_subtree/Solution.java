package g2001_2100.s2003_smallest_missing_genetic_value_in_each_subtree;

// #Hard #Dynamic_Programming #Depth_First_Search #Tree #Union_Find
// #2022_05_22_Time_126_ms_(85.18%)_Space_154.3_MB_(66.67%)

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int[] smallestMissingValueSubtree(int[] parents, int[] nums) {
        return null;
    }

    private void solve(Node root, int[] ans, UF uf) {}

    private static class Node {
        int idx;
        int val;
        List<Node> nodes;

        Node(int idx, int val) {
            this.idx = idx;
            this.val = val;
            nodes = new ArrayList<>();
        }
    }

    private static class UF {
        int[] rank;
        int[] parent;

        UF(int n, int[] nums) {
            rank = new int[n];
            parent = new int[n];
            for (int m : nums) {
                parent[m] = m;
            }
        }

        private int find(int x) {
            return 0;
        }

        private void union(int x, int y) {}

        private boolean isConnected(int x, int y) {
            return false;
        }
    }
}
