package g1301_1400.s1368_minimum_cost_to_make_at_least_one_valid_path_in_a_grid;

// #Hard #Array #Breadth_First_Search #Matrix #Heap_Priority_Queue #Graph #Shortest_Path
// #2022_03_21_Time_8_ms_(99.38%)_Space_42.6_MB_(88.85%)

import java.util.Queue;

public class Solution {

    private final int[][] dir = new int[][] {{0, 0}, {0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public int minCost(int[][] grid) {
        return 0;
    }

    private void addAllTheNodeInRange(
            int x, int y, int[][] grid, Queue<Pair> queue, int[][] visited) {}

    private static class Pair {
        int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
