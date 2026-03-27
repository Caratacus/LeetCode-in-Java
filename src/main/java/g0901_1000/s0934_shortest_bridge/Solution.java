package g0901_1000.s0934_shortest_bridge;

// #Medium #Array #Depth_First_Search #Breadth_First_Search #Matrix
// #Graph_Theory_I_Day_6_Matrix_Related_Problems
// #2022_03_30_Time_6_ms_(97.87%)_Space_42.8_MB_(86.98%)

import java.util.ArrayDeque;

public class Solution {

    private static class Pair {
        int x;
        int y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private int[][] dirs = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

    public int shortestBridge(int[][] grid) {
        return 0;
    }

    private void dfs(int[][] grid, int row, int col, boolean[][] visited, ArrayDeque<Pair> q) {}
}
