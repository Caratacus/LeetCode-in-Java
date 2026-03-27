package g1501_1600.s1568_minimum_number_of_days_to_disconnect_island;

// #Hard #Array #Depth_First_Search #Breadth_First_Search #Matrix #Strongly_Connected_Component
// #2022_04_11_Time_1_ms_(100.00%)_Space_41.8_MB_(91.49%)

import java.util.List;

@SuppressWarnings("java:S107")
public class Solution {

    private final int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public int minDays(int[][] grid) {
        return 0;
    }

    private void tarjan(
            int x,
            int y,
            int prex,
            int prey,
            int time,
            int[][] times,
            int[][] lows,
            int[][] grid,
            List<Integer> articulationPoints,
            int color,
            int[] islandSize) {}
}
